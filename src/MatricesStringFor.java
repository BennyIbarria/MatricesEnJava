public class MatricesStringFor
{
    public static void main(String[] args)
    {
        String[][] nombres = new String[3][2];

        //Poblado o inicializado el arreglo
        nombres[0][0]="Jose";
        nombres[0][1]="Josefa";
        nombres[1][0]="Paco";
        nombres[1][1]="Rodrigo";
        nombres[2][0]="Bastian";
        nombres[2][1]="Yohel";

        //Recorrer el arreglo con un for
        System.out.println("Imprimiendo los elementos del arreglo usando un for");
        for(int i=0; i<nombres.length;i++)
        {
            for(int j=0; j<nombres[i].length;j++)
            {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }
        //recorriendo el arreglo con un foreach
        for (String[] fila:nombres)
        {
            for (String nombre:fila)
            {
                System.out.println(nombre+"\t");
            }
        }


    }
}
