import java.util.Scanner;

public class credirCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit  = sc.nextInt();
        int amount = sc.nextInt();
        int block=sc.nextInt();

        if(amount<=limit && block==0){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
        sc.close();
    }
}
