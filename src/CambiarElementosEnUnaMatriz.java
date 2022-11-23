public class CambiarElementosEnUnaMatriz
{
    public static void main(String[] args)
    {
    //Creamos la matriz
    int[][] matriz =
            {
                      {1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}
            };
    //Recorremos la matriz y la imprimimos como "matriz normal"
        for (int i=0; i< matriz.length; i++)
        {
            for (int j=0; j< matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] +"\t" );
            }
            System.out.println();
        }
        System.out.println();
        int aux=0;
        for (int i=0; i< matriz.length;i++)
        {
            for (int j=0; j < i; j++)
            {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        //Recorremos la matriz y la imprimimos como "matriz transpuesta"
        System.out.println("Matriz transpuesta");
        System.out.println();
        for (int i=0; i< matriz.length; i++)
        {
            for (int j=0; j< matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] +"\t" );
            }
            System.out.println();
        }
    }
}
