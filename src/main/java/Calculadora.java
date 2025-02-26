/**
 * Clase que sumo o que opera con dos enteros
 * @author
 * @version 1.0
 * @fecha 2021/09/07
 */
public class Calculadora {

    /**
     * Metodo que suma dos enteros
     * @param a primer entero
     * @param b segundo entero
     * @return la suma de los dos enteros
     */

    public int sumar(int a, int b) {
        return a+b;
    }

    public int restar(int a, int b) {
        return a-b;
    }

    public int multiplicar(int a, int b) {
        return a*b;
    }

    public float dividir(int a, int b) {
        if (b == 0)
            throw new ArithmeticException();

        return a/b;
    }

    public int resto(int a, int b) {
        return a%b;
    }
}
