import java.util.Scanner;
public class cajero_automatico {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        float saldo, deposito, retiro;
        int opcion;
        saldo = 1000;
        deposito = 0;
        retiro = 0;
        do{
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Opcion: ");

            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Tu saldo es: "+ saldo);
                    break;
                case 2:
                    System.out.println("¿Cuanto quieres depositar");
                    deposito = entrada.nextFloat();
                    
                    if(deposito > 0){
                        saldo = saldo + deposito;
                        System.out.println("Tu nuevo saldo es de: "+ saldo);
                    }
                    break;
                case 3:
                    
                    System.out.println("¿Cuanto quieres retirar?");
                    retiro = entrada.nextFloat();
                    if(retiro > 0 && retiro <= saldo){
                        saldo = saldo - retiro;
                        System.out.println("Tu nuevo saldo es de: "+ saldo);
                    }else{
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo");
             }
        }while(opcion != 4);
    entrada.close();
    }
    
}
