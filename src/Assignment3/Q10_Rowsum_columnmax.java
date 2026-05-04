package Assignment3;

public class Q10_Rowsum_columnmax {
    public static void main(String[] args){
        int[][] data = {
                {12, 45, 33},
                {28, 16, 54},
                {71, 39, 22}
        };

        // 🔹 Part A: Row-wise Sum
        System.out.println("Row-wise Sum:");
        for (int i = 0; i < data.length; i++) {
            int sum = 0; // reset for each row

            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }

            System.out.println("Row " + i + " sum = " + sum);
        }

        // 🔹 Part B: Column-wise Maximum
        System.out.println("\nColumn-wise Maximum:");
        for (int j = 0; j < data[0].length; j++) {

            int max = data[0][j]; // assume first row value as max

            for (int i = 1; i < data.length; i++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }

            System.out.println("Column " + j + " max = " + max);
        }
    }

}

