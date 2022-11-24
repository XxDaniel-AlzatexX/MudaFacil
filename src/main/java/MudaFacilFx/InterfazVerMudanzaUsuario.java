package MudaFacilFx;
<<<<<<< HEAD

=======
import Control.ControllerDB;
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
import java.util.logging.Level;
import java.util.logging.Logger;
=======
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entity.Mudanza;
>>>>>>> 4aa81a9 (Proyecto subido)

public class InterfazVerMudanzaUsuario {

    @FXML
    private TableColumn<?, ?> usuarioTablaCosto;

    @FXML
    private TableColumn<?, ?> usuarioTablaDestino;

    @FXML
    private TableColumn<?, ?> usuarioTablaFecha;

    @FXML
    private TableColumn<?, ?> usuarioTablaID;

    @FXML
    private TableColumn<?, ?> usuarioTablaRecogida;

    @FXML
    private TableColumn<?, ?> usuarioTablaTelConductor;

    @FXML
<<<<<<< HEAD
    private TableView<?> verMudanzasUsuarioTabla;

    @FXML
=======
    private TableView<Mudanza> verMudanzasUsuarioTabla;
    private ObservableList<Mudanza> mudanzas;

    public void initialize() throws SQLException {
        this.usuarioTablaDestino.setCellValueFactory(new PropertyValueFactory("destino"));
        this.usuarioTablaFecha.setCellValueFactory(new PropertyValueFactory("fecha"));
        this.usuarioTablaID.setCellValueFactory(new PropertyValueFactory("id"));
        this.usuarioTablaCosto.setCellValueFactory(new PropertyValueFactory("pago"));
        this.usuarioTablaRecogida.setCellValueFactory(new PropertyValueFactory("recogida"));
        mudanzas = FXCollections.observableArrayList();
        for(int i=0;i<ControllerDB.getMudanza(ControllerDB.getCedula(InterfazLogin.nombUsuario)).size();i++) {
            this.mudanzas.add(ControllerDB.getMudanza(ControllerDB.getCedula(InterfazLogin.nombUsuario)).get(i));
            this.verMudanzasUsuarioTabla.setItems(mudanzas);
        }
    }
>>>>>>> 4aa81a9 (Proyecto subido)
    public void closeWindow(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuCliente.fxml"));
            Parent root = loader.load();

            InterfazMenuCliente controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.verMudanzasUsuarioTabla.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void closeEmpresa(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuEmpresa.fxml"));
            Parent root = loader.load();

            InterfazMenuEmpresa controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.verMudanzasUsuarioTabla.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
