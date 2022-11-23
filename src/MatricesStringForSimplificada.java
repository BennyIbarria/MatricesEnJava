public class MatricesStringForSimplificada
{
    public static void main(String[] args)
    {
        String[][] nombres = {{"Jose","Josefa"},{"Paco","Rodrigo"},{"Bastian","Yohel"}};

        //recorriendo el arreglo con un foreach
        for (String[] fila:nombres)
        {
            for (String nombre:fila)
            {
                System.out.print(nombre+"\t");
            }
            System.out.println();
        }


    }
}
