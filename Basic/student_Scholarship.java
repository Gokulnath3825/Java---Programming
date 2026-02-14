import java.util.Scanner;
public class student_Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tutionFee=sc.nextInt();
        int scholarship=sc.nextInt();
        int examFee=sc.nextInt();
        int library=sc.nextInt();

        int totaldis=(tutionFee*scholarship)/100;
        int totalTution=(tutionFee-totaldis)+examFee+library;
        
        System.out.println(totalTution);
        sc.close();
    }

    
}
