package interfaces.ejemplo.model;

public class Barcaza extends Vehiculo implements Nautico {
    public String atracar() {
        return "Atracando";
    }

    public String navegar() {
        return "Navegando";
    }
}
