package operators;

public class javaoperators {

    public static void main (String[] args){

        //Arithimatic opertors
        int a=10;int b=4; int c=10;
        String str1="java";
        String str2="program";
        String str3 = new String("java");

        //Addition
        System.out.println(a+b);
        System.out.println(str1 + " " + str2);

        //sub
        System.out.println(a-b);

        //Mul
        System.out.println(a*b);

        //Div
        System.out.println(a/b);

        //Modulus
        System.out.println(a%b);

        //Relational Operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= c);

        //instanceof operator
        String name="Mosami";
        if(name instanceof String){
            System.out.println("It belongs to String class");
        }
        //Logical Operator
        int age =15;
        boolean haveID=true;

        //Logical AND
        boolean enterOffice = (age >= 18) && haveID;
        System.out.println(enterOffice);

        //Logical OR
        boolean entertemple = (age >= 18) || haveID;
        System.out.println(entertemple);

        //Logical NOT
        boolean reverse = !(age>=18);
        System.out.println(reverse);

        //Ternary operator
        // condition ? expression1 : expression2
        String size = (a>15) ? "greater" : "lesser";
        System.out.println(size);





    }


}
