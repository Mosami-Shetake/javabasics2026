package Assignment3;

public class Q1_print_numbers1to10 {
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i+"-> Even");
            }
            else{
                System.out.println(i+"-> odd");
            }
        }
    }
}
