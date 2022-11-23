public class SumaDeMatrices
{
    public static void main(String[] args)
    {
        //Creamos la primer matriz de forma simplificada
        int[][] a ={{1,2,3},
                    {4,5,6},
                    {7,8,9}
                   };
        //Creamos la segunda matriz de forma simplificada
        int[][] b= {{10,20,30},
                    {40,50,60},
                    {70,80,90}
                   };
        //Creamos la matriz que contendrá el resultado de la suma
        int[][] suma = new int[3][3];

        //Recorremos la matriz a
        for(int i=0;i<a.length;i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                //Realizamos la suma
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        //Recorremos el arreglo suma y lo imprimimos
        System.out.println("Arreglo 'a' sumado con 'b'\r\n");
        for(int i=0; i<suma.length; i++)
        {
           for(int j=0; j<suma[i].length;j++)
           {
               System.out.print(suma[i][j] + "\t");
           }
            System.out.println();
        }
    }
}
