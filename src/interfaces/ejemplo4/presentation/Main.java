package interfaces.ejemplo4.presentation;
import interfaces.ejemplo4.model.*;
public class Main {
    public static void main(String[] args) {
       Cliente juan = new Cliente("Juan", "12345678A");
       AccesoDesarrollo accesoDesarrollo = new AccesoDesarrollo();
       AccesoProduccion accesoProduccion = new AccesoProduccion();
        ClienteDao clienteDao = new ClienteDao(accesoDesarrollo);
        System.out.println(clienteDao.insertar(juan));

        clienteDao.setConexion(accesoProduccion);
        System.out.println(clienteDao.insertar(juan));

    }
}
