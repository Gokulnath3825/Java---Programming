import java.util.Scanner;

public class cinema_Theatre{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticketRevenue=sc.nextInt();
        int snackRevenue=sc.nextInt();
        int maintenance=sc.nextInt();
        int electricity=sc.nextInt();

        int Profit = ticketRevenue + snackRevenue-maintenance-electricity;

        System.out.println("Net Profit = "+Profit);
        sc.close();
    }
    
}