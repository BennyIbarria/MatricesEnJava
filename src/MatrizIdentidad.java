public class MatrizIdentidad
{
    public static void main(String[] args)
    {
        //Creamos una matriz de 5x5
        int[][] matriz = new int[5][5];

        for(int i=0;i< matriz.length;i++)
        {
          for(int j=0; j < matriz[i].length;j++)
          {
              if (i == j)
              {
                  matriz[i][j]=1;
              }
          }
        }
        for(int i=0; i< matriz.length;i++)
        {
            for(int j=0; j<matriz[i].length;j++)
            {
                System.out.print(matriz[i][j] + "\t" );
            }
            System.out.println();
        }
    }
}
