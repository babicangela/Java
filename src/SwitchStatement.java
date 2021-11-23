import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ocena  = scanner.nextInt();
        switch (ocena) {
            case 1 : System.out.println("nedovoljan");break;
            case 2 : System.out.println("dovoljan");break;
            case 3 : System.out.println("dobar");break;
            case 4 : System.out.println("vrlo dobar");break;
            case 5 : System.out.println("odlican");break;
            default: System.out.println("Nije uneta dobra ocena");

        }


    }
}
