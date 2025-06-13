package model;

import exceptions.BicicletaException;

public class Bicicleta extends Producto implements Imprimir, Impuesto{
    private int rodado;
    private String color;

    public Bicicleta(){
        //llamo al constructor vacio de la clase padre Producto
        super();
    }

    public Bicicleta(String producto,double precio,String descripcion, int rodado, String color) throws BicicletaException {
        //llamo al constructor con atributos de la clase padre Producto

        super(producto,precio,descripcion);
        if (rodado < 14)
        {
            throw new BicicletaException(1);
        }


        this.rodado=rodado;
        this.color=color;
    }

    public int getRodado() {
        return rodado;
    }
    public void setRodado(int rodado) {
        this.rodado = rodado;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + getId() +
                ", producto='" + getProducto() + '\'' +
                ", precio=" + getPrecio() +
                ", descripcion='" + getDescripcion() + '\'' +
                " rodado: " + rodado + " color " + color;
    }

    @Override
    public void Mostrar(){
        super.Mostrar();
        System.out.println("Bici rodado: "+ rodado +
                " color: " + color);
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Muestra los datos de la bicicleta: " + this.toString() + " otra vez");
    }

    @Override
    public void CalcularImpuesto(double precio) {
        System.out.println(precio * Impuesto.IVA);
    }
}
