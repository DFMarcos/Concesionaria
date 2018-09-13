package nuevaconcesionaria;
import java.util.List;
import java.util.ArrayList;
public class Concesionaria {
    private String nombreLegal = "Acapulco Autos";
    private String direccion = "Remedios de Escalada de San Martín 1700. Gerli, Buenos Aires";
    private String date = "1973";
    private static List<Cliente> clientes = new ArrayList<>();

    private Concesionaria() {
    }
    
    public static void nuevoCliente (Cliente c){
        clientes.add(c);
    }
    
    public static void venderAuto (Cliente c, Auto a){
        c.agregarAuto(a);
    }

    @Override
    public String toString() {
        return "Concecionaria{" + "nombreLegal=" + nombreLegal + ", direccion=" + direccion + ", date=" + date + ", clientes=" + clientes + '}';
    }
}