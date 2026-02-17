
import java.util.Scanner;

public class smartElectricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
        int mask=sc.nextInt();

        int bit = value & mask;
        if(bit!=0){
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
        sc.close();
    }
    
}
