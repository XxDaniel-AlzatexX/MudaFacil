package MudaFacilFx;

import Control.ControllerDB;
import MudaFacilFx.InterfazCrearMudanzaCliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
<<<<<<< HEAD

=======
>>>>>>> 4aa81a9 (Proyecto subido)
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entity.Articulo;
<<<<<<< HEAD
=======
import MudaFacilFx.InterfazCostoTamanio;
>>>>>>> 4aa81a9 (Proyecto subido)


public class InterfazAgregarArticuloCliente {

<<<<<<< HEAD
=======
    public static int precio = 0;
    public static String tamanio;
    int total = 0;
>>>>>>> 4aa81a9 (Proyecto subido)
    @FXML
    private TextField agregarArticulosClienteNombre;

    @FXML
    private TextField agregarArticulosClienteLargo;

    @FXML
    private TextField agregarArticulosClienteAncho;

    @FXML
    private TextField agregarArticulosClienteAlto;

    @FXML
    private Button agregarArticulosClienteBotonAgregar;

    @FXML
    private Button agregarArticulosClienteBotonSiguiente;

    @FXML
    private TableView<Articulo> agregarArticulosClienteTabla;

    @FXML
    private TableColumn<?, ?> agregarArticulosClienteTablaNombre;

    @FXML
    private TableColumn<?, ?> agregarArticulosClienteTablaLargo;

    @FXML
    private TableColumn<?, ?> agregarArticulosClienteTablaAlto;

    @FXML
    private TableColumn<?, ?> agregarArticulosClienteTablaAncho;

    @FXML
    private TableColumn<?, ?> agregarArticulosClienteTablaPeso;

    @FXML
    private TextField agregarArticulosClientePeso;

    @FXML
    private ChoiceBox<Integer> agregarArticulosClienteCantAyudantes;

    private Integer [] numAyudantes = {0,1,2};

    private ObservableList<Articulo> articulos;

    public void initialize(){
        agregarArticulosClienteCantAyudantes.getItems().addAll(numAyudantes);
        articulos = FXCollections.observableArrayList();

        this.agregarArticulosClienteTablaNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.agregarArticulosClienteTablaAncho.setCellValueFactory(new PropertyValueFactory("ancho"));
        this.agregarArticulosClienteTablaAlto.setCellValueFactory(new PropertyValueFactory("alto"));
        this.agregarArticulosClienteTablaLargo.setCellValueFactory(new PropertyValueFactory("largo"));
        this.agregarArticulosClienteTablaPeso.setCellValueFactory(new PropertyValueFactory("peso"));

    }

    @FXML
    public void closeWindow(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazCrearMudanzaCliente.fxml"));
            Parent root = loader.load();

            InterfazCrearMudanzaCliente controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.agregarArticulosClienteAlto.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    void botonAgregar(ActionEvent event) throws SQLException {

        ControllerDB ControlDB = new ControllerDB();

        String nombre = agregarArticulosClienteNombre.getText();
        int largo = Integer.parseInt(agregarArticulosClienteLargo.getText());
        int ancho = Integer.parseInt(agregarArticulosClienteAncho.getText());
        int alto = Integer.parseInt(agregarArticulosClienteAlto.getText());
        int peso = Integer.parseInt(agregarArticulosClientePeso.getText());

        InterfazCrearMudanzaCliente inter = new InterfazCrearMudanzaCliente();
        int codMud = InterfazCrearMudanzaCliente.cmudanza;

        System.out.println("Mandamos a la base");

        ControlDB.agregarArticuloMudanza(nombre,largo,ancho,alto,peso, codMud);
        Articulo aux= new Articulo(nombre,largo,ancho,alto,peso);
<<<<<<< HEAD
       // int volumen= largo*ancho*alto;

        this.articulos.add(aux);
        this.agregarArticulosClienteTabla.setItems(articulos);





=======

        int volumen = largo*ancho*alto;

        total += volumen;
        precio = total*10000;

        if (total<10){
            tamanio = "Pequeño";
        }else if(total>10 && total<20){
            tamanio = "Mediano";
        }
        else if(total>20){
            tamanio = "Grande";
        }

        this.articulos.add(aux);
        this.agregarArticulosClienteTabla.setItems(articulos);
>>>>>>> 4aa81a9 (Proyecto subido)
    }

    @FXML
    void agregarSiguiente(ActionEvent event) {
        try{
            Integer[] cantiAyudantes = numAyudantes;

<<<<<<< HEAD
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazCosto.fxml"));
=======
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazCostoTamanio.fxml"));
>>>>>>> 4aa81a9 (Proyecto subido)
            Parent root = loader.load();

            InterfazCostoTamanio controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.agregarArticulosClienteBotonSiguiente.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    
}
