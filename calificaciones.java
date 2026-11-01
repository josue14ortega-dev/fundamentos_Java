import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int alumnos = 0;
        float calificaciones = 0;
        float promedio = 0;
        float cali_max =0;
        float cali_men=0;
        int aprobados=0;
        int reprobados = 0;
        float suma = 0;
        int i = 1;
        
        System.out.println("¿Cuantos alumnos vas a registrar?");
        alumnos = entrada.nextInt();
        if(alumnos>0){
            while (i <= alumnos){
            System.out.println("¿Cuales son sus calificaciones");
            calificaciones = entrada.nextFloat();
            while(calificaciones >100 || calificaciones <0){
                System.out.println("Las calificaciones tienen que ser entre 0 - 100.");
                calificaciones = entrada.nextFloat();
                }
            if(i == 1){
            cali_max = calificaciones;
            cali_men = calificaciones;
            }else{
                if(calificaciones> cali_max){
                    cali_max = calificaciones;
                }
                if(calificaciones< cali_men){
                    cali_men = calificaciones;
                }
            }
            suma = suma + calificaciones;
            i ++;
           
            
            if(calificaciones >= 70){
                aprobados ++;
            }else{
                reprobados ++;
            
            }
        }
            promedio = suma/alumnos;
            System.out.println("El promedio del grupo es: "+ promedio + "/100.");
            System.out.println("Hay "+ aprobados + " alumnos aprobados y "+ reprobados + " alumnos reprobados.");
            System.out.println("La mayor calificacion fue: "+ cali_max +" y la menor fue " + cali_men);
        }else{
        System.out.println("Debes agregar un alumno.");
        }
    entrada.close();
    }
}
            
            
