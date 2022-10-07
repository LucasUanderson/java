import java.util.Scanner;

public class AulascannerNota {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);


    final int MEDIA = 60;
    int n1 = 0, n2 = 0, n3 = 0,n4 = 0,  nota =0;
    String nome = "", result ="";

        System.out.println("Digite nome aluno: ");
        nome = scan.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3 = scan.nextInt();
        System.out.println("Digite a quarta nota: ");
        n4 = scan.nextInt();

        nota = n1 + n2 + n3 + n4;

        if(nota >= MEDIA){
            result = "Aprovado";
        }else if (nota >= 40){
            result = "Recuperacao";
        }else{
            result = "Reprovado";
        }

       System.out.printf("Aluno %s foi %s ,com nota %d",nome,result,nota);


}
}

