import java.util.Scanner;

public class HundirLaFlota {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //num barcos
        System.out.println("Introduce la cantidad de barcos");
        int qbarcos = sc.nextInt();
        while (qbarcos > 10){
            System.out.println("La cantidad no es correcta, vuelve a introducir");
            qbarcos = sc.nextInt();
        }
        int[] barcos = new int [qbarcos];


        //tamaño barcos
        for (int i = 0; i < barcos.length; i++){

            System.out.println("Introduce el tamaño del barco "+ i);
            int tamañoBarco = sc.nextInt();

            while (tamañoBarco > 5 || tamañoBarco < 2){
                System.out.println("El tamaño del barco no puede ser el que introduciste, vuelve a introducirlo");
                tamañoBarco = sc.nextInt();
            }

            int posicion = tamañoBarco;
            barcos[i] = posicion;

        }


        //tablero
        System.out.println("Porfavor, introduce la medida del tablero: ");
        int midaTabla = sc.nextInt();

        while (midaTabla > 128){

            System.out.println("La medida no es correcta, vuelve a introducir");
            midaTabla = sc.nextInt();

        }
        int [][] tablero = new int [midaTabla][midaTabla];



        for (int i = 0; i > tablero[i].length; i++){
            for (int j = 0; j > tablero[i][j].length; j++){
                int posicio1o0 = sc.nextInt();
            }
        }




    }

}
