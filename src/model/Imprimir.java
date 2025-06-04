package model;

public interface Imprimir {
    //Metodo Abstracto para mostrar datos
    // Es Abstracto porque no tiene cuerpo
    public static final String
            MENSAJE_BIENVENIDA = "Bienvenido al sistema de gestion de productos";


    public void MostrarDatos();

    default void MostrarBienvenida(){
        System.out.println(MENSAJE_BIENVENIDA);
    }
}
