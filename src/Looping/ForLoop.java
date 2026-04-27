package Looping;

public class ForLoop {
    public static void main (String[] args)
    {
        //print 0 to 4
        for(int i=0; i<5; i++)
        {
            if(i==3){
                break;
            }
System.out.println(i);
        }
        //print even numbers 1 to 10
        for(int i=1;i<=10;i++){
            if(i%2 ==0){
                System.out.println(i);
            }
        }
    }
}
