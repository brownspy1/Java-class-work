import java.util.Scanner;
public class Grading_system {
    public static void main(String[] args){
        System.out.println("Input a number (1-100):");
        Scanner input = new Scanner(System.in);
        int grad = input.nextInt();
        switch(grad/10){
            case 10:
            case 9:
            case 8:
                System.out.println("A+");
                break;
                case 7:
                System.out.println("A");
                break;
                case 6:
                System.out.println("A-");
                break;
                case 5:
                System.out.println("B");
                break;
                case 4:
                System.out.println("C");
                break;
                default:
                System.out.println("F");
        }

    }
}
