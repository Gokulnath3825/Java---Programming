
import java.util.Scanner;

public class bankLoan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int score=sc.nextInt();

        if(salary>25000 && score>700){
            System.out.println("Approved");
        }else{
            System.out.println("Rejected");
        }

        sc.close();
    }
    
}
