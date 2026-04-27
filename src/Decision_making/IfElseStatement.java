package Decision_making;

public class IfElseStatement {

    public static void main(String[] args) {

        int num1 = 101;
        int num2 = 50;

        if (num1 > 100) {
            System.out.println("Number is greater than 100");
            if (num2 == 50) {
                System.out.println("Number is equal to 50");
            }
        }
        else if (num1 < 100)
         {
            System.out.println("Number is Less than 100");
        }
        else{
            System.out.println("Number is equal to 100");
        }
        if (num1 > 100){
            System.out.println("The number is greater than 100");
        }else{
            System.out.println("The number is equal t0 100");
        }

    }
}



