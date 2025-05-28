package model;

public class Producto {
    private int id;
   private String producto;
   private double precio;
   private String descripcion;
   static int cantidadProductos=0;

   public Producto(){

   }
   public Producto(String producto,double precio,String descripcion){
       cantidadProductos++;
       this.id= cantidadProductos;
       this.producto = producto;
       this.precio=precio;
       this.descripcion=descripcion;
   }



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + this.id +
                ", producto='" + this.producto + '\'' +
                ", precio=" + this.precio +
                ", descripcion='" + this.descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj) return true;
        if (!(obj instanceof Producto)) return false;
        Producto producto1 = (Producto) obj;
        if (Double.compare(producto1.precio,precio)!=0) return false;
        if (!producto.equals(producto1.producto)) return false;
        return descripcion.equals(producto1.descripcion);
    }

    @Override
    public int hashCode() {
       int result=1;
       return result;
    }
}
