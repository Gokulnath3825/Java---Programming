import java.util.Scanner;

public class SmartHomeEnergySystem10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String timeOfDay = sc.nextLine();
        double powerConsumption = sc.nextDouble();
        double renewablePercentage = sc.nextDouble();
        sc.nextLine();
        String rateTier = sc.nextLine();

        double baseRate = 0.0;
        double rateMultiplier = 1.0;
        double renewableCredit;
        double totalCost;
        double potentialSavings = 0.0;
        String recommendation = "";

        
        if (rateTier.equalsIgnoreCase("Basic")) {
            baseRate = 0.18;
        } else if (rateTier.equalsIgnoreCase("Time-of-Use")) {
            baseRate = 0.15;
        } else { 
            baseRate = 0.12;
        }

        if (timeOfDay.equalsIgnoreCase("Peak")) {

            if (rateTier.equalsIgnoreCase("Time-of-Use")) {
                rateMultiplier = 1.8;
            } else if (rateTier.equalsIgnoreCase("Premium-Green")) {
                rateMultiplier = 1.5;
            } else {
                rateMultiplier = 1.0;
            }

        } else if (timeOfDay.equalsIgnoreCase("Off-Peak")) {

            if (rateTier.equalsIgnoreCase("Time-of-Use")) {
                rateMultiplier = 0.8;
            } else {
                rateMultiplier = 1.0;
            }

        } else { 

            if (rateTier.equalsIgnoreCase("Premium-Green")) {
                rateMultiplier = 0.6;
            } else {
                rateMultiplier = 0.5;
            }
        }

        renewableCredit = (powerConsumption * renewablePercentage / 100) * baseRate;
        totalCost = (powerConsumption * baseRate * rateMultiplier) - renewableCredit;

        if (totalCost < 0) {
            totalCost = 0;
        }
        if (timeOfDay.equalsIgnoreCase("Peak") && renewablePercentage < 30) {
            recommendation = "Shift high-power appliances to Off-Peak hours";
            potentialSavings = powerConsumption * baseRate * (rateMultiplier - 0.8);
        } else if (renewablePercentage >= 60) {
            recommendation = "Excellent! Maximize appliance use during this period";
        } else if (rateTier.equalsIgnoreCase("Basic") && powerConsumption > 20) {
            recommendation = "Consider upgrading to Time-of-Use plan";
            potentialSavings = powerConsumption * 0.03;
        } else if (timeOfDay.equalsIgnoreCase("Peak") && renewablePercentage >= 60) {
            recommendation = "Great renewable usage! Minor peak reduction possible";
            potentialSavings = powerConsumption * baseRate * 0.2;
        } else if (timeOfDay.equalsIgnoreCase("Off-Peak")) {
            recommendation = "Good timing! Consider increasing renewable capacity";
        } else {
            recommendation = "Energy usage is optimal";
        }

        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + rateMultiplier + "x");
        System.out.printf("Renewable Credit: $%.2f\n", renewableCredit);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.printf("Potential Savings: $%.2f\n", potentialSavings);

        sc.close();
    }
}
