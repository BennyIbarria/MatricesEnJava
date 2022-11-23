public class CrearMatrizTranspuestaDesdeOtraMatriz
{
    public static void main(String[] args)
    {
    // Creamos 2 matrices multidimensionales
    int[][] a,b;
    a = new int[8][4];
    b = new int[4][8];

    //Recorremos la matriz a y la imprimimos
        for(int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++) {
                a[i][j] = i + j * 3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        //Asignamos la matriz "a" a la matriz b
        for (int i=0; i<a.length; i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("matriz transpuesta");
        for(int i=0; i<b.length; i++)
        {
           for(int j=0; j < b[i].length; j++)
           {
               System.out.print(b[i][j] + "\t");
           }
            System.out.println();
        }
    }
}
