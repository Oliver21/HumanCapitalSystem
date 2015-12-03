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
public class Candidato {

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

    public Candidato() {
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
    }
    
    public String sDescripcionAHTML(){
        String msg = "";
        msg+="<td>" + this.sNombreCompleto + "</td>";
        msg+="<td>" + this.sDomicilio + "</td>";
        msg+="<td>" + this.sTelefono + "</td>";
        msg+="<td>" + this.sCorreoElectronico + "</td>";
        msg+="<td>" + this.sTituloProfesional + "</td>";
        msg+="<td>" + this.sUniversidad + "</td>";
        msg+="<td>" + this.sCertificados + "</td>";
        msg+="<td>" + this.sTrabajosAnteriores + "</td>";
        msg+="<td>" + this.sExpectativas  + "</td>";;
        
        
        return msg;
    }
    
}
