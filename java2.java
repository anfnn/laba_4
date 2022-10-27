import java.util.Scanner;
public class java2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите скорость войск v1");
        double v1 = in.nextDouble();
        System.out.println("Введите скорость велосипедиста v2");
        double v2 = in.nextDouble();
        System.out.println("Введите расстояние дороги");
        double L = in.nextDouble();
        double t;

        System.out.println("t="+t(v1,L,v2));
    }
    public static double t (double v1,double L,double v2){
        return (L/v1)+(L/v2);
    }
}

