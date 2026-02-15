import java.util.Scanner;
public class  school_Bus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance=sc.nextInt();
        int rate=sc.nextInt();
        int maintenance=sc.nextInt();
        int allowance=sc.nextInt();
        int subsidy=sc.nextInt();

        int Transport = (distance*rate) + maintenance + allowance - subsidy
;

        System.out.println("Total Transport Fee = "+Transport);
        sc.close();
    }
}
