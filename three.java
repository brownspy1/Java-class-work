import java.util.Scanner;
class three{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int min = Math.min(a, b);
        int last = Math.min(min,c);

        System.out.println(last);
    }
}