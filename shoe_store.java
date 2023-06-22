package Envoirmental;

import java.util.Scanner;

public class Envoirone {

    // Arrays to store shoe rates and models for each brand
    static int[] nike_rates = {1200, 1600, 2044, 5504, 5503, 4000, 3500, 3000, 2800, 2870};
    static String[] nike_shoes = {"Air Jordan 1", "Air Force 1", "Air Max 90", "Blazer", "Cortez", "Dunk Low", "Huarache", "Pegasus", "Roshe Run", "Zoom Pegasus Turbo"};
    static int[] adidas_rates = {1500, 1800, 2200, 3200, 2700, 4000, 3400, 2800, 2900, 3100};
    static String[] adidas_shoes = {"Superstar", "Stan Smith", "Ultra Boost", "NMD", "Yeezy Boost 350", "Gazelle", "Campus", "Samba", "Continental 80", "Pharrell Williams Tennis Hu"};
    static int[] puma_rates = {1300, 1600, 1900, 2500, 2400, 3600, 3100, 2900, 2700, 2800};
    static String[] puma_shoes = {"Clyde", "Basket Classic", "Suede Classic", "Future Rider", "Calibrate Restored", "Rs X", "Roma", "Cell Alien", "Enzo", "Scuderia Ferrari Drift Cat 8"};
    static int[] reebok_rates = {1200, 1700, 2000, 3000, 2700, 3900, 3400, 2800, 2600, 2900};
    static String[] reebok_shoes = {"Classic Leather", "Workout Plus", "Aztrek", "Nano X", "Club C 85", "Zig Kinetica", "Exofit Lo Clean Logo", "Furylite", "Floatride Run", "Rapide"};

    // Arrays to store client payment information
    static String[] address_one = new String[10];
    static String[] address_two = new String[10];
    static String[] name = new String[10];
    static String[] state = new String[10];
    static int[] pincode = new int[10];
    static int[] cc_num = new int[10];
    static int[] cc_cvv = new int[10];
    static int[] cc_expiry = new int[10];

    // Method to connect to the desired brand
    public static void connect(int flag) {
        if (flag == 1) {
            Nike();
        } else if (flag == 2) {
            Adidas();
        } else if (flag == 3) {
            Puma();
        } else if (flag == 4) {
            Reebok();
        } else {
            System.out.println("This brand is not available!!");
        }
    }

    // Method to display Nike shoe models and handle user selection
    public static void Nike() {
        System.out.println("The available models are: \n");

        for (int i = 0; i < 10; i++) {
            int n = i + 1;
            System.out.println(n + ". " + nike_shoes[i] + " - " + nike_rates[i] + " INR");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter your choice : ");
        int choice = scanner.nextInt();
        if(choice >=1 && choice <=10) {
            String selected = nike_shoes[choice - 1];
            System.out.println("you have selected " + selected + "\n");
        }
    }

    // Method to display Adidas shoe models and handle user selection
    public static void Adidas() {
        System.out.println("The available models are: \n");

        for (int i = 0; i < 10; i++) {
            int n = i + 1;
            System.out.println(n + ". " + adidas_shoes[i] + " - " + adidas_rates[i] + " INR");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter your choice : ");
        int choice = scanner.nextInt();
        if(choice >=1 && choice <=10) {
            String selected = adidas_shoes[choice - 1];
            System.out.println("you have selected " + selected + "\n");
        }
    }

    // Method to display Puma shoe models and handle user selection
    public static void Puma() {
        System.out.println("The available models are: \n");

        for (int i = 0; i < 10; i++) {
            int n = i + 1;
            System.out.println(n + ". " + puma_shoes[i] + " - " + puma_rates[i] + " INR");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter your choice : ");
        int choice = scanner.nextInt();
        if(choice >=1 && choice <=10) {
            String selected = puma_shoes[choice - 1];
            System.out.println("you have selected " + selected + "\n");
        }
    }

    // Method to display Reebok shoe models and handle user selection
    public static void Reebok() {
        System.out.println("The available models are: \n");

        for (int i = 0; i < 10; i++) {
            int n = i + 1;
            System.out.println(n + ". " + reebok_shoes[i] + " - " + reebok_rates[i] + " INR");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter your choice : ");
        int choice = scanner.nextInt();
        if(choice >=1 && choice <=10) {
            String selected = reebok_shoes[choice - 1];
            System.out.println("you have selected " + selected + "\n");
        }
    }

    // Method to gather client payment information
    public static void client_pay_info() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:\n");
        String name = scanner.nextLine();

        if(name.length() <= 10 && !name.matches("-?\\d+")) {
            System.out.println("The name is well formatted!");
        } else {
            System.out.println("Error: the name should be less than or equal to 10 characters and not equal to an integer.");
            return;
        }

        System.out.println("Please enter your first address line:\n");
        String address_one = scanner.nextLine();

        if(address_one.length()<=64) {
            System.out.println("Thank you for the address, The format is well\n");
        } else {
            System.out.println("Error2");
            return;
        }

        System.out.println("Please enter your second address line (if applicable):\n");
        String address_two = scanner.nextLine();

        if(address_two.length()<=64) {
            System.out.println("Thank you for the address, The format is well\n");
        } else {
            System.out.println("Error2");
            return;
        }

        System.out.println("Please enter your state:\n");
        String state = scanner.nextLine();

        if(address_one.length()<=64) {
            System.out.println("Thank you for the address, The format is well\n");
        } else {
            System.out.println("Error2");
            return;
        }

        System.out.println("Please enter your pincode:\n");
        int pincode = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.println("Payment section \n");

        System.out.println("Please enter your credit card number:\n");
        String ccNumStr = scanner.nextLine();
        if (ccNumStr.length() != 16) {
            System.out.println("Invalid credit card number. Please enter a 16-digit number.\n");

        } else {
            int cc_num = Integer.parseInt(ccNumStr);

            System.out.println("Please enter your credit card expiry date (MM/YY):\n");
            String ccExpiryStr = scanner.nextLine();
            if (!ccExpiryStr.matches("(0[1-9]|1[0-2])/[0-9]{2}")) {
                System.out.println("Invalid expiry date format. Please enter in the format MM/YY.\n");
            } else {
                int cc_expiry = Integer.parseInt(ccExpiryStr.replaceAll("/", ""));

                System.out.println("Please enter your credit card CVV:\n");
                String ccCvvStr = scanner.nextLine();
                if (ccCvvStr.length() != 3) {
                    System.out.println("Invalid CVV. Please enter a 3-digit number.\n");
                } else {
                    int cc_cvv = Integer.parseInt(ccCvvStr);



                }
            }
        }
    }

    public static void main(String[] args) {

        int flag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, welcome to the shoe store! What brand do you prefer?");
        System.out.println("1. Nike\n2. Adidas\n3. Puma\n4. Reebok");
        System.out.print("Enter your choice: ");
        flag = sc.nextInt();
        connect(flag);
        System.out.println("Client/Payment - Section\n");
        client_pay_info();
    }
