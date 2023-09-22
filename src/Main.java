import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculcarMedia();
    }

    public static void  calculcarMedia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nome do aluno:");
        String nome = scanner.next();
        System.out.println("primeira nota:");
        int n1 = scanner.nextInt();
        System.out.println("primeira nota:");
        int n2 = scanner.nextInt();
        System.out.println("primeira nota:");
        int n3 = scanner.nextInt();
        System.out.println("primeira nota:");
        int n4 = scanner.nextInt();
        double media = (double) (n1 + n2 + n3 + n4)/4;
        if(media >= 7){
            System.out.println("aluno " + nome + ", aprovado por media com nota: " + media);
        } else if (media >= 6 && media < 7){
            System.out.println(nome +", conversa com o professor pra ver se ganha um ponto hehe");
        } else {
            System.out.println("REPROVADO");
        }
    }
}