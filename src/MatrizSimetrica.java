public class MatrizSimetrica
{
    public static void main(String[] args)
    {
        //Creamos una matriz multidimensional con el método simplificado
        int[][] matriz =
                {
                 {1,2,3,4},
                 {2,1,0,5},
                 {3,0,1,6},
                 {4,5,6,7}
                };
        //Declaramos una variable booleana para saber si son los mismos elementos entre la diagonal
        boolean simetrica =true;
        //Recorremos y verificamos si la matriz es simétrica al comparar los elementos contenidos
        //en la mitad superior del arreglo
        salir: for(int i=0;i< matriz.length;i++)
        {
            for(int j=0; j < i; j++)
            {
                if(matriz[i][j] != matriz[j][i])
                {
                 simetrica =false;
                 break salir;
                }
            }
        }
        if(simetrica)
        {
            System.out.println("La matriz es simétrica!!!");
        }
        else
        {
            System.out.println("La matriz no es simétrica");
        }
    }
}
