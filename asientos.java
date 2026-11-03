import java.util.Scanner;

public class asientos{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int asientos = 10;
        int ocupados = 0;
        int cantidad_reserva = 0;
        int opcion = 1;
        
        while(ocupados < asientos && opcion!=2){
            System.out.println("1. Reservar");
            System.out.println("2. salir");
            opcion = entrada.nextInt();
            if(opcion == 1){
                System.out.println("¿Cuales la cantidad de asientos que quieres reservar?");
                cantidad_reserva = entrada.nextInt();
                if(cantidad_reserva <= 0){
                    System.out.println("La cantidad es invalida");
                }else if(cantidad_reserva >(asientos-ocupados)){
                    System.out.println("No hay suficientes asientos");
                
                
                }else{
                    ocupados += cantidad_reserva;
                }
            }else if(opcion ==2){
                System.out.println("Saliendo");
            }else{
                System.out.println("Tienes que escoger entre el 1 y 2");
            }
        
        }
        System.out.println("La cantidad de reserva es "+cantidad_reserva+" Los asientos ocupados son "+ocupados+ " los asientos disponibles son "+ (asientos - ocupados));
    entrada.close();
    }
}