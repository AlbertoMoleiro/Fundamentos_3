package interfaces.ejemplo.model;

public class Ave extends Animal implements ObjetoVolador{

        public Ave() {

        }
        @Override
        public String volar() {
            return "El ave esta volando";
        }

        @Override
        public String desepegar() {
            return "El ave esta despegando";
        }

        @Override
        public String aterrizar() {
           return   "El ave esta aterrizando";
        }

        public String hacerNido(){
            return "El ave esta haciendo un nido";
        }

        public String ponerHuevos(){
           return "El ave esta poniendo huevos";
        }
}
