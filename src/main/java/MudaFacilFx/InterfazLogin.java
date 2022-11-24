package MudaFacilFx;

import Control.ControllerDB;
<<<<<<< HEAD
=======
import Entity.Mudanza;
>>>>>>> 4aa81a9 (Proyecto subido)
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
<<<<<<< HEAD
import java.sql.SQLException;
=======
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
>>>>>>> 4aa81a9 (Proyecto subido)
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazLogin {

    public static InterfazLogin aux = new InterfazLogin();
<<<<<<< HEAD
=======

    public static String nombUsuario;
>>>>>>> 4aa81a9 (Proyecto subido)
    public String nom;
    public String con;

    @FXML
    private Button logBotEntrar;

    @FXML
    private TextField logCont;

    @FXML
    private Hyperlink logRegistrarse;

    @FXML
    private TextField logUsu;

    @FXML
    void iniciarSesion(ActionEvent event) throws SQLException, ClassNotFoundException {
<<<<<<< HEAD

        ControllerDB ControlDB = new ControllerDB();
        String NombUsuario = logUsu.getText();
        String Contra = logCont.getText();
        aux.setNom(NombUsuario);
        aux.setCon(Contra);
        String TCuenta;
        Boolean Existe;
        Existe = ControlDB.validarusuario(NombUsuario, Contra);

        if (Existe) {
            try {
                TCuenta = ControlDB.BuscarTCuenta(NombUsuario, Contra);
=======
        ControllerDB ControlDB = new ControllerDB();
        nombUsuario = logUsu.getText();
        String Contra = logCont.getText();
        aux.setNom(nombUsuario);
        aux.setCon(Contra);
        String TCuenta;
        Boolean Existe;
        Existe = ControlDB.validarusuario(nombUsuario, Contra);

        if (Existe) {
            try {
                TCuenta = ControlDB.BuscarTCuenta(nombUsuario, Contra);
>>>>>>> 4aa81a9 (Proyecto subido)

                if (TCuenta.equalsIgnoreCase("Cliente")) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuCliente.fxml"));
                    Parent root = loader.load();

                    InterfazMenuCliente controller = loader.getController();

                    Scene scene = new Scene(root);
                    Stage stage = new Stage();

                    stage.setScene(scene);
                    stage.show();

                    stage.setOnCloseRequest(e -> controller.closeWindow());

                    Stage myStage = (Stage) this.logBotEntrar.getScene().getWindow();
                    myStage.close();
                } else if (TCuenta.equalsIgnoreCase("Empresa")) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuEmpresa.fxml"));
                    Parent root = loader.load();

                    InterfazMenuEmpresa controller = loader.getController();

                    Scene scene = new Scene(root);
                    Stage stage = new Stage();

                    stage.setScene(scene);
                    stage.show();

                    stage.setOnCloseRequest(e -> controller.closeWindow());

                    Stage myStage = (Stage) this.logBotEntrar.getScene().getWindow();
                    myStage.close();
                } else if (TCuenta.equalsIgnoreCase("Conductor")) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuConductor.fxml"));
                    Parent root = loader.load();

                    InterfazMenuConductor controller = loader.getController();

                    Scene scene = new Scene(root);
                    Stage stage = new Stage();

                    stage.setScene(scene);
                    stage.show();

                    stage.setOnCloseRequest(e -> controller.closeWindow());

                    Stage myStage = (Stage) this.logBotEntrar.getScene().getWindow();
                    myStage.close();
                } else if (TCuenta.equalsIgnoreCase("Ayudante")) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuAyudante.fxml"));
                    Parent root = loader.load();

                    InterfazMenuAyudante controller = loader.getController();

                    Scene scene = new Scene(root);
                    Stage stage = new Stage();

                    stage.setScene(scene);
                    stage.show();

                    stage.setOnCloseRequest(e -> controller.closeWindow());

                    Stage myStage = (Stage) this.logBotEntrar.getScene().getWindow();
                    myStage.close();
                }

            } catch (IOException e) {
                Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setHeaderText(null);
            alerta.setTitle("INFO");
            alerta.setContentText("EL USUARIO NO EXISTE O LAS CREDENCIALES SON INVALIDAS");
            alerta.showAndWait();
        }
    }

    @FXML
    public void registrase(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazRegistro.fxml"));
            Parent root = loader.load();

            InterfazRegistro controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.logBotEntrar.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public InterfazLogin getAux() {
        return aux;
    }

    public void setAux(InterfazLogin aux) {
        this.aux = aux;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }
<<<<<<< HEAD
}
=======

    }
>>>>>>> 4aa81a9 (Proyecto subido)
