import java.util.Arrays;

public class CorregidoClase {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tablamul(2)));
    }
    static int [][]tablamul (int a){
        int [][]tabla=new int [10][3];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i][0]=a;
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j+1]=i+1;
            }
        }
        return tabla;
    }
}
