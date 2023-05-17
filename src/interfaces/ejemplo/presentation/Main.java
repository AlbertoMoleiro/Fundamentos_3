package interfaces.ejemplo.presentation;
import interfaces.ejemplo.model.*;

// Polimorfismo
public class Main {
    public static void main(String[] args) {
        ObjetoVolador objetoVolador = new Ave();
        System.out.println(objetoVolador.volar());

        //Es necesario hacer un cast para poder acceder a los metodos de la clase Ave
        System.out.println(((Ave)objetoVolador).hacerNido());

        objetoVolador = new Avion();
        System.out.println(objetoVolador.volar());

        objetoVolador = new Superman();
        System.out.println(objetoVolador.volar());

        HidroAvion hidroAvion = new HidroAvion();
        ObjetoVolador[] objetosVoladores = new ObjetoVolador[]{new Ave(),new Avion(),new Superman()};

        for (ObjetoVolador volador : objetosVoladores) {
            System.out.println(volador.volar());

            if(volador instanceof Ave){
                System.out.println(((Ave)volador).hacerNido());
            }
        }

        //Declarar arrays de tipo ObjetoVolador y otro de Nautico y llenarlos con los objetos que implementan estas clases
        //Iterar los arrays y llamar a los metodos de cada clase

        ObjetoVolador [] objetosVoladores2 = new ObjetoVolador[]{new Ave(),new Avion(),new Superman(),hidroAvion, new Helicoptero()};
        Nautico [] objetosNauticos = new Nautico[]{hidroAvion, new Barcaza()};

        for (ObjetoVolador volador : objetosVoladores2) {
            System.out.println(volador.volar());
            System.out.println(volador.desepegar());
            System.out.println(volador.aterrizar());

            if(volador instanceof Ave){
                System.out.println(((Ave)volador).hacerNido());
            }

            if(volador instanceof HidroAvion){
                System.out.println(((HidroAvion)volador).atracar());
            }

            if (volador instanceof Helicoptero){
                System.out.println(((Helicoptero)volador).aterrizar());
            }

            if (volador instanceof Superman){
                System.out.println(((Superman)volador).saltarEdificio());

            }

        }

        for (Nautico nautico : objetosNauticos) {
            System.out.println(nautico.navegar());
            System.out.println(nautico.atracar());

            if (nautico instanceof HidroAvion){
                System.out.println(((HidroAvion)nautico).volar());
            }

            if (nautico instanceof Barcaza){

            }
        }
    }
}