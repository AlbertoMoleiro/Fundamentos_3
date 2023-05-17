package interfaces.ejemplo3.presentation;
import interfaces.ejemplo3.model.*;
public class Main {

    public static void main(String[] args) {

        SeguroCoche seguro = new SeguroCoche(new TallerMecanica(), "Mapfre");

        Coche coche = new Coche("1234ABC", 2010);

        System.out.println(seguro.reparar(coche));

        seguro.setTaller(new TallerPintura());

        System.out.println(seguro.reparar(coche));
    }
}
