import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] inputStrings = new String [4];
        System.out.println("Introduce el nombre ");
        inputStrings[0] = sc.nextLine();
        System.out.println("Introduce el apellido ");
        inputStrings[1] = sc.nextLine();
        System.out.println("Introduce el ano ");
        inputStrings[2] = sc.nextLine();
        System.out.println("Introduce el mez");
        inputStrings[3] = sc.nextLine();
        System.out.println("Insieme ");
        System.out.println(inputStrings[0] + " " + inputStrings[1] + " " + inputStrings[2] + " " + inputStrings[3]);

        System.out.println("Scambio");

        System.out.println(inputStrings[2] + " " + inputStrings[0] + " " + inputStrings[3] + " " + inputStrings[1]);
         sc.close();
    }

}
