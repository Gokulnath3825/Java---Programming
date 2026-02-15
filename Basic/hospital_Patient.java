import java.util.Scanner;
public class hospital_Patient{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roomCharge=sc.nextInt();
        int days=sc.nextInt();
        int medicineCost=sc.nextInt();
        int labFees=sc.nextInt();
        int insuranceCoverage=sc.nextInt();

        int total=(roomCharge*days) + medicineCost + labFees - insuranceCoverage;

        System.out.println(total);
        sc.close() ;
    }
}