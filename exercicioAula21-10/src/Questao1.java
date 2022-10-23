import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um Numero ");
        int num = ler.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Resultado da tabuada do numero "+num +" é "+num*(i+1));
          }
              
         ler.close();
     
    }
}
