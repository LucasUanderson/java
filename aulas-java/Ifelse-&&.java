public class aula2 {

    public static void main(String[] args) {

        int nota = 85;
        int media = 60;
        int faltas = 4;
        int maxfaltas = 5;
        String aluno = "lucas Uanderson";


        if ((nota >= media) && (faltas <= maxfaltas)){
            System.out.println( "O aluno " +aluno + " está aprovado");
        }else if (nota >= 40){
            System.out.println("O aluno " +aluno + "Recuperação");
        }else {
            System.out.println( "O aluno " +aluno + "Reprovado");
        }

        System.out.println("Fim do programa");


    }
}
