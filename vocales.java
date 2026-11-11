import java.util.Scanner;

public class vocales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Frase;
        int vocales = 0;

        System.out.println("Di una frase: ");
        Frase = entrada.nextLine();
        for(int i  = 0; i < Frase.length(); i++){
            char caracter = Character.toLowerCase(Frase.charAt(i));
            if(caracter =='a'|| caracter =='e'||caracter=='i'||caracter=='o'|| caracter=='u'){
                vocales ++;
            }
        }
        System.out.println("hay "+vocales+" vocales.");
        entrada.close();
    }
}