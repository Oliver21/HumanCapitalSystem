/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Tony
 */
public class ReporteFiltro {
    private String sTitulo;
    private String sUniversidad;
    private String sCertificados;
    private String sEmpleado;
    private String sPuesto;

    public ReporteFiltro(String sTitulo, String sUniversidad, String sCertificados, String sEmpleado, String sPuesto) {
        this.sTitulo = sTitulo;
        this.sUniversidad = sUniversidad;
        this.sCertificados = sCertificados;
        this.sEmpleado = sEmpleado;
        this.sPuesto = sPuesto;
    }

    public String getsTitulo() {
        return sTitulo;
    }

    public void setsTitulo(String sTitulo) {
        this.sTitulo = sTitulo;
    }

    public String getsUniversidad() {
        return sUniversidad;
    }

    public void setsUniversidad(String sUniversidad) {
        this.sUniversidad = sUniversidad;
    }

    public String getsCertificados() {
        return sCertificados;
    }

    public void setsCertificados(String sCertificados) {
        this.sCertificados = sCertificados;
    }

    public String getsEmpleado() {
        return sEmpleado;
    }

    public void setsEmpleado(String sEmpleado) {
        this.sEmpleado = sEmpleado;
    }

    public String getsPuesto() {
        return sPuesto;
    }

    public void setsPuesto(String sPuesto) {
        this.sPuesto = sPuesto;
    }
    
    
}
