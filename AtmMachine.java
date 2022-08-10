public class AtmMachine {
    public static void main(String[] args) {

        System.out.println("1: Check Balance");
        System.out.println("2: Deposite money");
        System.out.println("3: Withdraw Money");
        int CurrentBalance = 10000;
        int Deposite = 1200;
        int Withdraw = 1200;
        int Choice = 3;

        switch (Choice) {

            case 1:

                System.out.println("Your Current Balance is : " + CurrentBalance);
                break;
            case 2:
                System.out.println("Your New Balace After Deposite : ");
                CurrentBalance = CurrentBalance + Deposite;
                System.out.println(CurrentBalance);
                break;
            case 3:
                System.out.println("Your New Balace After Withdraw : ");
                CurrentBalance = CurrentBalance - Withdraw;
                System.out.println(CurrentBalance);
                break;
            default:
                System.out.println("Error Input");

        }

    }

}
