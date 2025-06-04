import model.Bicicleta;
import model.Generico;
import model.Producto;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bicicleta producto1= new Bicicleta("Bicicleta CCDDFF",656565, "Bici bmx ooiiuu",26,"Azul");
        System.out.println(producto1.toString());

        Producto producto2=new Producto("Cadena",4556, "Cadena bici rodado 26");
        System.out.println(producto2.toString());

        Producto producto3 = new Bicicleta("Bicicleta Arcoiris",994987, "Bici niña",14,"Blanca");
        System.out.println(producto3.toString());

        //instanceoff -- es una instancia de?
        if (producto3 instanceof Bicicleta)
            System.out.println("Es una Bici");
        else
            System.out.println("Es un Producto");

        producto1.MostrarBienvenida();
        producto1.MostrarDatos();
        System.out.println("El IVA es ");
        producto1.CalcularImpuesto(producto1.getPrecio());
    }
}