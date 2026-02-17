import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String parImpar;
        String positivoNegativo;
        String primo;

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if(numero < 0){
            positivoNegativo = "Negativo";
        } else if (numero > 0) {
            positivoNegativo = "Positivo";
        }else {
            positivoNegativo = "Zero";
        }

        if(numero % 2 != 0){
            parImpar = "Ímpar";
        }else{
            parImpar = "Par";
        }

        if(verificarPrimo(numero)){
           primo = "Primo";
        }else {
            primo = "Não primo";
        }

        entrada.close();
        System.out.println("*-------------------------*");
        System.out.println(" Verificando o número "+numero);
        System.out.println("*-------------------------*");
        System.out.println("Positivo/Negativo: "+positivoNegativo);
        System.out.println("Par/Ímpar: "+parImpar);
        System.out.println("Primo/Não Primo: "+primo);
        System.out.println("*-------------------------*");


    }
    //verifica se o numero é primo
    public static boolean verificarPrimo(int numero){
        if(numero <= 1){
            return false;
        }else{
            for (int i = 2;i < numero;i++){
                if (numero % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}