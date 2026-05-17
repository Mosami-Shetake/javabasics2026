package inheritance;

class Grandfather{
    String surname;

    Grandfather(String s){
        surname=s;
        System.out.println("Grandfather surname is:" +s);
    }
}
class Father extends Grandfather{
    String firstname;

    Father(String s,String f){
        super(s);
        firstname=f;
        System.out.println("Father name:" + f + " " + surname);
    }
}
class son extends Father{
    int age;
    son(String s,String f,int a){
        super(s,f);
        age=a;
        System.out.println("Son age:" + a);
    }
}


public class superconstructmultilevel {

    public static void main(String[] args){
        son s=new son("sharma", "Ravi",20);
        System.out.println("Final: " + s.firstname + " " + s.surname + ", Age: " + s.age);

    }
}
