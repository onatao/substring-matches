import java.util.Scanner;
public class Program {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // Valido para placas no formato XXX1234    
        System.out.println("Placa: ");
        String placa = scan.nextLine();

        System.out.println(verify(placa));

        scan.close();
    }

    public static boolean verify(String word) {
        boolean valid = true;

        if (word.length() != 7) return valid = false;
        if (!word.substring(0, 3).matches("[A-Z]*")) return valid = false; 
        if (!word.substring(3).matches("[0-9]*")) return valid = false;

        return valid;
    }
}
