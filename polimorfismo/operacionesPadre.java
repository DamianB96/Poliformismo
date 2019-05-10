package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author damian
 */
public abstract class operacionesPadre {

    protected int val1, val2, result;
    Scanner in = new Scanner(System.in);

    public void pedirDatos() {
        System.out.print("Dame el primer valor: ");
        val1 = in.nextInt();

        System.out.print("Dame el segundo valor: ");
        val2 = in.nextInt();
    }

    public abstract void operaciones();

    public void mostrarResultado() {
        System.out.println("el resultado de la operacion es: " + result);
    }
}
