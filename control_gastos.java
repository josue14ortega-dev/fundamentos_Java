import java.util.Scanner;

public class control_gastos{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad_gastos = 0;
        double [] gastos;
        double total_gastado = 0;
        double gasto_promedio = 0;
        int quinientos = 0;
        
        System.out.println("Cuantos gastos vas a registrar?");
        cantidad_gastos = entrada.nextInt();
        if(cantidad_gastos <= 0){
            System.out.println("El numero de gasto tiene que ser mayor a 0.");
        }else{
            System.out.println("¿Cuales son sus gastos?");
            gastos = new double[cantidad_gastos];
        

        for(int i = 0; i < cantidad_gastos; i++){
                gastos[i] = entrada.nextDouble();
            while(gastos[i] <= 0){
                System.out.println("Los gastos tienen que ser mayores a 0.");
                gastos[i] = entrada.nextDouble();
            }
        }
        double mayor = gastos[0], menor = gastos[0];
        for(int i = 0; i<cantidad_gastos; i++){
            System.out.println("Los gastos son "+ gastos[i]);
            total_gastado += gastos[i];
            if(gastos[i]>500){
                quinientos++;
            }
            if(gastos[i] < menor){
                menor = gastos[i];
            }if(gastos[i] > mayor){
                mayor = gastos[i];
            }
        gasto_promedio = total_gastado/cantidad_gastos;
        } 
        
        
        System.out.println("El promedio es: "+ gasto_promedio);
        System.out.println("Hay "+ quinientos+" gastos mayores a 500.");
        System.out.println("El gasto mayor es: "+ mayor+ " el gasto menor es: "+ menor);
    entrada.close();
        }
    }
}