import java.util.Scanner;

public class gymMembership14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String membership = sc.next();
        int months = sc.nextInt();
        String accessLevel = sc.next();
        String addOns = sc.next();

        double monthFee = 0.0;

        if (membership.equals("Basic")) {
            monthFee = 40;
        } else if (membership.equals("Premium")) {
            monthFee = 80;
        } else if (membership.equals("Elite")) {
            monthFee = 120;
        } else if (membership.equals("VIP")) {
            monthFee = 150;
        }

        int dis = 0;
        if (months == 1) {
            dis = 0;
        } else if (months == 6) {
            dis = 10;
        } else if (months == 12) {
            dis = 15;
        } else if (months == 24) {
            dis = 25;
        }

        double accessFee = 0.0;
        if (accessLevel.equals("Single-Location")) {
            accessFee = 0;
        } else if (accessLevel.equals("Regional")) {
            accessFee = 20;
        } else if (accessLevel.equals("Nationwide")) {
            accessFee = 50;
        }

        double addFee = 0.0;
        if (addOns.equals("None")) {
            addFee = 0;
        } else if (addOns.equals("Classes")) {
            addFee = 50;
        } else if (addOns.equals("Personal-Training")) {
            addFee = 100;
        } else if (addOns.equals("Full-Package")) {
            addFee = 200;
        }

        double discountedBase = monthFee * (1 - dis / 100.0);
        double monthlyTotal = discountedBase + accessFee + addFee;
        double contractTotal = monthlyTotal * months;
        double monthToMonthTotal = (monthFee + accessFee + addFee) * months;
        double savings = monthToMonthTotal - contractTotal;

        String category = "";

        if (membership.equals("Basic")) {
            category = "Budget";
        } else if (membership.equals("Premium")) {
            if (monthlyTotal >= 150) {
                category = "Premium";
            } else {
                category = "Standard";
            }
        } else if (membership.equals("Elite")) {
            category = "Premium";
        } else if (membership.equals("VIP")) {
            category = "Luxury";
        }

        System.out.println("Membership Tier: " + membership);
        System.out.println("Contract Length: " + months + " months");
        System.out.println("Access Level: " + accessLevel);
        System.out.println("Add-Ons: " + addOns);
        System.out.println("Base Monthly Fee: $" + monthFee);
        System.out.println("Contract Discount: " + dis + "%");
        System.out.println("Access Fee: $" + accessFee);
        System.out.println("Add-On Fee: $" + addFee);
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Contract Total: $" + contractTotal);
        System.out.println("Savings vs Month-to-Month: $" + savings);
        System.out.println("Membership Category: " + category);

        sc.close();
    }
}
