import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int estudiantes = 0;
        float[] calificaciones;
        float suma = 0;
        
        System.out.println("¿Cuantos estudiantes son? ");
        estudiantes = entrada.nextInt();
        if(estudiantes<= 0){
            System.out.println("Tiene que ser mayor a 0.");
        }else{
        System.out.println("¿Cuales son sus calificaciones? ");
        calificaciones = new float[estudiantes];
        
       
        for(int i = 0; i < estudiantes; i++){
                calificaciones[i] = entrada.nextFloat();
            while(calificaciones[i] <0 || calificaciones[i]>100){
                System.out.println("La calificacion debe ser entre 0-100.");
                calificaciones[i]=  entrada.nextFloat();
            }
            
        }
        float mayor = calificaciones[0],menor = calificaciones[0];
        int aprobadas = 0, reprobadas = 0;
        for(int i =0; i < estudiantes ; i++){
                System.out.println("Las calificaciones son "+ calificaciones[i]);
                suma += calificaciones[i];
                if(calificaciones[i] >mayor){
                    mayor = calificaciones[i];
                }if(calificaciones[i] < menor){
                    menor = calificaciones[i];
                }
                if(calificaciones[i] < 70){
                    reprobadas ++;
                }else{
                    aprobadas ++;
                }
        }
    System.out.println("El promedio es: " + suma/estudiantes);
    System.out.println("El mayor es:"+ mayor+ " , y el menor: "+menor);
    System.out.println("Tiene "+ aprobadas+ " materias aprobadas y "+ reprobadas+" materias reprobadas");
    }entrada.close();
    }
}



