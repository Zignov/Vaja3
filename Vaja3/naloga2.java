import java.util.Scanner;


public class naloga2 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number (10-1000)");
        int a = sc.nextInt();
        int b = 0;

        if (10 <= a && 1000 >= a){
            
            for (int i=1; i != (a+1);i++){
                b += i;
            }


            System.out.println(b);

        }
        else{
            System.out.println("Your input is incorrect");
        }

    }
}
