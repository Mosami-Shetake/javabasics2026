package Assignments;
import java.lang.*;
//Topics: Variables & Datatypes | Decision Making | For Loop | Operators
public class javaBasics2 {
    //Q1. Variable Swap Without Temp Variable
    public static void main(String[] args) {
        int a = 45;
        int b = 78;
        System.out.println("Before Swapping a = " + a);
        System.out.println("Before Swapping b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping a = " + a);
        System.out.println("After Swapping b = " + b);

        //Q2. Digit Sum Using Operators
        int n = 4567;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("sum of digits:" + sum);


        //Q3. Grade Classifier

        int marks = 85;
        if (marks >= 90 && marks <= 100) {
            System.out.println(" O (Outstanding)");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("A");
        } else if (marks >= 60 && marks <= 74) {
            System.out.println("B");
        } else if (marks >= 45 && marks <= 59) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }

        //Q4. Multiplication Table with Formatted Output
        int m = 7;
        for (int i = 1; i <= 12; i++) {
            System.out.println(m + " x " + i + " = " + (m * i));
        }

        //Q5. Odd Numbers in a Range with Count
       int count = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;

            }
        }
        System.out.println("Total odd numbers" + count);

        //Q6.Number Pattern Using For Loop
        int o = 5;
        for (int i = 1; i <= o; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Q7.Day Name Using Switch

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
        //Q8. Bitwise Even/Odd Check
        int S = 29;

        if ((S & 1) == 1) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }

        //Q9. Electricity Bill Calculator
        int units=250;
        double bill=0;

        if(units<=100){
            bill=units*1.50;
        }
        else if(units<=200){
            bill=(100*1.50)+
                    (units-100)*2.50;
        }
        else if(units<=300){
            bill=(100*1.50)+
                    (100*2.50)+
                    (units-200)*4.00;
        }
        else {
            bill = (100 * 1.50) +
                    (100 * 2.50) +
                    (100 * 4.00) +
                    ((units - 300) * 6.00);
        }
        System.out.println("Total bill: "+bill);


        //Q10. Palindrome Number Check
        int t = 1221;
        int original = t;
        int reverse = 0;

        for (; t > 0; t = t / 10) {
            int digit = t % 10;               // extract last digit
            reverse = reverse * 10 + digit;   // build reverse
        }

        if (original == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
        //Q11. Largest of Three Numbers
        int x = 54, y = 89, z = 73;

        if (x > y) {
            if (x > z) {
                System.out.println("Largest: " + x);
            } else {
                System.out.println("Largest: " + z);
            }
        } else {
            if (y > z) {
                System.out.println("Largest: " + y);
            } else {
                System.out.println("Largest: " + z);
            }
        }
        //Q12. Sum of First N Natural Numbers Using For Loop
        int d = 100;
        int sum1 = 0;

        for (int i = 1; i <= d; i++) {
            sum1 = sum1 + i;   // accumulate
        }

        System.out.println("Sum1 = " + sum1);

        if (sum1 % 2 == 0) {
            System.out.println("The sum is Even");
        } else {
            System.out.println("The sum is Odd");
        }

        //Q13. Simple Calculator Using Switch
        int num1 = 20;
        int num2 = 5;
        char operator = '/';

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        //Q14. Factorial Using For Loop
        int p=10;
        long result=1;
        for(int i=1;i<=p;i++){
            result = result * i;
        }
        System.out.println("Factorial of " +p+ "is:"  +result);

        //Q15:Positive, Negative, or Zero Classifier with Count
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        // Loop counter trick to avoid using an array or collection
        for (int i = 1; i <= 10; i++) {
            int currentNum = 0;

            // Assign the corresponding number based on the loop iteration
            switch (i) {
                case 1: currentNum = -5; break;
                case 2: currentNum = 12; break;
                case 3: currentNum = 0; break;
                case 4: currentNum = -3; break;
                case 5: currentNum = 8; break;
                case 6: currentNum = 0; break;
                case 7: currentNum = 15; break;
                case 8: currentNum = -9; break;
                case 9: currentNum = 4; break;
                case 10: currentNum = 0; break;
            }

            // Classify the current number
            if (currentNum > 0) {
                positiveCount++;
            } else if (currentNum < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Print final counts
        System.out.println("Total Positive numbers: " + positiveCount);
        System.out.println("Total Negative numbers: " + negativeCount);
        System.out.println("Total Zeroes: " + zeroCount);

    }
    }







