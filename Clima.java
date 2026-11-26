import java.util.Scanner;

public class Clima {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dias;
        int treinta=0, diez=0;
        double max = 0, min=0, promedio, suma = 0;
        double[] climas;
        
        System.out.println("¿Cuantos dias quieres registrar?");
        dias = entrada.nextInt();
        if (dias >= 3 && dias <= 10) {
            climas = new double[dias];
            System.out.println("¿Cuales fueron las temperaturas registradas?");
            
            for(int i =0; i < dias; i++){
                climas[i] = entrada.nextDouble();
                
                suma = suma + climas[i];
                if(climas[i] > 30){
                    treinta += 1;
                }else if(climas[i]< 10){
                    diez += 1;
                }
                
                if(i == 0){
                    max = climas[i];
                    min = climas[i];
                }else{
                    if(max < climas[i]){
                        max = climas[i];
                    }if(min > climas[i]){
                        min = climas[i];
                    }
                }
                
            }
            promedio = suma/dias;
            System.out.println("Hubo "+ treinta+" dias superiores a los 30°C.");
            System.out.println("Hubo "+ diez+ " dias inferiores a 10°C.");
            System.out.println("La tempertura promedio fue: "+ promedio+"°C");
            System.out.println("La temperatura menor fue de "+min+ "°C, y la mayor fue de "+max+"°C");
        }else{
            System.out.println("Tiene que ser entre 3 - 10 dias.");
        }
        entrada.close();
    }
}
