import java.util.Scanner;

public class SoftwareLicense15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userCount = sc.nextInt();
        String licenseType = sc.next();
        String supportLevel = sc.next();
        int contractYears = sc.nextInt();
        double basePrice = 0;
        double supportFee = 0;
        int volumeDiscount = 0;
        int multiYearDiscount = 0;
        if (licenseType.equals("Standard")) {
            basePrice = 60;
        } else if (licenseType.equals("Professional")) {
            basePrice = 120;
        } else if (licenseType.equals("Enterprise")) {
            basePrice = 200;
        }
        if (userCount <= 50) {
            volumeDiscount = 0;
        } else if (userCount <= 200) {
            volumeDiscount = 15;
        } else if (userCount <= 500) {
            volumeDiscount = 20;
        } else if (userCount <= 1000) {
            volumeDiscount = 25;
        } else {
            volumeDiscount = 35;
        }
        if (supportLevel.equals("Basic")) {
            supportFee = 10;
        } else if (supportLevel.equals("Priority")) {
            supportFee = 30;
        } else if (supportLevel.equals("Premium")) {
            supportFee = 80;
        }

        if (contractYears == 1) {
            multiYearDiscount = 0;
        } else if (contractYears == 2) {
            multiYearDiscount = 5;
        } else if (contractYears == 3) {
            multiYearDiscount = 10;
        } else if (contractYears == 5) {
            multiYearDiscount = 20;
        }

        double discountedBase = basePrice - (basePrice * volumeDiscount / 100);
        double priceWithSupport = discountedBase + supportFee;
        double annualPerUser = priceWithSupport - (priceWithSupport * multiYearDiscount / 100);

        double totalAnnual = annualPerUser * userCount;
        double contractValue = totalAnnual * contractYears;
        String pricingTier = "";
        if (userCount < 200) {
            pricingTier = "Small Business";
        } else if (userCount <= 1000) {
            pricingTier = "Mid-Market";
        } else {
            pricingTier = "Enterprise";
        }
        System.out.println(" ");
        System.out.println("User Count: " + userCount);
        System.out.println("License Type: " + licenseType);
        System.out.println("Support Level: " + supportLevel);
        System.out.println("Contract Duration: " + contractYears + " years");
        System.out.println("Base Price Per User: $" + basePrice);
        System.out.println("Volume Discount: " + volumeDiscount + "%");
        System.out.println("Support Fee Per User: $" + supportFee);
        System.out.println("Multi-Year Discount: " + multiYearDiscount + "%");
        System.out.println("Annual Cost Per User: $" + annualPerUser);
        System.out.println("Total Annual Cost: $" + totalAnnual);
        System.out.println("Total Contract Value: $" + contractValue);
        System.out.println("Pricing Tier: " + pricingTier);

        sc.close();
    }
}
