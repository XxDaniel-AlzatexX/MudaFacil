package MudaFacilFx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazRastrearExitoso {

    @FXML
    private Button ubicacion;

    @FXML
    public void closeWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazRastrearMudanza.fxml"));
            Parent root = loader.load();

            InterfazRastrearMudanza controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.ubicacion.getScene().getWindow();
            myStage.close();
        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    public void closeEmpresa() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazRastrearMudanza.fxml"));
            Parent root = loader.load();

            InterfazRastrearMudanza controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeEmpresa());

            Stage myStage = (Stage) this.ubicacion.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}