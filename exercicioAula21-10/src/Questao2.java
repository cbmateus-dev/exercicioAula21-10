import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma mensagem ");
        String msg = ler.nextLine();
        System.out.println("Digite quantas vezes você quer que a mensagem se repita ");
        int num = ler.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(msg +" repetiu "+(i+1)+" vezes.");
          }
              
         ler.close();
     
    }
}
