package ejecutor;

import controller.Controlador;
import java.io.IOException;

public class Princiapl  {
  
     public static void main(String[] args) {

    Controlador controlador = new Controlador();
    controlador.seleccionarArchivo("D:\\Escritorio\\hol.txt");
    controlador.setLlave("bankai");
        try {
            controlador.encriptar();
//            controlador.desencriptar();
        } catch (IOException ex) {
            System.err.println("hola que haces?");
        }
    }      

}
