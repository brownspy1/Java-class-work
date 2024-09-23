import java.util.Scanner ;
class main{
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int b = Input.nextInt();
        int c = Input.nextInt();

        int d = b*b-4*a*c;

        if (a == 0) {
            System.out.println("A is not equal 0");
            return;
        }

        if (d <= 0) {
            System.out.println("Root are not real");
        }else{
            double x1 = (-b- Math.sqrt(d))/2*a;
            double x2 = (-b+ Math.sqrt(d))/2*a;
            System.out.println("X1:"+x1+ "\n X2:"+x2);
        }
        

    }
}