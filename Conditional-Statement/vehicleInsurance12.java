import java.util.Scanner;
public class vehicleInsurance12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int driverAge = sc.nextInt();
        sc.nextLine(); 
        String vehicleType = sc.nextLine();
        String drivingRecord = sc.nextLine();
        String coverageLevel = sc.nextLine();

        double basePremium = 0.0;
        double ageFactor = 1.0;
        double vehicleRiskFactor = 1.0;
        int recordAdjustment = 0;
        String riskCategory = "";
        if (coverageLevel.equals("Basic")) {
            basePremium = 500.0;
        } else if (coverageLevel.equals("Standard")) {
            basePremium = 800.0;
        } else if (coverageLevel.equals("Comprehensive")) {
            basePremium = 1500.0;
        }

        if (driverAge >= 16 && driverAge <= 21) {
            ageFactor = 1.8;
        } else if (driverAge >= 22 && driverAge <= 25) {
            ageFactor = 1.5;
        } else if (driverAge >= 26 && driverAge <= 40) {
            ageFactor = 1.0;
        } else if (driverAge >= 41 && driverAge <= 60) {
            ageFactor = 0.9;
        } else if (driverAge >= 61) {
            ageFactor = 1.1;
        }

        if (vehicleType.equals("Sedan")) {
            vehicleRiskFactor = 1.0;
        } else if (vehicleType.equals("SUV")) {
            vehicleRiskFactor = 1.2;
        } else if (vehicleType.equals("Sports")) {
            vehicleRiskFactor = 1.5;
        } else if (vehicleType.equals("Truck")) {
            vehicleRiskFactor = 1.1;
        }

        if (drivingRecord.equals("Clean")) {
            recordAdjustment = -10;
        } else if (drivingRecord.equals("Minor-Violations")) {
            recordAdjustment = 25;
        } else if (drivingRecord.equals("Major-Violations")) {
            recordAdjustment = 50;
        }

        double adjustedPremium = basePremium * ageFactor * vehicleRiskFactor;
        double finalPremium = adjustedPremium * (1 + recordAdjustment / 100.0);
        double monthlyPremium = finalPremium / 12.0;

        if (drivingRecord.equals("Major-Violations")) {
            if (ageFactor >= 1.5) {
                riskCategory = "Very High";
            } else {
                riskCategory = "High";
            }
        } else if (drivingRecord.equals("Minor-Violations")) {
            if (ageFactor >= 1.5 || vehicleRiskFactor >= 1.5) {
                riskCategory = "Very High";
            } else {
                riskCategory = "Medium";
            }
        } else {
            if (ageFactor <= 1.0 && vehicleRiskFactor <= 1.2) {
                riskCategory = "Low";
            } else {
                riskCategory = "Medium";
            }
        }

        System.out.println("Driver Age: " + driverAge);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Driving Record: " + drivingRecord);
        System.out.println("Coverage Level: " + coverageLevel);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Age Factor: " + ageFactor + "x");
        System.out.println("Vehicle Risk Factor: " + vehicleRiskFactor + "x");
        System.out.println("Record Adjustment: " + recordAdjustment + "%");
        System.out.println("Monthly Premium: $" + Math.round(monthlyPremium * 100.0) / 100.0);
        System.out.println("Annual Premium: $" + Math.round(finalPremium * 100.0) / 100.0);
        System.out.println("Risk Category: " + riskCategory);

        sc.close();
    }
}