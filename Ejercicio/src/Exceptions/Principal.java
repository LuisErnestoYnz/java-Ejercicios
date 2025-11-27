package Exceptions;

public class Principal {
    void main(){
        try {
            System.out.println(Principal.calculaDiv(8, -2));
        } catch (CeroException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        } catch (NegativeException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

    private static int calculaDiv(int x, int y) throws CeroException, NegativeException{
        if(y == 0) {
            throw new CeroException("No se puede dividir entre 0");
        }
        if (y < 0) {
            throw new NegativeException("No se puede dividir entre negativos");
        }
        return x / y;
    }
}


