package interfaces.ejemplo.model;

public class Avion extends Vehiculo implements ObjetoVolador{

    public Avion() {

    }
    @Override
    public String volar() {
        return "El avion esta volando";
    }

    @Override
    public String desepegar() {
        return "El avion esta despegando";
    }

    @Override
    public String aterrizar() {
       return   "El avion esta aterrizando";
    }



}
