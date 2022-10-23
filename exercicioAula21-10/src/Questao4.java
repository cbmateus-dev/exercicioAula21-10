import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a palavra para acertar");
            String palavra = ler.nextLine();

            if (palavra.contentEquals("Java-2022")) {
                System.out.println("Palavra Correta");
                break;
            } else if ((i + 1 == 5)) {
                System.out.println("Você gastou todas as tentativas");
                break;
            } else {
                System.out.println("Palavra Incorreta, tente novamente");
            }
            System.out.println("Você gastou " + (i + 1) + " tentativa.");
        }
        ler.close();
    }
}
