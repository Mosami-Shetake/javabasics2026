package Assignment3;

public class Q6_FizzBuzzwithCounter {
    public static void main(String[] args){

        int count=0;
        for(int i=1; i<=50; i++){
            if(i%3==0 && i%5==0){
                System.out.print(" FizzBuzz ");
                count++;

            } else if (i%3==0) {
                System.out.print(" Fizz ");
            }
            else if (i%5==0) {
                System.out.print(" Buzz ");
            }
            else
            {
                System.out.print(i+ " ");
            }

        }
        System.out.print("FizzBuzz count:" + count);
    }
}
