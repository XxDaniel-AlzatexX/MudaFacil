package MudaFacilFx;

import Control.ControllerDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazCancelarMudanza {

    @FXML
    private Button cancelMudBoton;

    @FXML
    private TextField cancelMudID;

    @FXML
    public void closeWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuCliente.fxml"));
            Parent root = loader.load();

            InterfazMenuCliente controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.cancelMudBoton.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    public void closeEmpresa() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuEmpresa.fxml"));
            Parent root = loader.load();

            InterfazMenuEmpresa controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.cancelMudBoton.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    public void closeConductor() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuConductor.fxml"));
            Parent root = loader.load();

            InterfazMenuConductor controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.cancelMudBoton.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    public void closeAyudante() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuAyudante.fxml"));
            Parent root = loader.load();

            InterfazMenuAyudante controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.cancelMudID.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    void cancelar(ActionEvent event) throws SQLException, ClassNotFoundException {
        ControllerDB ControlDB = new ControllerDB();
        String TCuenta = ControlDB.BuscarTCuenta(InterfazLogin.aux.nom, InterfazLogin.aux.con);
        try {
            if (TCuenta.equalsIgnoreCase("Cliente")) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazCancelarExitoso.fxml"));
                Parent root = loader.load();

                InterfazCancelarExitoso controller = loader.getController();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.setScene(scene);
                stage.show();

                stage.setOnCloseRequest(e -> controller.closeWindow());

                Stage myStage = (Stage) this.cancelMudBoton.getScene().getWindow();
                myStage.close();
            } else if (TCuenta.equalsIgnoreCase("Empresa")) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazCancelarExitoso.fxml"));
                Parent root = loader.load();

                InterfazCancelarExitoso controller = loader.getController();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.setScene(scene);
                stage.show();

                stage.setOnCloseRequest(e -> controller.closeEmpresa());

                Stage myStage = (Stage) this.cancelMudBoton.getScene().getWindow();
                myStage.close();
            } else if (TCuenta.equalsIgnoreCase("Conductor")) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazCancelarExitoso.fxml"));
                Parent root = loader.load();

                InterfazCancelarExitoso controller = loader.getController();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.setScene(scene);
                stage.show();

                stage.setOnCloseRequest(e -> controller.closeConductor());

                Stage myStage = (Stage) this.cancelMudBoton.getScene().getWindow();
                myStage.close();
            } else {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazCancelarExitoso.fxml"));
                Parent root = loader.load();

                InterfazCancelarExitoso controller = loader.getController();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.setScene(scene);
                stage.show();

                stage.setOnCloseRequest(e -> controller.closeAyudante());

                Stage myStage = (Stage) this.cancelMudBoton.getScene().getWindow();
                myStage.close();
            }
        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
