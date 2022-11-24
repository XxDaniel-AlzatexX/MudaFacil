package MudaFacilFx;

import Control.ControllerDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazCrearEnvioEmpresa  implements Initializable {

    @FXML
    private TextField crearMudanzaEmpresaDirLlegada;

    @FXML
    private TextField crearMudanzaEmpresaDirPartida;

    @FXML
    private ChoiceBox<String> crearMudanzaEmpresaHora1;

    @FXML
    private Button crearMudanzaEmpresaSiguiente;

    @FXML
    private ChoiceBox<String> crearMudanzaEmpresaHora2;

    @FXML
    private ChoiceBox<String> crearMudanzaEmpresaDia;

    private String[] horas = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    private String[] minutos = {"00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    private String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado", "Domingo"};


    public void initialize(URL arg0, ResourceBundle arg1) {
        crearMudanzaEmpresaHora1.getItems().addAll(horas);
        crearMudanzaEmpresaHora2.getItems().addAll(minutos);
        crearMudanzaEmpresaDia.getItems().addAll(dias);
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

            Stage myStage = (Stage) this.crearMudanzaEmpresaDia.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    void envioSiguiente(ActionEvent event) {
        try {

            String DpartidaEmpresa = crearMudanzaEmpresaDirPartida.getText();
            String DLlegadaEmpresa = crearMudanzaEmpresaDirLlegada.getText();
            String Hora = crearMudanzaEmpresaHora1.getValue();
                String Minutos = crearMudanzaEmpresaHora2.getValue();
            String HoraFinal = Hora + ":" + Minutos;
            String Dia = crearMudanzaEmpresaDia.getValue();

            if (DpartidaEmpresa.isEmpty() || DLlegadaEmpresa.isEmpty() || Hora.isEmpty() || Minutos.isEmpty() || Dia.isEmpty()) {
                Alert alerta = new Alert(Alert.AlertType.WARNING);
                alerta.setHeaderText(null);
                alerta.setTitle("INFO");
                alerta.setContentText("LLENE TODAS LAS CASILLA PARA REGISTRAR LA MUDANZA");
                alerta.showAndWait();
            } else {

                ControllerDB ControlDB = new ControllerDB();
                String id = ControlDB.BuscarIDUsuario(InterfazLogin.aux.nom, InterfazLogin.aux.con);
                int ID = Integer.parseInt(id);
                Random random = new Random();
                int x = random.nextInt(1000) + 1;

                ControlDB.agregarMudanza(x, ID, DpartidaEmpresa, DLlegadaEmpresa, Dia, HoraFinal);

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazAgregarArticuloEmpresa.fxml"));
                Parent root = loader.load();
                InterfazAgregarArticuloEmpresa controller = loader.getController();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                stage.setOnCloseRequest(e -> controller.closeWindow());
                Stage myStage = (Stage) this.crearMudanzaEmpresaSiguiente.getScene().getWindow();
                myStage.close();

            }
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

    }

}
