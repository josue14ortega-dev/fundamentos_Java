/*
Ejercicio 7 — Interés compuesto
Crea un programa que tenga:
- Una cantidad inicial de dinero.
- Una tasa de interés.
- Un número de años.
- El resultado final después de aplicar el interés compuesto.
 */
public class Int_compuestos {
    public static void main(String[] args) {
    int presu_inicial = 1000;
    double tasa_intereses = 0.13;
    int años = 6;
    double total = presu_inicial * Math.pow(1 + tasa_intereses, años); ///La formula es: (VF = C * (1 + i)^n///
    System.out.println("Dentro de 6 años tendras: " + total);
    }
}