import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String parImpar;
        String positivoNegativo;

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
            parImpar = "ímpar";
        }else{
            parImpar = "Par";
        }



    }
}