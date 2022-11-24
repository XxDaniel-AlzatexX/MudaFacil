package Control;

<<<<<<< HEAD
import com.sun.source.tree.ReturnTree;

import javax.imageio.stream.IIOByteBuffer;
import javax.swing.plaf.nimbus.State;
import java.io.IOException;
import java.sql.*;
=======
import Entity.Mudanza;

import java.sql.*;
import java.util.ArrayList;
>>>>>>> 4aa81a9 (Proyecto subido)
import java.util.Objects;

public class ControllerDB {

<<<<<<< HEAD
    public Connection test_conexion;
    String driver = "com..mysqlcj.jdbc.Driver";
    String user = "root";
    String password = "TomaS007!";
    String url = "jdbc:mysql://localhost:3306/MudaFacil_DB?serverTimezone=UTC";
=======
    public static Connection test_conexion;
    String driver = "com.mysql.cj.jdbc.Driver";
    static String  user = "root";
    static String password = "ingesoft2003";
    static String url = "jdbc:mysql://localhost:3306/mudafacil_db?serverTimezone=UTC";
>>>>>>> 4aa81a9 (Proyecto subido)

    public ControllerDB() throws SQLException {
    }

    public Connection getConnection() {
        try {
            test_conexion = DriverManager.getConnection(url, user, password);
            if (test_conexion != null) {
                System.out.println("Conexion realizada con exito");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return test_conexion;
    }

    public boolean validarusuario(String Nombre, String Contra) throws SQLException, ClassNotFoundException {
        Boolean Existe = false;
        try {
            test_conexion = DriverManager.getConnection(url, user, password);
            if (test_conexion != null) {
                System.out.println("Conexion realizada con exito");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Statement statement = test_conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT nombre_usuario, contra FROM USUARIO");
        while (rs.next()) {
            String var1 = rs.getString(1);
            String var2 = rs.getString(2);
            if (Objects.equals(var1, Nombre) && Objects.equals(var2, Contra) && !Existe) {
                Existe = true;
            }
        }
        return Existe;
    }


    // BUSCAR EL TIPO DE CUENTA DE UN USUARIO
    public String BuscarTCuenta(String NombU, String Contrase) throws SQLException, ClassNotFoundException {
        String Cuenta = null;

        try {
            test_conexion = DriverManager.getConnection(url, user, password);
            if (test_conexion != null) {
                System.out.println("Conexion realizada con exito");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Statement statement = test_conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT nombre_usuario, contra, tipo_cuenta FROM USUARIO");
        while(rs.next()){
            String var1 = rs.getString(1 );
            String var2 = rs.getString(2);
            String var3 = rs.getString(3);
            if (Objects.equals(var1, NombU) && Objects.equals(var2, Contrase)) {
                Cuenta = var3;
            }
        }

        return Cuenta;
    }


    // VALIDAR QUE LAS ID NO SE REPITAN EN LA CREACION DE UNA CUENTA
    public boolean validarRegistroCedula (int cedula) throws SQLException {
        boolean bandera = false;
        int Ced;

        try {
            test_conexion = DriverManager.getConnection(url, user, password);
            if (test_conexion != null) {
                System.out.println("Conexion realizada con exito");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Statement statement = test_conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT id FROM USUARIO");

        while(rs.next()){
            String var1 = rs.getString(1);
            Ced = Integer.parseInt(var1);

            if(cedula == Ced){
                bandera = true;
            }
        }
        return bandera;
    }

    // SUBIR UNA NUEVA CUENTA A LA BASE DE DATOS
    public void agregarusuario (String Nomb, int Id, String Contra, String NombU, String Cell, String FechaN, String TCuenta) throws SQLException, ClassNotFoundException {

        try {
            test_conexion = DriverManager.getConnection(url, user, password);
            if (test_conexion != null) {
                System.out.println("Conexion realizada con exito SUBIR DATOS");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        PreparedStatement Datos = test_conexion.prepareStatement("insert into USUARIO values (?,?,?,?,?,?,?)");

        Datos.setString(1,Nomb);
        Datos.setString(2, String.valueOf(Id));
        Datos.setString(3,Contra);
        Datos.setString(4,NombU);
        Datos.setString(5,Cell);
        Datos.setString(6,FechaN);
        Datos.setString(7,TCuenta);
        Datos.executeUpdate();

    }

    public String BuscarIDUsuario (String NombU, String Contrase) throws SQLException, ClassNotFoundException {
        String id = null;

        try {
            test_conexion = DriverManager.getConnection(url, user, password);
            if (test_conexion != null) {
                System.out.println("Conexion realizada con exito");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Statement statement = test_conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT nombre_usuario, contra, id FROM USUARIO");
        while(rs.next()){
            String var1 = rs.getString(1 );
            String var2 = rs.getString(2);
            String var3 = rs.getString(3);
            if (Objects.equals(var1, NombU) && Objects.equals(var2, Contrase)) {
                id = var3;
            }
        }
        return id;
    }

    public void agregarMudanza (int id, int Persona, String DPartida, String DLlegada, String Fecha, String Hora) throws SQLException, ClassNotFoundException {

        String Identificador = String.valueOf(id);
        String Perso = String.valueOf(Persona);
        int x = 0;

        System.out.println(Identificador + " / " + Perso);

        try {
            test_conexion = DriverManager.getConnection(url, user, password);
            if (test_conexion != null) {
                System.out.println("Conexion realizada con exito SUBIR DATOS");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

<<<<<<< HEAD
        PreparedStatement Datos = test_conexion.prepareStatement("insert into MUDANZA values (?,?,?,?,?,?,?,?,?,?)");
=======
        PreparedStatement Datos = test_conexion.prepareStatement("insert into MUDANZA values (?,?,?,?,?,?,?,?,?,?,?)");
>>>>>>> 4aa81a9 (Proyecto subido)

        Datos.setString(1,Identificador);
        Datos.setString(2, Perso);
        Datos.setString(3, String.valueOf(x));
        Datos.setString(4, String.valueOf(x));
        Datos.setString(5, String.valueOf(x));
<<<<<<< HEAD
        Datos.setString(6,DPartida);
        Datos.setString(7,DLlegada);
        Datos.setString(8,Fecha);
        Datos.setString(9,Hora);
        Datos.setString(10, String.valueOf(x));
=======
        Datos.setString(6, DPartida);
        Datos.setString(7, DLlegada);
        Datos.setString(8, String.valueOf(x));
        Datos.setString(9, Fecha);
        Datos.setString(10, Hora);
        Datos.setString(11, String.valueOf(x));
>>>>>>> 4aa81a9 (Proyecto subido)
        Datos.executeUpdate();
    }

        public void agregarArticuloMudanza(String nombreArticulo, int largo, int ancho, int alto, int peso, int ID) throws SQLException {

            System.out.println("Datos: "+ nombreArticulo + largo + ancho + alto + peso + ID);

            try {
                test_conexion = DriverManager.getConnection(url, user, password);
                if (test_conexion != null) {
                    System.out.println("Conexion realizada con exito SUBIR DATOS");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            PreparedStatement Datos = test_conexion.prepareStatement("insert into ARTICULOSMUDANZA values (?,?,?,?,?,?)");

            Datos.setString(1,nombreArticulo);
            Datos.setString(2, String.valueOf(largo));
            Datos.setString(3, String.valueOf(ancho));
            Datos.setString(4, String.valueOf(alto));
            Datos.setString(5, String.valueOf(peso));
            Datos.setString(6, String.valueOf(ID));
            Datos.executeUpdate();

    }

    public boolean VerificarMudanza (String IdMudanza) throws SQLException {

        boolean bandera = false;

        try {
            test_conexion = DriverManager.getConnection(url, user, password);
            if (test_conexion != null) {
                System.out.println("Conexion realizada con exito");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Statement statement = test_conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Id FROM mudanza");

        while(rs.next()){
            String var1 = rs.getString(1 );
            if (Objects.equals(var1, IdMudanza)) {
                bandera = true;
            }
        }
        return bandera;
    }
<<<<<<< HEAD
=======
    public static int getCedula (String usuario) throws SQLException{
        int cedula=0;
        try {
            test_conexion = DriverManager.getConnection(url, user, password);
            if (test_conexion != null) {
                System.out.println("Conexion realizada con exito SUBIR DATOS");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Statement statement = test_conexion.createStatement();
        ResultSet rs = statement.executeQuery(("SELECT nombre_usuario,Id FROM USUARIO"));
        System.out.println("entra");
        while(rs.next()){
            System.out.println("entra");
            String var1 = rs.getString(1);
            int var2 = rs.getInt(2 );
            System.out.println("1"+var1+" 2"+usuario);
            if (Objects.equals(var1, usuario)) {
                System.out.println("1"+var1+" 2"+usuario);
                cedula=var2;
            }
        }
        return cedula;
    }

    public static ArrayList<Mudanza> getMudanza (int Persona) throws SQLException{
        ArrayList<Mudanza> datos = new ArrayList<>();
        try {
            test_conexion = DriverManager.getConnection(url, user, password);
            if (test_conexion != null) {
                System.out.println("Conexion realizada con exito SUBIR DATOS");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Statement statement = test_conexion.createStatement();
        ResultSet rs = statement.executeQuery(("SELECT persona,Id,direccion_partida,direccion_llegada,precio,fecha,hora FROM MUDANZA"));
        while(rs.next()){
            int var1 = rs.getInt(1 );
            int var_aux =rs.getInt(2);
            String var2 = rs.getString(3);
            String var3 = rs.getString(4);
            int var4 = rs.getInt(5);
            String var5 = rs.getString(6);
            String var6 = rs.getString(7);
            System.out.println("cero?"+Persona);
            System.out.println("hptav"+var1+"sdasd:"+Persona);
            if (Objects.equals(var1, Persona)) {
                Mudanza aux = new Mudanza(var_aux, var2, var3, var4, var5, var6);
                datos.add(aux);
            }
        }
        return datos;
    }

>>>>>>> 4aa81a9 (Proyecto subido)
}