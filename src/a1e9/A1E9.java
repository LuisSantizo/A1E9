import java.util.Scanner;

public class A1E9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //definir variables
        String PalabraA;
        String PalabraB;
        String Auxiliar;
        
        //ingresar los datos
        System.out.print("Ingrese la primer palabra A: ");
        PalabraA = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra B: ");
        PalabraB = scanner.nextLine();

        Auxiliar = PalabraA;
        PalabraA = PalabraB;
        PalabraB = Auxiliar;

        System.out.println("La palabra A es: " + PalabraA);
        System.out.println("La palabra B es: " + PalabraB);
    }

}
