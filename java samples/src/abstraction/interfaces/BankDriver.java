package abstraction.interfaces;

import java.util.Scanner;

public class BankDriver {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        CitiBank citiBank = new CitiBank();

        // interfaces cannot be instantiated
        // Bank b = new Bank(); // not allowed

        // interface can be instantiated as a class implementing the interface
        Bank b = new CitiBank();
        Bank c = new MayBank();

        // MayBank mayBank = new MayBank();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter a Deposit Type (FD/RD)");
        String type = scan.next();
        if (type.equalsIgnoreCase("fd")) {
            System.out.print("Enter the amount to be deposited: ");
            float amt = scan.nextFloat();
            System.out.print("Enter the Tenure: ");
            int prd = scan.nextInt();
            float cbInterest = citiBank.fdInterest(amt, prd);
            // float mbInterest = mayBank.fdInterest(amt, prd);

            System.out.println(" The return for an investment of $ " + amt + " for a period of " + prd + " will yeild :"
                    + (amt + cbInterest) + " with CitiBank");
            Bank.archive(); // method implemented by the interface
            // System.out.println(" The return for an investment of $ " + amt + " for a
            // period of " + prd + " will yeild :"
            // + (amt + mbInterest) + " with MayBank");

        }
        scan.close();
    }
}
