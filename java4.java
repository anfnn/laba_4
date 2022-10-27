import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ведите стоимость ирисок");
        double x = in.nextDouble();
        System.out.println("ведите кг ирисок");
        double a = in.nextDouble();
        System.out.println("ведите стоимость шоколадных конфет");
        double y = in.nextDouble();
        System.out.println("ведите кг шоколадных конфет");
        double b = in.nextDouble();
        double z;
        double m;
        double w;
        double t;

        System.out.println("1 кг ирисок"+ z(x,a));
        System.out.println("1 кг шоколадных конфет"+ m(y,b));
        System.out.println("стоимость шоколадных конфет отличается от ирисок в"+ w(x,y));
        System.out.println(t(a,b,x,y)+ " кг ирисок можно купить вместо"+ b +"шоколадных конфет");
    }

    public static double z(double x, double a) {
        return x/a;
    }
    public static double m(double y, double b) {
        return y/b;
    }
    public static double w(double x, double y) {
        return y/x;
    }
    public static double t(double a, double b,double x, double y) {
        return (y/b)/(x/a);
    }
}
