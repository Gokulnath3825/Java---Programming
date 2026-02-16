
import java.util.*;

public class employeeOverTime {
    public static void main(String[] args) {
        Scanner sc =new  Scanner (System.in);
        int hours=sc.nextInt();
        int attendance=sc.nextInt();

        if(hours>40 && attendance>90){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");

        }
    }
}
