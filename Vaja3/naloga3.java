import java.util.Scanner;

public class naloga3 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int b = 0;
        int c = 0;

        for (int i = 0; i<10; i++){
            System.out.println("Enter your number");
            int a = sc.nextInt();

            b *= a;
            c +=a ;
        }

        System.out.println("Multiplied: " + b);
        System.out.println("Average: " + c/10);
    }
}
