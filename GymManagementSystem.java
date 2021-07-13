package gymmanagementsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GymManagementSystem {

    /**
     * Array List for members and trainers, also initializing new scanner for
     * input as well as the boolean "exit" for use in the menu
     */
    private static boolean exit;

    private static final ArrayList<Member> mem = new ArrayList<Member>();
    private static final ArrayList<Trainer> tra = new ArrayList<Trainer>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        runMenu();

    }

    private static void runMenu() {
        //Initalizes the main menu below
        printHeader();
        while (!exit) {
            printMenu();
            int choice = getInput();
            userActions(choice);
        }

    }

    private static void printHeader() {
        // Prints the box drawn below to the sceen followed by the 6 lines of menu options
        System.out.println("+------------------------+");
        System.out.println("|      Welcome!          |");
        System.out.println("|      Main Menu:        |");
        System.out.println("+------------------------+");

    }

    private static void printMenu() {
        //Print Main Menu
        System.out.println("Enter number to perform action");
        System.out.println("1)Add a member");
        System.out.println("2)Add a trainer");
        System.out.println("3)See member list");
        System.out.println("4)See trainer list");
        System.out.println("5)To remove members");
        System.out.println("6)To remove trainers");
        System.out.println("0)Exit!");

    }

    private static int getInput() {

        /**
         * collects user input and outputs from the lines below, also catches
         * exception if input is not an integer between 0 and 6
         */
        int choice = -1;

        while (choice < 0 || choice > 6) {
            try {
                System.out.print("Make a selection:");
                System.out.print("");
                choice = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection please enter a number");

            }
        }

        return choice;

    }

    private static void userActions(int choice) {
        /**
         * Interprets user input with a series of choices in a while-else loop
         * that identify with user input with a try catch to remove trainers
         * from list catching invalid input
         */
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("Ty see ya later");

                break;
            case 1:
                members();

                break;

            case 2:
                trainers();

                break;

            case 3:
                int user = -2;
                memberList();
                while (user != -1) {
                    try {
                        System.out.println("type -1 to return");

                        user = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                    }
                    System.out.println("-1 to exit");
                }

                break;

            case 4:
                user = -2;
                trainerList();
                while (user != -1) {
                    try {
                        System.out.println("type -1 to return");

                        user = Integer.parseInt(sc.nextLine());

                    } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    }
                    System.out.println("-1 to exit");
                }

                break;
            case 5:
                user = -2;
                memberList();
                while (user < 0 || user > mem.size()) {
                    try {

                        System.out.println("To remove member enter member id");
                        user = Integer.parseInt(sc.nextLine());
                        mem.remove(user);

                    } catch (IndexOutOfBoundsException | NumberFormatException e) {
                        break;
                    }
                }
                break;
            case 6:
                user = -2;
                trainerList();
                while (user < 0 || user > tra.size()) {
                    try {

                        System.out.println("To remove member enter member id");
                        user = Integer.parseInt(sc.nextLine());
                        tra.remove(user);

                    } catch (IndexOutOfBoundsException | NumberFormatException e) {
                        break;
                    }
                }
                break;
        }

    }

    private static void members() {
        /*Member object that askes user for input for name, phone number, 
         *and age to be stored in variables with a try-catch, 
         *printing fee, option to pay and exercise program intrested in
         */
        System.out.print("What is the members name: ");
        String name = sc.nextLine();
        System.out.print("Phone number:");
        long phoneNumber = -1;
        while (phoneNumber < 0) {
            try {
                phoneNumber = Long.parseLong(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter Numbers only");
            }
        }

        System.out.print("Age:");
        int age = -1;
        while (age < 0) {
            try {
                age = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Numbers only please");
            }
        }
        double fee = fee(age);

        System.out.println("Your fee is:$" + fee);
        System.out.println("Would you like to pay now? Type Yes/No");
        String paidFee = sc.nextLine();
        int choice = -1;
        while (choice <= 0 || choice > 3) {
            try {
                System.out.println("What exercise program would you like:"
                        + "1)Yoga, 2) Cycling, 3) Zumba");
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter Numbers only");
            }
        }
        String exerciseChoice = "";
        if (choice == 1) {
            exerciseChoice = "Yoga";
        } else if (choice == 2) {
            exerciseChoice = "Cycling";
        } else {
            exerciseChoice = "Zumba";
        }


        Member memberInfo = new Member(name, phoneNumber, age, fee, paidFee, exerciseChoice);
        mem.add(memberInfo);
    }

    private static void trainers() {

   //Trainer object that is much the same as member class above taking user input to store in variables
        System.out.print("Trainers Name: ");
        String name = sc.nextLine();
        System.out.print("Phone number:");
        long phoneNumber = -1;
        while (phoneNumber < 0) {

            try {
                phoneNumber = Long.parseLong(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Numbers only please");
            }
        }

        System.out.print("Age:");
        int age = -1;
        while (age < 0) {
            try {
                age = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Numbers only please");
            }
        }

        int choice = -1;
        // Take in what program they will teach
        while (choice <= 0 || choice > 3) {
            try {
                System.out.println("What exercise program do you teach?:"
                        + "1)Yoga, 2) Cycling, 3) Zumba");
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter Numbers only");
            }
        }
        String exerciseChoice = "";
        if (choice == 1) {
            exerciseChoice = "Yoga";
        } else if (choice == 2) {
            exerciseChoice = "Cycling";
        } else {
            exerciseChoice = "Zumba";
        }
        Date d = new Date();
        String date = d.toString();
        Trainer trainerInfo = new Trainer(name, age, phoneNumber, exerciseChoice, date);
        tra.add(trainerInfo);

    }

    private static void memberList() {
        //Constructs and displays list of active members, if there are any
        if (mem.isEmpty()) {
            System.out.println("No members added yet.");
        } else {
            System.out.println("Here are the members info:");
            for (Member m : mem) {
                //formats the member list
                System.out.println(m.toString());
                System.out.println("MemId:" + mem.indexOf(m));
                System.out.println();
            }
        }
    }

    private static void trainerList() {
        //checks if trainer list is empty 
        if (tra.isEmpty()) {
            System.out.println("No trainers added yet.");
        } else {
            System.out.println("------------------------------");
            System.out.println("Here are the trainers info:");
            for (Trainer t : tra) {
                // formats member list 
                System.out.println(t.toString());
                System.out.println("TrainerId:" + tra.indexOf(t));
                System.out.println("---------------------------");
            }
        }
    }

    private static double fee(int age) {
        // this sets the fee members will pay based on their age
        double fee;
        if (age < 18) {
            fee = 4.99;

        } else if (age > 18 && age < 65) {
            fee = 9.99;
        } else {
            fee = 6.99;
        }
        return fee;
    }

}
