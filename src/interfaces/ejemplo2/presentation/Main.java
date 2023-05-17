package interfaces.ejemplo2.presentation;
import interfaces.ejemplo2.model.*;
public class Main {

    public static void main(String[] args) {
        Conductor Ruben = new Conductor(new Coche(40));

        System.out.println(Ruben.Conducir());
    }
}
