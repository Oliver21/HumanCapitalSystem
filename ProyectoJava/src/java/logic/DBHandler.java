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
    
    public static void modificaEmpleado(Empleado emp) {
        try {
            Statement st = con.createStatement();
            String sql;
            sql = "UPDATE empleados SET ";
            sql += "nombre='" + emp.getsNombreCompleto() + "', ";
            sql += "domicilio='" + emp.getsDomicilio()+ "', ";
            sql += "telefono='" + emp.getsTelefono()+ "', ";
            sql += "email='" + emp.getsCorreoElectronico()+ "', ";
            sql += "tituloprofesional='" + emp.getsTituloProfesional()+ "', ";
            sql += "universidad='" + emp.getsUniversidad()+ "', ";
            sql += "certificados='" + emp.getsCertificados()+ "', ";
            sql += "trabajosanteriores='" + emp.getsTrabajosAnteriores()+ "', ";
            sql += "expectativaseconomicas='" + emp.getsExpectativas()+ "' , ";
            sql += "puesto='" + emp.getsPuesto()+ "' , ";
            sql += "salario='" + emp.getsSalario()+ "' , ";
            sql += "diasvacaciones='" + emp.getsDiasVacaciones()+ "' ";
            sql += "WHERE empleadoid = " + emp.getsID();
            
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void eliminaEmpleado(String sId) {
        try {
            Statement st = con.createStatement();
            String sql;
            sql = "DELETE FROM empleados WHERE empleadoid = '";
            sql += sId + "'";
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean validarSesion(String usuario, String password){
        boolean bSuccess = false;
        
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM usuarios WHERE username = '";
            sql += usuario;
            sql += "'";
            ResultSet rs = st.executeQuery(sql);
            String sPassword = "";

            while (rs.next()) {
                sPassword = rs.getString("password");
            }

            if (!sPassword.isEmpty()) {
                if(sPassword.equals(password)){
                    return true;
                }
            }
            
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bSuccess;
    }
    
    public static ArrayList<Entrevista> obtenerEntrevistas() {
        ArrayList<Entrevista> arrEnts = new ArrayList<Entrevista>();

        try {
            Statement st = con.createStatement();
            String sql;
            sql = "SELECT * FROM entrevistas";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Entrevista ent = new Entrevista();
                
                String sCandidatoID = rs.getString("entrevistado");
                Candidato cand = obtenerCandidato(sCandidatoID);
                ent.setCandCandidato(cand);
                
                String sEmpleadoID = rs.getString("entrevistador");
                Empleado emp = obtenerEmpleado(sEmpleadoID);
                ent.setEmpEmpleado(emp);
                
                ent.setsPlataforma(rs.getString("plataforma"));
                ent.setsFecha(rs.getString("fecha"));
                ent.setsFeedback(rs.getString("feedback"));

                if(cand != null && emp != null)
                arrEnts.add(ent);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrEnts;
    }
    
    public static Entrevista obtenerEntrevista(String sEmpID, String sCandID, String sFechaID, String sFeedback) {
        Entrevista ent = null;

        try {
            Statement st = con.createStatement();
            String sql;
            sql = "SELECT * FROM entrevistas WHERE entrevistador = '";
            sql += sEmpID + "' AND entrevistado = '" + sCandID + "' AND fecha = '" + sFechaID + "'"; //";
            //sql += "AND feedback = '" + sFeedback + "'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                ent = new Entrevista();

                String sCandidatoID = rs.getString("entrevistado");
                Candidato cand = obtenerCandidato(sCandidatoID);
                ent.setCandCandidato(cand);
                
                String sEmpleadoID = rs.getString("entrevistador");
                Empleado emp = obtenerEmpleado(sEmpleadoID);
                ent.setEmpEmpleado(emp);
                
                ent.setsFecha(rs.getString("fecha"));
                ent.setsPlataforma(rs.getString("plataforma"));
                ent.setsFeedback(rs.getString("feedback"));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ent;
    }
    
    public static void insertarEntrevista(Entrevista ent, String sEntrevistador, String sEntrevistado) {
        try {
            Statement st = con.createStatement();
            String sql;
            sql = "insert into entrevistas (fecha, entrevistador, entrevistado, plataforma, feedback) values('";

            sql += ent.getsFecha() + "', '" + sEntrevistador + "', '" + sEntrevistado + "', '" + ent.getsPlataforma() + "', '"  ;
            sql += ent.getsFeedback() + "')";
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void eliminaEntrevista(String sEmpID, String sCandID, String sFecha, String sFeedback) {
        try {
            Statement st = con.createStatement();
            String sql;
            sql = "DELETE FROM entrevistas WHERE entrevistador = '";
            sql += sEmpID + "' AND entrevistado = '" + sCandID + "' AND fecha = '";
            sql += sFecha + "' AND feedback = '" + sFeedback + "'";
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void registrarSesion(String username, String password) {
        try {
            Statement st = con.createStatement();
            String sql;
            sql = "insert into usuarios (username, password) values('";
            sql += username + "', '" + password + "')";
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void modificaEntrevista(Entrevista ent, String sEmpID, String sCandID, String oeID, String ocID, String ofechaID, String ofeedID) {
        try {
            Statement st = con.createStatement();
            String sql;
            sql = "UPDATE entrevistas SET ";
            sql += "fecha='" + ent.getsFecha() + "', ";
            sql += "entrevistador='" + sEmpID + "', ";
            sql += "entrevistado='" + sCandID + "', ";
            sql += "plataforma='" + ent.getsPlataforma() + "', ";
            sql += "feedback='" + ent.getsFeedback() + "' ";

            sql += "WHERE entrevistador = '" + oeID + "' AND ";
            sql += "entrevistado = '" + ocID + "' AND ";
            sql += "fecha = '" + ofechaID + "' AND ";
            sql += "feedback = '" + ofeedID + "'";
            
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Entrevista> obtenerFiltroCandidatos(ReporteFiltro rf){
        ArrayList<Entrevista> arrEntsFilt = new ArrayList<Entrevista>();
        ArrayList<Entrevista> total = obtenerEntrevistas();
        
        for(int i = 0; i < total.size(); i++){
            Entrevista ent = total.get(i);
            
            boolean bTitulo = true;
            if(!rf.getsTitulo().isEmpty()){
                bTitulo = (!(!ent.getCandCandidato().getsTituloProfesional().toLowerCase().contains(rf.getsTitulo().toLowerCase())));
            }
            
            boolean bUniversidad = true;
            if(!rf.getsUniversidad().isEmpty()){
                bUniversidad = (!(!ent.getCandCandidato().getsUniversidad().toLowerCase().contains(rf.getsUniversidad().toLowerCase())));
            }
            
            boolean bCertificados = true;
            if(!rf.getsCertificados().isEmpty()){
                bCertificados = (!(!ent.getCandCandidato().getsCertificados().toLowerCase().contains(rf.getsCertificados().toLowerCase())));
            }
            
            boolean bEntrevistador = true;
            if(!rf.getsEmpleado().equals("CONST_BLANK")){
                bEntrevistador = (rf.getsEmpleado().equals(ent.getEmpEmpleado().getsID()));
            }
            
            if(bTitulo && bUniversidad && bCertificados && bEntrevistador){
                arrEntsFilt.add(ent);
            }
            
        }
        
        
        return arrEntsFilt;
    }
    
    public static ArrayList<Entrevista> obtenerFiltroEmpleados(ReporteFiltro rf){
        ArrayList<Entrevista> arrEntsFilt = new ArrayList<Entrevista>();
        ArrayList<Entrevista> total = obtenerEntrevistas();
        
        for(int i = 0; i < total.size(); i++){
            Entrevista ent = total.get(i);
            
            boolean bTitulo = true;
            if(!rf.getsTitulo().isEmpty()){
                bTitulo = (!(!ent.getEmpEmpleado().getsTituloProfesional().toLowerCase().contains(rf.getsTitulo().toLowerCase())));
            }
            
            boolean bUniversidad = true;
            if(!rf.getsUniversidad().isEmpty()){
                bUniversidad = (!(!ent.getEmpEmpleado().getsUniversidad().toLowerCase().contains(rf.getsUniversidad().toLowerCase())));
            }
            
            boolean bCertificados = true;
            if(!rf.getsCertificados().isEmpty()){
                bCertificados = (!(!ent.getEmpEmpleado().getsCertificados().toLowerCase().contains(rf.getsCertificados().toLowerCase())));
            }
            
            boolean bEntrevistador = true;
            if(!rf.getsEmpleado().equals("CONST_BLANK")){
                bEntrevistador = (rf.getsEmpleado().equals(ent.getEmpEmpleado().getsID()));
            }
            
            boolean bPuesto = true;
            if(!rf.getsPuesto().isEmpty()){
                bPuesto = (!(!ent.getEmpEmpleado().getsPuesto().toLowerCase().contains(rf.getsPuesto().toLowerCase())));
            }
            
            if(bTitulo && bUniversidad && bCertificados && bEntrevistador && bPuesto){
                arrEntsFilt.add(ent);
            }
            
        }
        
        
        return arrEntsFilt;
    }
    
}
