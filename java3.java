import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        double r = in.nextDouble();
        System.out.println("Введите количество сторон");
        double a = in.nextDouble();
        double T;
        double T2;

        System.out.println("Сторона n-угольника = "+ T(a,r));
        System.out.println("Сторона 2*n-угольника = "+ T2(a,r));
    }
    public static double T(double a,double r){
        return 2*r*Math.sin(180/a);
    }
    public static double T2(double a, double r){
        return 2*r*Math.sin(180/2*a);
    }
}
