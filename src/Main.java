import java.sql.PseudoColumnUsage;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 1; i <= num.length; i++) {
            for (int j = 1; j <= num.length; j++) {
                System.out.println("[" + i + "," + j + "," + (i * j) + "]");
                int[][] num2 = {{i, j, i * j}};
            }

        }
    }
}