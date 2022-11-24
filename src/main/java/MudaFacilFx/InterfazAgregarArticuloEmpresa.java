package MudaFacilFx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazAgregarArticuloEmpresa {

    @FXML
    private TextField agregarArticuloEmpresaNombre;

    @FXML
    private TextField agregarArticuloEmpresaLargo;

    @FXML
    private TextField agregarArticuloEmpresaAlto;

    @FXML
    private TextField agregarArticuloEmpresaPeso;

    @FXML
    private Button agregarArticuloEmpresaBotonSiguiente;

    @FXML
    private TextField agregarArticuloEmpresaAncho;

    @FXML
    private ChoiceBox<?> agregarArticuloEmpresaCantAyudantes;

    @FXML
    public void closeEmpresa(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazCrearEnvioEmpresa.fxml"));
            Parent root = loader.load();

            InterfazCrearEnvioEmpresa controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeEmpresa());

            Stage myStage = (Stage) this.agregarArticuloEmpresaAlto.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    void agregarSiguiente(ActionEvent event) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazCosto.fxml"));
            Parent root = loader.load();

            InterfazCostoTamanio controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeEmpresa());

            Stage myStage = (Stage) this.agregarArticuloEmpresaBotonSiguiente.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void closeWindow() {
    }
}
