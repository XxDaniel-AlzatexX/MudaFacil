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

public class InterfazBuscarMudanzaConductor {

    @FXML
<<<<<<< HEAD
    private Button buscarMudanzaConductorBotonSeleccionar;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaTamanio;
=======
    private TextField SeleccionMudanza;

    @FXML
    private Button buscarMudanzaConductorBotonSeleccionar;
>>>>>>> 4aa81a9 (Proyecto subido)

    @FXML
    private TableView<?> buscarMudanzaConductorTabla;

    @FXML
<<<<<<< HEAD
    private TableColumn<?, ?> buscarMudanzaConductorTablaRecogida;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaDestino;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaPago;

    @FXML
=======
    private TableColumn<?, ?> buscarMudanzaConductorTablaDestino;

    @FXML
>>>>>>> 4aa81a9 (Proyecto subido)
    private TableColumn<?, ?> buscarMudanzaConductorTablaDia;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaHora;

    @FXML
<<<<<<< HEAD
    private TableColumn<?, ?> buscarMudanzaConductorTablaTipo;

    @FXML
    private TextField SeleccionMudanza;
=======
    private TableColumn<?, ?> buscarMudanzaConductorTablaId;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaPago;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaRecogida;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaTamanio;
>>>>>>> 4aa81a9 (Proyecto subido)

    public void closeConductor(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuConductor.fxml"));
            Parent root = loader.load();

            InterfazMenuConductor controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.buscarMudanzaConductorTabla.getScene().getWindow();
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
                    stage.setOnCloseRequest(e -> controller.closeConductor());
                    Stage myStage = (Stage) this.buscarMudanzaConductorBotonSeleccionar.getScene().getWindow();
                    myStage.close();
                } catch (IOException e) {
                    Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }

    }
}
