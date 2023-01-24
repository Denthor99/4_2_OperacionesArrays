public class EjercicioPropuesto {
    public static void main(String[] args) {
        //Creamos una matriz (array bidimensional) de 10 x 3 posiciones para almacenar (no para imprimir) la tabla de multiplicar del 1. Quedaría así:
        int[][]matriz=new int[3][10];
        int num=1;
        int num2=1;
        for (int i=0; i<3;i++){
            matriz[i][0]=num;
            for (int j = 1; j < 10; j++) {
               num2=num+(num*num2);
               matriz[i][j]=num;
            }
            num2=num*i;
        }





    }
}
