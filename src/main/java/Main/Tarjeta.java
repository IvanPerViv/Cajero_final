package Main;

import java.util.Date;

public class Tarjeta {
    String numero_tarjeta, CVS;
    Date fecha_cad;

    public Tarjeta (String numTarjeta, String cvs, Date fechaCad){
        numero_tarjeta = numTarjeta;
        CVS = cvs;
        fecha_cad = fechaCad;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }
    
    public void setCVS(String CVS) {
        this.CVS = CVS;
    }

    public String getCVS() {
        return CVS;
    }

    public void setFecha_cad(Date fecha_cad) {
        this.fecha_cad = fecha_cad;
    }
    public Date getFecha_cad() {
        return fecha_cad;
    }
}
