/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jdt.internal.compiler.lookup.TypeConstants;

/**
 *
 * @author ProgAva
 */
public class DBHandler {

    static Connection con = null;

    public DBHandler() {

        try {
            String url = "jdbc:mysql://localhost:3306/humancapital?zeroDateTimeBehavior=convertToNull";
            con = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void insertarCandidato(Candidato cand) {
        try {
            Statement st = con.createStatement();
            String sql;
            sql = "insert into candidatos (nombre, domicilio, telefono, email, tituloprofesional, universidad, "
                    + "certificados, trabajosanteriores, expectativaseconomicas) values('";

            sql += cand.getsNombreCompleto() + "', '" + cand.getsDomicilio() + "', '" + cand.getsTelefono() + "', '"
                    + cand.getsCorreoElectronico() + "', '" + cand.getsTituloProfesional() + "', '"
                    + cand.getsUniversidad() + "', '" + cand.getsCertificados() + "', '" + cand.getsTrabajosAnteriores()
                    + "', '" + cand.getsExpectativas() + "')";
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Candidato> obtenerCandidatos() {
        ArrayList<Candidato> arrCands = new ArrayList<Candidato>();

        try {
            Statement st = con.createStatement();
            String sql;
            sql = "SELECT * FROM candidatos";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Candidato cand = new Candidato();
                cand.setsID(rs.getString("candidatoid"));
                cand.setsNombreCompleto(rs.getString("nombre"));
                cand.setsDomicilio(rs.getString("domicilio"));
                cand.setsTelefono(rs.getString("telefono"));
                cand.setsCorreoElectronico(rs.getString("email"));
                cand.setsTituloProfesional(rs.getString("tituloprofesional"));
                cand.setsUniversidad(rs.getString("universidad"));
                cand.setsCertificados(rs.getString("certificados"));
                cand.setsTrabajosAnteriores(rs.getString("trabajosanteriores"));
                cand.setsExpectativas(rs.getString("expectativaseconomicas"));

                arrCands.add(cand);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrCands;
    }

    public static Candidato obtenerCandidato(String sId) {
        Candidato cand = null;

        try {
            Statement st = con.createStatement();
            String sql;
            sql = "SELECT * FROM candidatos WHERE candidatoid = '";
            sql += sId + "'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                cand = new Candidato();
                cand.setsID(rs.getString("candidatoid"));
                cand.setsNombreCompleto(rs.getString("nombre"));
                cand.setsDomicilio(rs.getString("domicilio"));
                cand.setsTelefono(rs.getString("telefono"));
                cand.setsCorreoElectronico(rs.getString("email"));
                cand.setsTituloProfesional(rs.getString("tituloprofesional"));
                cand.setsUniversidad(rs.getString("universidad"));
                cand.setsCertificados(rs.getString("certificados"));
                cand.setsTrabajosAnteriores(rs.getString("trabajosanteriores"));
                cand.setsExpectativas(rs.getString("expectativaseconomicas"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cand;
    }

    public static void eliminaCandidato(String sId) {
        try {
            Statement st = con.createStatement();
            String sql;
            sql = "DELETE FROM candidatos WHERE candidatoid = '";
            sql += sId + "'";
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void modificaCandidato(Candidato cand) {
        try {
            Statement st = con.createStatement();
            String sql;
            sql = "UPDATE candidatos SET ";
            sql += "nombre='" + cand.getsNombreCompleto() + "', ";
            sql += "domicilio='" + cand.getsDomicilio()+ "', ";
            sql += "telefono='" + cand.getsTelefono()+ "', ";
            sql += "email='" + cand.getsCorreoElectronico()+ "', ";
            sql += "tituloprofesional='" + cand.getsTituloProfesional()+ "', ";
            sql += "universidad='" + cand.getsUniversidad()+ "', ";
            sql += "certificados='" + cand.getsCertificados()+ "', ";
            sql += "trabajosanteriores='" + cand.getsTrabajosAnteriores()+ "', ";
            sql += "expectativaseconomicas='" + cand.getsExpectativas()+ "' ";
            sql += "WHERE candidatoid = " + cand.getsID();
            
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Empleado> obtenerEmpleados() {
        ArrayList<Empleado> arrEmps = new ArrayList<Empleado>();

        try {
            Statement st = con.createStatement();
            String sql;
            sql = "SELECT * FROM empleados";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Empleado emp = new Empleado();
                emp.setsID(rs.getString("empleadoid"));
                emp.setsNombreCompleto(rs.getString("nombre"));
                emp.setsDomicilio(rs.getString("domicilio"));
                emp.setsTelefono(rs.getString("telefono"));
                emp.setsCorreoElectronico(rs.getString("email"));
                emp.setsTituloProfesional(rs.getString("tituloprofesional"));
                emp.setsUniversidad(rs.getString("universidad"));
                emp.setsCertificados(rs.getString("certificados"));
                emp.setsTrabajosAnteriores(rs.getString("trabajosanteriores"));
                emp.setsExpectativas(rs.getString("expectativaseconomicas"));
                emp.setsPuesto(rs.getString("puesto"));
                emp.setsSalario(rs.getString("salario"));
                emp.setsDiasVacaciones(rs.getString("diasvacaciones"));

                arrEmps.add(emp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrEmps;
    }

    public static void insertarEmpleado(Empleado emp) {
        try {
            Statement st = con.createStatement();
            String sql;
            sql = "insert into empleados (nombre, domicilio, telefono, email, tituloprofesional, universidad, "
                    + "certificados, trabajosanteriores, expectativaseconomicas, puesto, salario, diasvacaciones) values('";

            sql += emp.getsNombreCompleto() + "', '" + emp.getsDomicilio() + "', '" + emp.getsTelefono() + "', '"
                    + emp.getsCorreoElectronico() + "', '" + emp.getsTituloProfesional() + "', '"
                    + emp.getsUniversidad() + "', '" + emp.getsCertificados() + "', '" + emp.getsTrabajosAnteriores()
                    + "', '" + emp.getsExpectativas() + "', '" + emp.getsPuesto() + "', '" + emp.getsSalario() + "', '" + emp.getsDiasVacaciones() + "')";
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Empleado obtenerEmpleado(String sId) {
        Empleado emp = null;

        try {
            Statement st = con.createStatement();
            String sql;
            sql = "SELECT * FROM empleados WHERE empleadoid = '";
            sql += sId + "'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                emp = new Empleado();
                emp.setsID(rs.getString("empleadoid"));
                emp.setsNombreCompleto(rs.getString("nombre"));
                emp.setsDomicilio(rs.getString("domicilio"));
                emp.setsTelefono(rs.getString("telefono"));
                emp.setsCorreoElectronico(rs.getString("email"));
                emp.setsTituloProfesional(rs.getString("tituloprofesional"));
                emp.setsUniversidad(rs.getString("universidad"));
                emp.setsCertificados(rs.getString("certificados"));
                emp.setsTrabajosAnteriores(rs.getString("trabajosanteriores"));
                emp.setsExpectativas(rs.getString("expectativaseconomicas"));
                emp.setsPuesto(rs.getString("puesto"));
                emp.setsSalario(rs.getString("salario"));
                emp.setsDiasVacaciones(rs.getString("diasvacaciones"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return emp;
    }
    
}
