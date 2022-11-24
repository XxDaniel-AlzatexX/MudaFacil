package MudaFacilFx;
<<<<<<< HEAD
=======
import MudaFacilFx.InterfazAgregarArticuloCliente;
>>>>>>> 4aa81a9 (Proyecto subido)

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazCostoTamanio {

    @FXML
    private Text costoMudanza;

    @FXML
    private Text tamanioCamion;

    public void initialize(){
<<<<<<< HEAD

=======
        tamanioCamion.setText(InterfazAgregarArticuloCliente.tamanio);
        costoMudanza.setText((String.valueOf(InterfazAgregarArticuloCliente.precio)));
>>>>>>> 4aa81a9 (Proyecto subido)
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

            Stage myStage = (Stage) this.costoMudanza.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @FXML
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

            Stage myStage = (Stage) this.costoMudanza.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
<<<<<<< HEAD

=======
>>>>>>> 4aa81a9 (Proyecto subido)
}
