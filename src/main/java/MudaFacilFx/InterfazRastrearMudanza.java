package MudaFacilFx;

<<<<<<< HEAD
import Control.ControllerDB;
=======
import Entity.Mudanza;
import Control.ControllerDB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
>>>>>>> 4aa81a9 (Proyecto subido)
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
<<<<<<< HEAD
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
=======
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import MudaFacilFx.InterfazLogin;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;
>>>>>>> 4aa81a9 (Proyecto subido)
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazRastrearMudanza {

<<<<<<< HEAD
=======

    @FXML
    private TextField mudanzaRastrear;

>>>>>>> 4aa81a9 (Proyecto subido)
    @FXML
    private Button rastrearMudanzaBoton;

    @FXML
<<<<<<< HEAD
    private TableView<?> rastrearMudanzaTabla;

    @FXML
=======
    private TableColumn<?, ?> rastrearMudanzaDestinoColumna = new TableColumn<>("Destino");

    @FXML
    private TableColumn<?, ?> rastrearMudanzaFechaColumna = new TableColumn<>("Fecha");

    @FXML
    private TableColumn<?, ?> rastrearMudanzaHoraColumna = new TableColumn<>("Hora");

    @FXML
    private TableColumn<?, ?> rastrearMudanzaIdColumna = new TableColumn<>("Id");

    @FXML
    private TableColumn<?, ?> rastrearMudanzaPagoColumna = new TableColumn<>("Pago");

    @FXML
    private TableColumn<?, ?> rastrearMudanzaRecogidaColumna = new TableColumn<>("desde");

    @FXML
    private TableView<Mudanza> rastrearMudanzaTabla;

    @FXML
    private TableColumn<?, ?> rastrearMudanzaTamañoColumna = new TableColumn<>("Tam");

    private ObservableList<Mudanza> mudanzas;
    
    public void initialize() throws SQLException {
        this.rastrearMudanzaDestinoColumna.setCellValueFactory(new PropertyValueFactory<>("destino"));
        this.rastrearMudanzaFechaColumna.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        this.rastrearMudanzaHoraColumna.setCellValueFactory(new PropertyValueFactory<>("hora"));
        this.rastrearMudanzaIdColumna.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.rastrearMudanzaPagoColumna.setCellValueFactory(new PropertyValueFactory<>("pay"));
        this.rastrearMudanzaRecogidaColumna.setCellValueFactory(new PropertyValueFactory<>("Desde"));
        mudanzas = FXCollections.observableArrayList();

        for(int i=0;i<ControllerDB.getMudanza(ControllerDB.getCedula(InterfazLogin.nombUsuario)).size();i++) {
            this.mudanzas.add(ControllerDB.getMudanza(ControllerDB.getCedula(InterfazLogin.nombUsuario)).get(i));
            this.rastrearMudanzaTabla.setItems(mudanzas);
        }
    }

>>>>>>> 4aa81a9 (Proyecto subido)
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

            Stage myStage = (Stage) this.rastrearMudanzaBoton.getScene().getWindow();
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

            Stage myStage = (Stage) this.rastrearMudanzaBoton.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    void rastrear(ActionEvent event) throws SQLException, ClassNotFoundException {
        ControllerDB ControlDB = new ControllerDB();
        String TCuenta = ControlDB.BuscarTCuenta(InterfazLogin.aux.nom, InterfazLogin.aux.con);
        try {
            if (TCuenta.equalsIgnoreCase("Cliente")) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazRastrearExitoso.fxml"));
                Parent root = loader.load();

                InterfazRastrearExitoso controller = loader.getController();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.setScene(scene);
                stage.show();

                stage.setOnCloseRequest(e -> controller.closeWindow());

                Stage myStage = (Stage) this.rastrearMudanzaBoton.getScene().getWindow();
                myStage.close();
            } else {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazRastrearExitoso.fxml"));
                Parent root = loader.load();

                InterfazRastrearExitoso controller = loader.getController();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.setScene(scene);
                stage.show();

                stage.setOnCloseRequest(e -> controller.closeEmpresa());

                Stage myStage = (Stage) this.rastrearMudanzaBoton.getScene().getWindow();
                myStage.close();
            }
        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
