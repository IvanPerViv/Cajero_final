/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class Cliente {
    protected String nif;
    protected String nombre;
    protected String apellidos;
    protected String email;
    protected Cuenta cuentasUsuario;
    protected Tarjeta tarjetasUsuario;
    protected ConsultasBbdd cbbdd = new ConsultasBbdd();

    public Cliente(String nif) {
        this.nif = nif;
        ArrayList<String> infoCl = cbbdd.infoCliente(nif);
        this.nombre = infoCl.get(1); //nombre
        this.apellidos = infoCl.get(2); //apellidos
        this.email = infoCl.get(3); //email
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
