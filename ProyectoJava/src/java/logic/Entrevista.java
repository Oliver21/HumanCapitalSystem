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
public class Entrevista {

    public Candidato getCandCandidato() {
        return candCandidato;
    }

    public void setCandCandidato(Candidato candCandidato) {
        this.candCandidato = candCandidato;
    }

    public Empleado getEmpEmpleado() {
        return empEmpleado;
    }

    public void setEmpEmpleado(Empleado empEmpleado) {
        this.empEmpleado = empEmpleado;
    }

    public String getsFecha() {
        return sFecha;
    }

    public void setsFecha(String sFecha) {
        this.sFecha = sFecha;
    }

    public String getsPlataforma() {
        return sPlataforma;
    }

    public void setsPlataforma(String sPlataforma) {
        this.sPlataforma = sPlataforma;
    }

    public String getsFeedback() {
        return sFeedback;
    }

    public void setsFeedback(String sFeedback) {
        this.sFeedback = sFeedback;
    }

    public Entrevista() {
        this.candCandidato = null;
        this.empEmpleado = null;
        this.sFecha = "";
        this.sPlataforma = "";
        this.sFeedback = "";
    }
    
    private Candidato candCandidato;
    private Empleado empEmpleado;
    private String sFecha;
    private String sPlataforma;
    private String sFeedback;
    
}
