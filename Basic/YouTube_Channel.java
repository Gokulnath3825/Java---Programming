import java.util.Scanner;

public class YouTube_Channel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ads=sc.nextInt();
        int sponsor=sc.nextInt();
        int affiliate=sc.nextInt();
        int tax=sc.nextInt();
        int production=sc.nextInt();

        int Income =ads+sponsor+affiliate-tax-production;


        System.out.println("Final Toutube income = "+Income);
        sc.close();
    }
    
}
