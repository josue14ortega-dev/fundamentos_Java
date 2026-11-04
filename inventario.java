import java.util.Scanner;

public class inventario {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int inventario = 50, venta = 0, reabastecer = 0, opcion;
        do{
            System.out.println("1. Consultar existencias.");
            System.out.println("2. Registrar una venta.");
            System.out.println("3. Reabastecer productos.");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Hay "+inventario+ " productos.");
                    break;
                case 2:
                    System.out.println("¿Cuantas unidades se vendieron? ");
                    venta = entrada.nextInt();
                    if(venta <= inventario){
                        if(venta>0){
                        inventario = inventario - venta;
                        System.out.println("Hay "+inventario+ " productos.");
                        System.out.println("Se vendieron " +venta+" productos.");
                        }else{
                            System.out.println("Las ventas tienen que ser un numero mayor a 0");
                        }
                    }else{
                        System.out.println("No se puede vender un numero mayor al inventario.");
                    }break;
                case 3:
                    System.out.println("¿Cuantos productos quieres agregar?");
                    reabastecer = entrada.nextInt();
                    if(reabastecer>0){
                        inventario= inventario +reabastecer;
                        System.out.println("Se agregaron "+ reabastecer+" productoas. Hay "+ inventario+ " productos");
                    }else{
                        System.out.println("Tiene que ser un numero mayor a 0.");
                    }break;

                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opcion es invalida.");
                    break;
            }
        }while(opcion!=4);

    
    entrada.close();
    }
}