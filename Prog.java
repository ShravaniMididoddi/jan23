package Demo;

public class Prog {
    public static void main(String[] args) {
        int n = -10;
        if (n++ > 0) {
            System.out.print("The given number is positive");
        } else if (++n < 0) {
            System.out.print("The given number is negative");
        } else if (n==0){
            System.out.print("The given number is 0");
        }
        System.out.println("\nnum---->"+n);
        System.out.println("\nprogram ends");
    }
}
