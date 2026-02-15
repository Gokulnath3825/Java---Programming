import java.util.Scanner;

public class car_rental {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days=sc.nextInt();
        int rent=sc.nextInt();
        int late=sc.nextInt();
        int fuel=sc.nextInt();
        int maintenance=sc.nextInt();

        int Profit =(days*rent)+late-fuel-maintenance;


        System.out.println("Net Profit = "+Profit);
        sc.close() ;
    }

    
}