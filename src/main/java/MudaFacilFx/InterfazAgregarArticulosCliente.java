package MudaFacilFx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InterfazAgregarArticulosCliente {

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
    private TableView<?> agregarArticulosClienteTabla;

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
    private ChoiceBox<?> agregarArticulosClienteCantAyudantes;

}
