package polimorfismo;

/**
 *
 * @author damian
 */
public class mainClass {

    public static void main(String[] args) {

        operacionesPadre mensajeroSuma = new sumaHija();
        mensajeroSuma.pedirDatos();
        mensajeroSuma.operaciones();
        mensajeroSuma.mostrarResultado();

        operacionesPadre mensajeroResta = new restaHija();
        mensajeroResta.operaciones();
        mensajeroResta.pedirDatos();
        mensajeroResta.mostrarResultado();
    }

}
