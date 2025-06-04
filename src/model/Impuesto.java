package model;

public interface Impuesto {
    public static final double IVA = 0.21;
    //metodo privado
    private static double AlicuotaenPorcentaje(){
        return IVA*100;
    }
    //metodo estatico
    static void MostrarAlicoutaIva(){
        System.out.println("Alicuota IVA: " + AlicuotaenPorcentaje()+ "%");
    }
    //metodo abstracto
    public void CalcularImpuesto(double precio);
}
