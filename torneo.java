import java.util.Scanner;

public class torneo {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] tabla = new String[8];
        int equipos = 0;
        int[] partidos = new int[8];
        int[] victorias = new int[8];
        int[] empates = new int[8];
        int[] derrotas = new int[8];
        int[] puntos = new int[8];
        

        System.out.println("¿Cuantos equipos vas a registrar?");
        equipos = entrada.nextInt();
        String equipo = entrada.nextLine();
        
        if (equipos <=8 && equipos >=2){
            System.out.println("¿Como se llaman los equipos?");
            for(int i =0; i< equipos; i++){
                boolean esValido = true;
                equipo = entrada.nextLine().trim();
                for(int j =0 ; j < i; j++){
                    if(tabla[j].equalsIgnoreCase(equipo)){
                        esValido = false;
                        break;
                }
            }
            if (esValido){
                tabla[i] = equipo;
            }else{
                System.out.println("Ese equipo ya esta registrado.");
                i--;
            }
            }
        
        for(int i = 0; i < equipos;i++){
            System.out.printf("%-18s | %3d | %3d | %3d | %3d | %4d%n",
            tabla[i],
            partidos[i],
            victorias[i],
            empates[i],
            derrotas[i],
            puntos[i]
            );
        }

        boolean continuar = true;
        String respuesta;
        while (continuar) {
            int pos1 = -1;
            int pos2 = -1;
            String equipo1;
            String equipo2;
            System.out.println("¿Que equipos quieres ver?");
            equipo1 = entrada.nextLine();
            equipo2 = entrada.nextLine();
            for(int i = 0; i<equipos; i++){
                if(tabla[i].equalsIgnoreCase(equipo1)){
                    pos1 = i;
                }
                if (tabla[i].equalsIgnoreCase(equipo2)){
                    pos2 = i;
                }
            }
            if(pos1 == pos2){
                System.out.println("Error");
            }else if (pos1 == -1|| pos2 == -1) {
                System.out.println("Error");
            }else{
                int golE1 =0, golE2=0;
                System.out.println("Goles de "+tabla[pos1]+":");
                golE1 =entrada.nextInt();
                System.out.println("Goles de "+tabla[pos2]+":");
                golE2 = entrada.nextInt();
                respuesta = entrada.nextLine();

                if(golE1<0 || golE2 <0){
                    System.out.println("No puede haber goles negativos.");
                }else{
                    if (golE1 > golE2){
                        System.out.println("Gano "+tabla[pos1]);
                        partidos[pos1]+=1;
                        puntos[pos1]+=3;
                        victorias[pos1]+=1;
                        partidos[pos2]+=1;
                        derrotas[pos2]+=1;
                    }else if(golE2>golE1){
                        System.out.println("Gano "+tabla[pos2]);
                        partidos[pos2]+=1;
                        puntos[pos2]+=3;
                        victorias[pos2]+=1;
                        partidos[pos1]+=1;
                        derrotas[pos1]+=1;
                    }else{
                        System.out.println("Empate");
                        partidos[pos1]+=1;
                        puntos[pos1]+=1;
                        empates[pos1]+=1;
                        partidos[pos2]+=1;
                        empates[pos2]+=1;
                        puntos[pos2]+=1;
                    }
                
                
                for(int i = 0; i<equipos;i++){
                    for(int j = i+1; j<equipos;j++){
                        if(puntos[i]<puntos[j] || puntos[i] == puntos[j] &&victorias[i] < victorias[j]){
                            int auxPartidos = partidos[i];
                            String auxEquipos = tabla[i];
                            int aux = puntos[i];
                            int auxVictorias = victorias[i];
                            int auxEmpates = empates[i];
                            int auxDerrotas = derrotas[i];
                            puntos[i] = puntos[j];
                            puntos[j] = aux;
                            tabla[i] = tabla[j];
                            tabla[j] = auxEquipos;
                            partidos[i] = partidos[j];
                            partidos[j] = auxPartidos;
                            victorias[i] = victorias[j];
                            victorias[j] = auxVictorias;
                            empates[i] = empates[j];
                            empates[j] = auxEmpates;
                            derrotas[i] = derrotas[j];
                            derrotas[j] = auxDerrotas;
                            for( i = 0; i < equipos;i++){
                                System.out.printf("%-18s | %3d | %3d | %3d | %3d | %4d%n",
                    tabla[i],
                    partidos[i],
                    victorias[i],
                    empates[i],
                    derrotas[i],
                    puntos[i]
                    );
                }
                        }
                    }
                }
            
                System.out.println("¿Quieres registrar otro partido?(si/no");
                respuesta = entrada.nextLine();
                if(respuesta.equalsIgnoreCase("no")){
                    continuar = false;
                }else if(respuesta.equalsIgnoreCase("si")){
                    continuar = true;
                }else{
                    System.out.println("Respuesta invalida.");
                    continuar = false;
                }
            }
        }    
    }
        }else{
            System.out.println("Tiene que ser entre 2 y 8 equipos.");
        }entrada.close();
    }
}