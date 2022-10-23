import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numero inicial ");
        int numInicial = ler.nextInt();
        System.out.println("Digite o numero final ");
        int numFinal = ler.nextInt();
        if (numInicial < numFinal) {

            for (int i = numInicial + 1; i < numFinal; i++) {
                System.out.println(i + " Esta entre " + numInicial + " e " + numFinal);
            }
        }
        else{
            for (int i = numFinal +1 ; i < numInicial; i++) {
                System.out.println(i + " Esta entre " + numInicial + " e " + numFinal);
            }

        }
        ler.close();

    }
}
