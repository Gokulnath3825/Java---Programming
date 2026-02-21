import java.util.Scanner;
public class universityCourse13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status = sc.next();
        int hours = sc.nextInt();
        String type = sc.next();
        String Residency = sc.next();

        double baseTution = 0.0;
        if(type.equals("Undergraduate")){
            baseTution=350;
        }
        else if(type.equals("Graduate")){
            baseTution=550;
        }
        else if(type.equals("Professional")){
            baseTution=800;
        }
        double Multiplier = 0.0;
        if(Residency.equals("In-State")){
            Multiplier=1.0;
        }
        else if(Residency.equals("Out-of-State")){
            Multiplier=2.5;
        }
        else if(Residency.equals("International")){
            Multiplier=3.0;
        }
        double fee=0.0;
        double actFee=0.0;
        if(status.equals("Full-Time")){
            actFee=200;
            if(type.equals("Undergraduate")){
                fee=500;
            }
            else if(type.equals("Graduate")){
                fee=750;
            }
            else if(type.equals(" Professional")){
                fee=1200;
            }
        }
        else if(status.equals("Part-Time")){
            actFee=100;
            if(type.equals("Undergraduate")){
                fee=300;
            }
            else if(type.equals("Graduate")){
                fee=750;
            }
            else if(type.equals(" Professional")){
                fee=1200;
            }
        }else{
            actFee=50;
            fee=150;
        }

        double tuitionCost = hours * baseTution * Multiplier;
        double totalFee = tuitionCost+fee + actFee;
        String category = "";
        if(Residency.equals("In-State")&&status.equals("Full-Time")){
            category="Standard";
        }
        else if(status.equals("-Continuing-Education")){
            category="Reduced";
        }
        else if(Residency.equals("Out-of-State")&&status.equals("International")){
            category="Premium";
        }

        System.out.println(" ");
        System.out.println("Student Status: "+status);
        System.out.println("Credit Hours: "+hours);
        System.out.println("Program Type: "+type);
        System.out.println("Residency: "+Residency);
        System.out.println("Base Tuition Per Credit: $ "+baseTution);
        System.out.println("Residency Multiplier: "+Multiplier+"x");
        System.out.println("Program Fee: $ "+fee);
        System.out.println("Student Activity Fee: $"+actFee);
        System.out.println("Total Registration Fee: $"+totalFee);
        System.out.println("Fee Category:"+category);
    }

    
}
