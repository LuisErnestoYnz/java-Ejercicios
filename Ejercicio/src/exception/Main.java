package exception;

import Exceptions.NegativeException;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int resultado = 0;

        try {
            resultado = calculaDiv(a, b);
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("No se pudo ejecutar la operacion");
        } catch (NegativeException e) {
            e.printStackTrace();
            System.out.println("No se pudo ejecutar la operacion");
        } finally {
            System.out.println("Resultado: " + resultado);
        }
    }

    private static int calculaDiv(int a, int b) throws MyException, NegativeException {
        if(b == 0) {
            throw new MyException("No se puede dividir entre cero");
        }
        if(b < 0) {
            throw new NegativeException("no se puede dividir etre negativos");
        }
        return a / b;
    }
}
