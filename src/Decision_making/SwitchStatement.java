package Decision_making;

public class SwitchStatement {
    public static void main(String[] args) {
        int num = 5;
        String size = "";

        switch (num) {
            case 1:
                size = "small";
                if (1== 2) {
                }
                break;
            case 2:
                size = "medium";
                break;
            case 3:
                size = "extra large";
                break;
            case 4:
                size = "Large";
                break;

            default:
                System.out.println("The value is not in the case set");
        }
        System.out.println(size);
    }
}