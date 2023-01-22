public class Main2 {
    public static void main(String[] args) {
        int []num=new int[10];
        int [][]num2=new int[3][100];
        for (int i = 1; i <=num.length ; i++) {
            for (int j = 1; j <=num.length ; j++) {
                num2[i][j]=(i*j);
            }
        }
    }
}
