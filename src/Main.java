import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name: ");
        String name = scanner.nextLine();


        System.out.println(Days.valueOf(name).getTranslation());
    }
}
