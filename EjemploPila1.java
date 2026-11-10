package EjemploPila1;

/**
 *
 * @author BRS
 * Descripción: Ejemplificar el uso de pilas. en este proyecto crear una pila
 *          de 10 elementos que inserte nombres de personas.
 * FEcha: 28/10/2026
 */

public class EjemploPila1 {

    public static void main(String[] args) {

        PilaNombres objPila = new PilaNombres();

        VistaPila objVista = new VistaPila();

        ControladorPila objControlador =
                new ControladorPila(objPila, objVista);

        objControlador.iniciar();
    }
}

