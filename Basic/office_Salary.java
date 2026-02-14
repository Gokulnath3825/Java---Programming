import java.util.Scanner;
public class office_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int BP=sc.nextInt();
        int HRA=sc.nextInt();
        int PB=sc.nextInt();
        int PT=sc.nextInt();
        int PF=sc.nextInt();
        int total=BP+HRA+PB-PT-PF;
        System.out.println(total);
        sc.close();
    }
    
}
