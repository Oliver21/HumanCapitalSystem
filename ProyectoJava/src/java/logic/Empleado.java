package logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tony
 */
public class Empleado {

    private String sID;
    private String sNombreCompleto;
    private String sDomicilio;
    private String sTelefono;
    private String sCorreoElectronico;
    private String sTituloProfesional;
    private String sUniversidad;
    private String sCertificados;
    private String sTrabajosAnteriores;
    private String sExpectativas;
    private String sPuesto;
    private String sSalario;
    private String sDiasVacaciones;

    public String getsNombreCompleto() {
        return sNombreCompleto;
    }

    public void setsNombreCompleto(String sNombreCompleto) {
        this.sNombreCompleto = sNombreCompleto;
    }

    public String getsDomicilio() {
        return sDomicilio;
    }

    public void setsDomicilio(String sDomicilio) {
        this.sDomicilio = sDomicilio;
    }

    public String getsTelefono() {
        return sTelefono;
    }

    public void setsTelefono(String sTelefono) {
        this.sTelefono = sTelefono;
    }

    public String getsCorreoElectronico() {
        return sCorreoElectronico;
    }

    public void setsCorreoElectronico(String sCorreoElectronico) {
        this.sCorreoElectronico = sCorreoElectronico;
    }

    public String getsTituloProfesional() {
        return sTituloProfesional;
    }

    public void setsTituloProfesional(String sTituloProfesional) {
        this.sTituloProfesional = sTituloProfesional;
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

    public String getsTrabajosAnteriores() {
        return sTrabajosAnteriores;
    }

    public void setsTrabajosAnteriores(String sTrabajosAnteriores) {
        this.sTrabajosAnteriores = sTrabajosAnteriores;
    }

    public String getsExpectativas() {
        return sExpectativas;
    }

    public void setsExpectativas(String sExpectativas) {
        this.sExpectativas = sExpectativas;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsPuesto() {
        return sPuesto;
    }

    public void setsPuesto(String sPuesto) {
        this.sPuesto = sPuesto;
    }

    public String getsSalario() {
        return sSalario;
    }

    public void setsSalario(String sSalario) {
        this.sSalario = sSalario;
    }

    public String getsDiasVacaciones() {
        return sDiasVacaciones;
    }

    public void setsDiasVacaciones(String sDiasVacaciones) {
        this.sDiasVacaciones = sDiasVacaciones;
    }

    public Empleado() {
        this.sID = "NA";
        this.sNombreCompleto = "";
        this.sDomicilio = "";
        this.sTelefono = "";
        this.sCorreoElectronico = "";
        this.sTituloProfesional = "";
        this.sUniversidad = "";
        this.sCertificados = "";
        this.sTrabajosAnteriores = "";
        this.sExpectativas = "";
        this.sPuesto = "";
        this.sSalario = "";
        this.sDiasVacaciones = "";
    }

}
