package EJERCICIO07;

public class Ejercicio7 {
    public static void main(String[] args) {

        Ejercicio10 Ex10;

        Ex10 = new Ejercicio10();
        System.out.println("El nivel del ejercicio 10 es ");
        System.out.println(Ex10.toString()); 
    }

    public static String Imprimir(Ejercicio10 ejercicio10){
        String result;
        result =" " + ejercicio10.nivel;
        return result;
    }
}

