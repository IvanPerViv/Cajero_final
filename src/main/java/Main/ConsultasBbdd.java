/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultasBbdd {

    private Connection con;
    private PreparedStatement pst;
    private Proper prop;

    public ConsultasBbdd() {
        //CONEXION A LA BASE DE DATOS MEDIANTE PROPERTIES
        prop = new Proper();
        try {
            con = DriverManager.getConnection(prop.url + prop.bbdd, prop.user, prop.pass);
        } catch (SQLException ex) {
            System.err.println("Fallo en la BBDD" + ex.toString());
        }
    }

    public ArrayList<String> infoCliente(String nif) {
        String queryCliente = "SELECT * FROM cliente WHERE nif = ?";
        ArrayList<String> infoList = new ArrayList<>();
        try {
            pst = con.prepareStatement(queryCliente);
            String numeroNif = nif;
            pst.setString(1, numeroNif);

            //Con el NIF del cliente sacamos el resto de info del mismo(nombre, apellidos...)
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    //Creamos un array donde guardamos los datos del cliente.
                    infoList.add(rs.getString(1)); //NIF
                    infoList.add(rs.getString(2)); //Nombre
                    infoList.add(rs.getString(3)); //Apellidos
                    infoList.add(rs.getString(4)); //Email
                }
            } catch (SQLException ex) {
                System.err.println("Error al ejecutar la consulta!!" + ex.toString());
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta!!" + ex.toString());
        }
        return infoList;
    }

    public Cuenta getCuentaTarjeta(String numeroTarjeta) {
        String queryCuentaCliente = "SELECT num_cuenta FROM tarjeta WHERE num_tarjeta = ?";
        Cuenta objCuenta = new Cuenta();
        try {
            pst = con.prepareStatement(queryCuentaCliente);
            //String numTar = numeroTarjeta;
            pst.setString(1, numeroTarjeta);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String queryCuenta = "SELECT * FROM cuenta WHERE num_cuenta = ?";
                    pst = con.prepareStatement(queryCuenta);
                    String numeroCuenta = rs.getString(1); //num_cuenta

                    pst.setString(1, numeroCuenta);
                    try (ResultSet rs2 = pst.executeQuery()) {
                        if (rs2.next()) {
                            objCuenta.setNumero(numeroCuenta);
                            double saldoCuenta = rs2.getDouble(2);
                            objCuenta.setSaldo(saldoCuenta);

                        }
                    } catch (SQLException ex) {
                        System.err.println("Error al ejecutar la consulta!!" + ex.toString());
                    }
                }
            } catch (SQLException ex) {
                System.err.println("Error al ejecutar la consulta!!" + ex.toString());
            }
        } catch (SQLException ex) {
            System.err.println("Error en la conexion de la BBDD" + ex.toString());
        }
        return objCuenta;
    }

    public Tarjeta getTarjeta(String numeroTarjeta) {
        String queryTarjeta = "SELECT * FROM tarjeta where num_tarjeta = ?";
        Tarjeta objTarjeta = null;
        try {
            pst = con.prepareStatement(queryTarjeta);
            pst.setString(1, numeroTarjeta);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String cvs = rs.getString(2);
                    Date fecha_cad = rs.getDate(4);
                    objTarjeta = new Tarjeta(numeroTarjeta, cvs, fecha_cad);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta!!" + ex.toString());
        }
        return objTarjeta;
    }

    public boolean retirarDinero(double dineroSacar, Cuenta cuenta) {
        int comprobacion = 0;
        if (cuenta.getSaldo() >= dineroSacar) {
            String queryUpd = "UPDATE cuenta SET saldo = saldo - ? WHERE num_cuenta = ? ";
            try {
                pst = con.prepareStatement(queryUpd);
                pst.setDouble(1, dineroSacar);
                pst.setString(2, cuenta.getNumero());
                comprobacion = pst.executeUpdate(); //devuelve el num de registros actualizado.
            } catch (SQLException ex) {
                System.err.println("Error al ejecutar la consulta!!" + ex.toString());
            }
        }
        return comprobacion > 0;
    }

    public boolean ingresarDinero(double dineroIngresar, Cuenta cuenta) {
        int comprobacion = 0;
        String queryUpd = "UPDATE cuenta SET saldo = saldo + ? WHERE num_cuenta = ? ";
        try {
            pst = con.prepareStatement(queryUpd);
            pst.setDouble(1, dineroIngresar);
            pst.setString(2, cuenta.getNumero());
            comprobacion = pst.executeUpdate(); //devuelve el num de registros actualizado.
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta!!" + ex.toString());
        }

        return comprobacion > 0;
    }
}
