package interfaces.ejemplo3.model;

public class SeguroCoche {
    private ITaller taller;
    private String aseguradora;

    public SeguroCoche(ITaller taller, String aseguradora){
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public String reparar(Coche c){
        return taller.reparar(c);
    }

    public ITaller getTaller() {
        return taller;
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}
