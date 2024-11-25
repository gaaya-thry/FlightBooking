//the payment (just write a method for user to choose how can they pay for the tickets), such as Visa
//optional--Database techs
//user search the flight by Date

public class Booking_System{

  public class Payment {
    public static void choosePaymentMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a payment method:");
        System.out.println("1. Visa");
        System.out.println("2. MasterCard");
        System.out.println("3. PayPal");
        System.out.println("4. Other");
        
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println("You chose Visa.");
            case 2 -> System.out.println("You chose MasterCard.");
            case 3 -> System.out.println("You chose PayPal.");
            case 4 -> System.out.println("You chose Other.");
            default -> System.out.println("Invalid choice.");
        }
    }
}

}
