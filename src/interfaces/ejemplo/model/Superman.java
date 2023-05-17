package interfaces.ejemplo.model;

public class Superman extends Kriptoniano implements ObjetoVolador{

        public Superman() {

        }
        @Override
        public String volar() {
            return "Superman esta volando";
        }

        @Override
        public String desepegar() {
            return "Superman esta despegando";
        }

        @Override
        public String aterrizar() {
            return  "Superman esta aterrizando";
        }

        public String saltarEdificio(){
            return "Superman esta saltando un edificio";
        }

        public String detenerBala(){
            return "Superman esta deteniendo una bala";
        }
}
