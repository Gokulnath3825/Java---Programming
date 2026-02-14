import java.util.Scanner;
public class Grocery_Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sales=sc.nextInt();
        int discount=sc.nextInt();
        int gst=sc.nextInt();

        int totaldis=(sales*discount)/100;
        float gstAmount=((sales-totaldis)*gst)/100.0f;

        float Bill=(sales-totaldis)+gstAmount;
        System.out.println(Bill);
        sc.close();
    }

    
}
