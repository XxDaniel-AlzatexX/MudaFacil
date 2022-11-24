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

public class InterfazRegistro {

    @FXML
    private TextField regCed;

    @FXML
    private TextField regCel;

    @FXML
    private TextField regCont;

    @FXML
    private TextField regFechaNaci;

    @FXML
    private TextField regNom;

    @FXML
    private Button regSignUp;

    @FXML
<<<<<<< HEAD
    private TextField regTipoCuen;
=======
    private ChoiceBox<String> regTipoCuen;
>>>>>>> 4aa81a9 (Proyecto subido)

    @FXML
    private TextField regUsu;

<<<<<<< HEAD
=======
    private String[] tipoCuentas = {"Conductor", "Ayudante", "Cliente", "Empresa"};

    static int cedula = 0;

    public void initialize(){
        regTipoCuen.getItems().addAll(tipoCuentas);
    }

>>>>>>> 4aa81a9 (Proyecto subido)
    public void closeWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazLogin.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.regSignUp.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    void registro(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
<<<<<<< HEAD

=======
>>>>>>> 4aa81a9 (Proyecto subido)
        boolean bandera = false;
        ControllerDB ControlDB = new ControllerDB();
        String Nombre = regNom.getText();
        String ced = regCed.getText();
<<<<<<< HEAD
        int Cedula = Integer.parseInt(ced);
=======
        this.cedula = Integer.parseInt(ced);
>>>>>>> 4aa81a9 (Proyecto subido)
        String Contra = regCont.getText();
        String Nomb = regUsu.getText();
        String Cell = regCel.getText();
        String FechaNac = regFechaNaci.getText();
<<<<<<< HEAD
        String TCuenta = regTipoCuen.getText();

        bandera = ControlDB.validarRegistroCedula(Cedula);

        if (!bandera) {

            ControlDB.agregarusuario(Nombre, Cedula, Contra, Nomb, Cell, FechaNac, TCuenta);
=======
        String TCuenta = regTipoCuen.getValue();

        bandera = ControlDB.validarRegistroCedula(this.cedula);

        if (!bandera) {

            ControlDB.agregarusuario(Nombre, this.cedula, Contra, Nomb, Cell, FechaNac, TCuenta);
>>>>>>> 4aa81a9 (Proyecto subido)

            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setHeaderText(null);
            alerta.setTitle("INFO");
            alerta.setContentText("USTED HA SIDO REGISTRADO EN MUDAFACIL, PUEDE CERRAR ESTA PESTAÑA");
            alerta.showAndWait();

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazLogin.fxml"));
                Parent root = loader.load();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.setScene(scene);
                stage.show();

                Stage myStage = (Stage) this.regNom.getScene().getWindow();
                myStage.close();

            } catch (IOException e) {
                Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setHeaderText(null);
            alerta.setTitle("INFO");
            alerta.setContentText("EL ID INGRESADO YA PERTENECE A UNA CUENTA");
            alerta.showAndWait();
        }
    }
}