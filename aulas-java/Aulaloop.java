import java.util.Scanner;

public class Aulaloop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    /*for(int cont = 0; cont < 10; cont++ ){
        System.out.println("Lucas Uanderson");
    }
     */


        int cont = 0;
        int max = scan.nextInt();
        while(cont < max){
            System.out.println(cont + " - Lucas U");
            cont++;
        }


}
}

