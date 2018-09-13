package nuevaconcesionaria;
public class NuevaConcesionaria {
    public static void main(String[] args) {
        
        Cliente p = new Cliente("Marcos", "Diaz", 33072278, 'M', "123456", "07/06/87");
        Concesionaria.nuevoCliente(p);
        Auto a = new Auto ("Lancer", "FQ400", "aa123aa", "esta re copado", 5);
        Concesionaria.venderAuto(p, a);
        Cliente q = new Cliente ("Ale", "Torres", 12345689, 'M', "123456", "25/04/87");
        Concesionaria.nuevoCliente(q);
        Cliente r = new Cliente ("Kevin", "Hnatik", 12345678, 'M', "123456", "30/03/87");
        Auto b = new Auto ("Gol", "Trend", "aa124aa", "le salio 2 pesos", 5);
        Concesionaria.nuevoCliente(r);
        Concesionaria.venderAuto(r, b);
        Cliente s = new Cliente("Erne", "Rodriguez", 12345678, 'M', "987654", "30/01/87");
        Concesionaria.nuevoCliente(s);
        
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}