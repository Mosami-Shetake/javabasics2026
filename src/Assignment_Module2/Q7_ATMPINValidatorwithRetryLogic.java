package Assignment_Module2;

public class Q7_ATMPINValidatorwithRetryLogic {
    public static void main(String[] args) {

        int correctPin = 4521;
        int attempts = 0;
        int enteredPin = 0;

        while (attempts < 3) {

            // Simulating PIN entry
            if (attempts == 0) {
                enteredPin = 1234;
            } else if (attempts == 1) {
                enteredPin = 0000;
            } else if (attempts == 2) {
                enteredPin = 4521;
            }

            attempts++;

            if (enteredPin == correctPin) {
                System.out.println("Access Granted. Welcome!");
                break;
            } else {
                if (attempts < 3) {
                    System.out.println("Incorrect PIN. " + (3 - attempts) + " attempt(s) remaining.");
                } else {
                    System.out.println("Card Blocked. Contact your bank.");
                }
            }
        }
    }


}
