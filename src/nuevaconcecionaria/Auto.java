package nuevaconcecionaria;
public class Auto {
    private String nombre;
    private String modelo;
    private String patente;
    private String caracteristicas;
    private int capacidad;

    public Auto(String nombre, String modelo, String patente, String caracteristicas, int capacidad) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.patente = patente;
        this.caracteristicas = caracteristicas;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.caracteristicas = Caracteristicas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString(){
        return "Nombre del auto: "+nombre+". Modelo: "+modelo+". Patente: "+patente+". Caracteristicas: "+caracteristicas+". Capacidad: "+capacidad;
    }
    
    
}
