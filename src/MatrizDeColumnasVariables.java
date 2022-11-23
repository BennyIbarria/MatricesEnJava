public class MatrizDeColumnasVariables
{
    public static void main(String[] args)
    {
        //Creamos una matriz de tipo entero con 3 filas y columnas variables
        int[][] matriz = new int[3][];

        //Poblamos la matriz
        matriz[0]=new int[2];
        matriz[1]=new int[3];
        matriz[2]=new int[4];

        //Averiguamos si la matriz tiene las filas y las columnas que especificamos
        System.out.println("numero de filas en la matriz: " + matriz.length);
        System.out.println("La fila 0 tiene " + matriz[0].length + " Columnas");
        System.out.println("La fila 1 tiene " + matriz[1].length + " Columnas");
        System.out.println("La fila 2 tiene " + matriz[2].length + " Columnas");

        //Recorremos con un for la matriz y multiplicamos los elementos de esta
        for (int i=0; i<matriz.length;i++)
        {
            for(int j=0; j<matriz[i].length;j++)
            {
                matriz[i][j]=i*j;
            }
        }
       //Imprimimos la matriz
       for (int i=0; i< matriz.length;i++)
       {
           for(int j=0; j<matriz[i].length;j++)
           {
               System.out.print(matriz[i][j]+"\t");
           }
           System.out.println();
       }
    }
}
