import java.util.Scanner;

public class estadistica_numeros{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad_numeros;
        float preguntas;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        float suma = 0;
        int n = 1;
        
        System.out.println("¿Que cantidad de numero vas a registrar?");
        cantidad_numeros = entrada.nextInt();
        if(cantidad_numeros > 0){
        for(int i = 1; i <= cantidad_numeros; i ++){
            System.out.println("numero " + n++);
            preguntas = entrada.nextFloat();
            if(preguntas < 0){
                negativos ++;
            }else if(preguntas > 0){
                positivos ++;
            }else if(preguntas == 0){
                ceros ++;
            }
            suma += preguntas;
        }
        System.out.println("Positivos: "+positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println("Ceros: " + ceros);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: "+ suma/cantidad_numeros);
        entrada.close();
    }else{
        System.out.println("Debe ser un numero mayor 0");
    }
        
        
    }
}