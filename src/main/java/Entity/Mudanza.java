package Entity;

public class Mudanza {
    private int Id;
    private String destino;
    private String arrive;
    private int coste;
    private String fecha;
    private String hora;

    public Mudanza(int id, String destino, String arrive, int coste, String fecha, String hora) {
        Id = id;
        this.destino = destino;
        this.arrive = arrive;
        this.coste = coste;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
