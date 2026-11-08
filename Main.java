import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       GLOW & GLEAM HEALTH");
        System.out.println("================================");
        System.out.println("Your health. Your wellness. Your glow.");
        greetUser("Maya");
int result = addNumbers(5, 3);
System.out.println("Test result: " + result);
        System.out.println();

        System.out.println("1. My Health");
        System.out.println("2. Vitals");
        System.out.println("3. Appointments");
        System.out.println("4. Medications");
        System.out.println("5. Wellness");
        System.out.println("6. Exit");

        System.out.print("\nChoose an option: ");
        int choice = input.nextInt();

        switch (choice) {
case 1:
    displayHealthProfile(input);
    break;

            case 2:
    displayVitals(input);
    break;
            case 3:
    displayAppointments(input);
    break;

            case 4:
    displayMedications(input);
 break;

           case 5:
    displayWellness(input);
    break;

            case 6:
                System.out.println("Thank you for using Glow & Gleam Health!");
                break;

            default:
                System.out.println("Invalid option. Please try again.");
        }

        input.close();
    }
    public static void displayVitals(Scanner input) {

    System.out.println();
    System.out.println("=== Vitals ===");

    System.out.print("Enter your heart rate (bpm): ");
    int heartRate = input.nextInt();

    System.out.println("Heart Rate: " + heartRate + " bpm");

    if (heartRate < 60) {
        System.out.println("Heart rate is below the typical resting range.");
    } else if (heartRate <= 100) {
        System.out.println("Heart rate is within the typical resting range.");
    } else {
        System.out.println("Heart rate is above the typical resting range.");
    }
}
public static void displayAppointments(Scanner input) {

    System.out.println();
    System.out.println("=== Appointments ===");

    System.out.print("Enter provider name: ");
    String provider = input.next();

    System.out.print("Enter appointment date: ");
    String date = input.next();

    System.out.print("Enter appointment type: ");
    String appointmentType = input.next();

    System.out.println();
    System.out.println("Appointment Saved!");
    System.out.println("Provider: " + provider);
    System.out.println("Date: " + date);
    System.out.println("Type: " + appointmentType);
}
public static void displayMedications(Scanner input) {

    System.out.println();
    System.out.println("=== Medications ===");

    System.out.print("Enter medication name: ");
    String medication = input.next();

    System.out.print("Enter dosage (mg): ");
    double dosage = input.nextDouble();

    System.out.print("Enter time to take medication: ");
    String medicationTime = input.next();

    System.out.println();
    System.out.println("Medication Saved!");
    System.out.println("Medication: " + medication);
    System.out.println("Dosage: " + dosage + " mg");
    System.out.println("Time: " + medicationTime);
}
public static void displayWellness(Scanner input) {

    System.out.println();
    System.out.println("=== Wellness ===");

    System.out.print("Enter your water intake (cups): ");
    int water = input.nextInt();

    System.out.print("Enter your hours of sleep: ");
    double sleep = input.nextDouble();

    System.out.print("Enter your exercise minutes: ");
    int exercise = input.nextInt();

    System.out.println();
    System.out.println("=== Daily Wellness Summary ===");
    System.out.println("Water: " + water + " cups");
    System.out.println("Sleep: " + sleep + " hours");
    System.out.println("Exercise: " + exercise + " minutes");
}
    public static void displayHealthProfile(Scanner input) {

    System.out.println();
    System.out.println("=== My Health ===");

    System.out.print("Enter your name: ");
    String name = input.next();

    System.out.print("Enter your age: ");
    int age = input.nextInt();
    if (age <= 0) {
    System.out.println("Please enter a valid age.");
    return;
}

    System.out.print("Enter your height in inches: ");
    double height = input.nextDouble();

    System.out.print("Enter your weight in pounds: ");
    double weight = input.nextDouble();

    System.out.println();
    System.out.println("=== Health Profile ===");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height + " inches");
    System.out.println("Weight: " + weight + " lbs");
}

    public static void greetUser(String name) {
        System.out.println("Welcome to Glow & Gleam Health, " + name + "!");
    }
public static int addNumbers(int a, int b) {
    return a + b;
}
}