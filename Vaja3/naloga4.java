import java.util.Scanner;

public class naloga4 {
    public static void main (String[]args){

        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (more than 3)");
        int a = sc.nextInt();

        if (a>3){
            while(i < a){
                for(int x = 0; x < (i+1); x++){
                    System.out.print("*");
                }
                System.out.println("");
                i++;  
            }
            
        }

    }
}
