package interfaces.ejemplo.model;

public class HidroAvion extends Avion implements Nautico {
    public String atracar() {
        return "Atracando";
    }

    public String navegar() {
        return "Navegando";
    }
}
