package MudaFacilFx;

import Control.ControllerDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.Random;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazCrearMudanzaCliente implements Initializable {

    public static int cmudanza;

    @FXML
    private TextField crearMudanzaClienteDirLlegada;

    @FXML
    private TextField crearMudanzaClienteDirPartida;

    @FXML
    private DatePicker crearMudanzaClienteFecha;

    @FXML
    private ChoiceBox<String> crearMudanzaClienteHora1;

    @FXML
    private Button crearMudanzaClienteSiguiente;

    @FXML
    private ChoiceBox<String> crearMudanzaClienteHora2;

    private String [] horas = {"1","2","3","4","5","6","7","8","9","10","11","12"};
    private String [] tiempo = {"AM","PM"};

    public void initialize(URL arg0, ResourceBundle arg1){
        crearMudanzaClienteHora1.getItems().addAll(horas);
        crearMudanzaClienteHora2.getItems().addAll(tiempo);
    }

    @FXML
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
            Stage myStage = (Stage) this.crearMudanzaClienteDirLlegada.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    void mudanzaSiguiente(ActionEvent event) {
        try{
<<<<<<< HEAD


=======
>>>>>>> 4aa81a9 (Proyecto subido)
            String Dpartida = crearMudanzaClienteDirPartida.getText();
            String DLlegada = crearMudanzaClienteDirLlegada.getText();
            LocalDate myDate = crearMudanzaClienteFecha.getValue();
            String Fecha = myDate.toString();
            String Hora = crearMudanzaClienteHora1.getValue();
            String Minutos = crearMudanzaClienteHora2.getValue();
            String HoraFinal = Hora + ":" + Minutos;

            if (Dpartida.isEmpty() || DLlegada.isEmpty() || Fecha.isEmpty() || Hora.isEmpty() || Minutos.isEmpty()){
                Alert alerta = new Alert(Alert.AlertType.WARNING);
                alerta.setHeaderText(null);
                alerta.setTitle("INFO");
                alerta.setContentText("LLENE TODAS LAS CASILLA PARA REGISTRAR LA MUDANZA");
                alerta.showAndWait();
            }

            else {
<<<<<<< HEAD

=======
>>>>>>> 4aa81a9 (Proyecto subido)
                ControllerDB ControlDB = new ControllerDB();
                String id = ControlDB.BuscarIDUsuario(InterfazLogin.aux.nom, InterfazLogin.aux.con);
                int ID = Integer.parseInt(id);
                Random random = new Random();
                int x = random.nextInt(1000)+1;
                cmudanza = x;

                ControlDB.agregarMudanza(x,ID,Dpartida,DLlegada,Fecha,HoraFinal);

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazAgregarArticuloCliente.fxml"));
                Parent root = loader.load();
                InterfazAgregarArticuloCliente controller = loader.getController();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                stage.setOnCloseRequest(e -> controller.closeWindow());
                Stage myStage = (Stage) this.crearMudanzaClienteSiguiente.getScene().getWindow();
                myStage.close();
            }

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
