import java.util.Scanner;

public class MainSmartApp {
    
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet lappy = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet ref = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet phone = new SmartphoneAdapter(smartphoneCharger);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Power Outlet App\n");
            System.out.println("1. Laptop ");
            System.out.println("2. Refrigerator ");
            System.out.println("3. Smartphone Charger ");
            System.out.println("4. Exit ");
            System.out.print("Enter your choice: ");
            System.out.println("");
            int userChoice = scanner.nextInt();

            
            switch (userChoice) {
                case 1:
                    System.out.println(lappy.plugIn());
                    System.out.println("");
                    break;

                case 2:
                    System.out.println(ref.plugIn());
                    System.out.println("");
                    break;

                case 3:
                    System.out.println(phone.plugIn());
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Terminated...");
                    System.out.println("");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}