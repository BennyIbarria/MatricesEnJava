public class BuscarUnElementoEnLaMatriz
{
    public static void main(String[] args)
    {
        // Creamos el arreglo multidimensional
        int[][] matriz = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}
        };
        //Creamos una variable que nos almacene el numero a buscar
        int elementoABuscar = 7;

        //Creamos una variable booleana que nos permita identificar si encontramos el elemento
        boolean encontrado = false;

        //Declaramos las variables i & j fuera del contexto del for para usarlas más adelante
        int i;
        int j=0;

        //Recorremos el arreglo y añadimos una etiqueta para que cuando se encuentre el elemento buscado se detenga la
        // iteración y el programa se salga del for.
       buscar: for(i=0; i< matriz.length;i++)
        {
            for (j=0; j<matriz[i].length;j++)
            {
                //Buscamos el elemento con un if
                if(elementoABuscar==matriz[i][j])
                {
                    encontrado=true;
                    break buscar;
                }
            }
        }
        if(encontrado)
        {
            System.out.println("El numero " + elementoABuscar + " fué encontrado en el indice (" + i + "," + j + ")");
        }
        else
        {
            System.out.println("El elemento no existe en la matriz!!!");
        }
    }
}
