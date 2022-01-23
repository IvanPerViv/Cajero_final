/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author rober
 */
public class Proper {

    public String rutaProperties = "./src/main/java/Main/config.properties";
    public String url = cargaProperties("url");
    public String bbdd = cargaProperties("bbddname");
    public String user = cargaProperties("username");
    public String pass = cargaProperties("pass");

    protected String cargaProperties(String valueProperties) {
        java.util.Properties prop = new java.util.Properties();
        String valor = "";
        try (FileInputStream input = new FileInputStream(rutaProperties)) {
            prop.load(input);
            valor = prop.getProperty(valueProperties);

        } catch (IOException ex) {
            System.err.println("No se pudo abrir el fichero de properties");
        }
        return valor;
    }
}
