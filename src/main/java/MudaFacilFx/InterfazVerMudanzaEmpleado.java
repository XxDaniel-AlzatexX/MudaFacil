package MudaFacilFx;

<<<<<<< HEAD
=======
import Control.ControllerDB;
import Entity.Mudanza;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
>>>>>>> 4aa81a9 (Proyecto subido)
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
<<<<<<< HEAD
import javafx.stage.Stage;

import java.io.IOException;
=======
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
>>>>>>> 4aa81a9 (Proyecto subido)
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazVerMudanzaEmpleado {

    @FXML
    private TableColumn<?, ?> empleadoTablaCosto;

    @FXML
    private TableColumn<?, ?> empleadoTablaFecha;

    @FXML
    private TableColumn<?, ?> empleadoTablaID;

    @FXML
    private TableColumn<?, ?> empleadoTablaTelCliente;

    @FXML
<<<<<<< HEAD
    private TableView<?> verMudanzasEmpleadoTabla;

=======
    private TableView<Mudanza> verMudanzasEmpleadoTabla;

    private ObservableList<Mudanza> mudanzas;

    public void initialize() throws SQLException {

        this.empleadoTablaFecha.setCellValueFactory(new PropertyValueFactory("fecha"));
        this.empleadoTablaID.setCellValueFactory(new PropertyValueFactory("id"));
        this.empleadoTablaCosto.setCellValueFactory(new PropertyValueFactory("pago"));

        mudanzas = FXCollections.observableArrayList();
        for(int i = 0; i< ControllerDB.getMudanza(ControllerDB.getCedula(InterfazLogin.nombUsuario)).size(); i++) {
            this.mudanzas.add(ControllerDB.getMudanza(ControllerDB.getCedula(InterfazLogin.nombUsuario)).get(i));
            this.verMudanzasEmpleadoTabla.setItems(mudanzas);
        }
    }
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

            Stage myStage = (Stage) this.verMudanzasEmpleadoTabla.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void closeAyudante(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuAyudante.fxml"));
            Parent root = loader.load();

            InterfazMenuAyudante controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.verMudanzasEmpleadoTabla.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
