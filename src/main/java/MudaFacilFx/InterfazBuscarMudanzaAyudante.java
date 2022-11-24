package MudaFacilFx;

import Control.ControllerDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazBuscarMudanzaAyudante {

    @FXML
<<<<<<< HEAD
=======
    private TextField SeleccionMudanza;

    @FXML
>>>>>>> 4aa81a9 (Proyecto subido)
    private Button buscarMudanzaAyudanteBotonSeleccionar;

    @FXML
    private TableView<?> buscarMudanzaAyudanteTabla;

    @FXML
<<<<<<< HEAD
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaRecogida;

    @FXML
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaPago;

    @FXML
=======
>>>>>>> 4aa81a9 (Proyecto subido)
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaDia;

    @FXML
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaHora;

    @FXML
<<<<<<< HEAD
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaNumAyudantes;

    @FXML
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaTipo;

    @FXML
    private TextField SeleccionMudanza;
=======
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaId;

    @FXML
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaNumAyudantes;

    @FXML
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaPago;

    @FXML
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaRecogida;

    @FXML
    private TableColumn<?, ?> buscarMudanzaAyudanteTablaTipo;
>>>>>>> 4aa81a9 (Proyecto subido)

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

            Stage myStage = (Stage) this.buscarMudanzaAyudanteTabla.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    void tomarMudanzaSiguiente(ActionEvent event) throws SQLException {

        String IdMudanza = SeleccionMudanza.getText();

        System.out.println(IdMudanza);

        if (IdMudanza.isEmpty()){
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setHeaderText(null);
            alerta.setTitle("INFO");
            alerta.setContentText("Debe digitar el ID de la mudanza");
            alerta.showAndWait();
        }

        else{

            ControllerDB ControlDB = new ControllerDB();
            boolean Existe = ControlDB.VerificarMudanza(IdMudanza);

            if(!Existe){
                Alert alerta = new Alert(Alert.AlertType.WARNING);
                alerta.setHeaderText(null);
                alerta.setTitle("INFO");
                alerta.setContentText("ESTE ID NO ESTA REGISTRADO, DIGITE UNO VALIDO");
                alerta.showAndWait();
            }

            else{
                try{
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazBuscarExitoso.fxml"));
                    Parent root = loader.load();

                    InterfazBuscarExitoso controller = loader.getController();

                    Scene scene = new Scene(root);
                    Stage stage = new Stage();

                    stage.setScene(scene);
                    stage.show();

                    stage.setOnCloseRequest(e -> controller.closeAyudante());

                    Stage myStage = (Stage) this.buscarMudanzaAyudanteBotonSeleccionar.getScene().getWindow();
                    myStage.close();

                } catch (IOException e) {
                    Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
    }

}
