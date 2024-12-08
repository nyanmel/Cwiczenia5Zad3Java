public class Zadania3 {
    public static void main(String[]args) {
        int[][] matrix = new int[10][10];
        int suma = 0;
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if (row == col) {
                    matrix[row][col] = row;
                    suma += row;
                } else{
                    matrix[row][col] = 0;
                }
            }
        }
        System.out.println("Table:");
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }
        System.out.println("suma elementów znajdujących się na przekątnej:" + suma);
    }

}



