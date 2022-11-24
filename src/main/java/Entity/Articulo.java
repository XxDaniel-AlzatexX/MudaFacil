package Entity;
import MudaFacilFx.InterfazAgregarArticuloCliente;
import javafx.collections.FXCollections;

public class Articulo {

    private String nombre;
    private int largo;
    private int ancho;
    private int alto;
    private int peso;



    public Articulo(String nombre, int largo, int ancho, int alto, int peso) {
        this.nombre = nombre;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
