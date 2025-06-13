import exceptions.BicicletaException;
import model.Bicicleta;
import model.Generico;
import model.Producto;

public class Main {
    public static void main(String[] args) {
        Producto producto3 = null;
        Bicicleta producto1= null;
        try {
            producto1 = new Bicicleta("Bicicleta CCDDFF",656565, "Bici bmx ooiiuu",10,"Azul");
            System.out.println(producto1.toString());

            producto1.MostrarBienvenida();
            producto1.MostrarDatos();
            System.out.println("El IVA es ");
            producto1.CalcularImpuesto(producto1.getPrecio());
        } catch (BicicletaException e) {
            System.out.println(e.getMessage());
        }

        try {
            producto3 = new Bicicleta("Bicicleta Arcoiris",994987, "Bici niña",14,"Blanca");

            System.out.println(producto3.toString());

            //instanceoff -- es una instancia de?
            if (producto3 instanceof Bicicleta)
                System.out.println("Es una Bici");
            else
                System.out.println("Es un Producto");

            producto1.MostrarDatos();
            System.out.println("El IVA es ");
            producto1.CalcularImpuesto(producto1.getPrecio());
        } catch (BicicletaException e) {
            System.out.println(e.getMessage());
        }

    }
}