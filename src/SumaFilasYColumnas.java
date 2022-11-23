public class SumaFilasYColumnas
{
    public static void main(String[] args)
    {
    //Creamos un arreglo multidimensional
        int[][] matriz ={{1,2,3},
                         {4,5,6},
                         {7,8,9}
                        };
        //Creamos un par de variables para llevar la suma de las filas y las columnas

        //Recorremos el arreglo y sumamos lo que hay en las filas y lo que hay en las columnas
        for(int i=0; i<matriz.length; i++)
        {
            int sumaFilas=0;
            int sumaColumnas=0;
            for(int j=0; j < matriz[i].length; j++)
            {
            sumaFilas += matriz[i][j];
            sumaColumnas += matriz[j][i];
            }
            System.out.println("Cantidad total en la fila " + i + ": " + sumaFilas);
            System.out.println("Cantidad total en la columna " + i + ": " + sumaColumnas);
        }
    }
}
