package exceptions;

public class BicicletaException extends Exception{

    private int id;

    public BicicletaException(int id){
        super();
        this.id = id;
    }

    @Override
    public String getMessage(){
        String msg="";
        if (id ==1)
            msg= "El rodado de la bicicleta no es correcto. Error id:" + id;
        return msg;
    }

}
