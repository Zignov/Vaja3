import java.util.Scanner;

public class naloga5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String a = "";
        int i = 0;
        while(true){
            a = sc.nextLine();
            i++;
            if(a.equals("konec")){
                System.out.println(i);
                break;
            }
        }
        
    }
}
