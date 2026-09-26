/*
Haz un programa que tenga estas dos variables:
- numero1 = 10
- numero2 = 5
Y que muestre:
1. Suma
2. Resta
3. Multiplicación
4. División */

public class Valores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multi = numero1 * numero2;
        int division = numero1/numero2;
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+multi);
        System.out.println("Division: "+division);
    }
    
}
