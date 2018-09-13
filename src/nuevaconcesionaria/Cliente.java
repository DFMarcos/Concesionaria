package nuevaconcesionaria;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private char sexo;
    private String telefono;
    private String date;
    private List<Auto> autos = new ArrayList<>();

    public Cliente(String nombre, String apellido, int dni, char sexo, String telefono, String date) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
        this.telefono = telefono;
        this.date = date;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void listarAutos(){
        if (!autos.isEmpty()){
            Iterator<Auto> iterator = autos.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
    
    public void agregarAuto(Auto a){
        autos.add(a);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", sexo=" + sexo + ", telefono=" + telefono + ", date=" + date + ", autos=" + autos + '}';
    }
}