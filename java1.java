import java.util.Scanner;
public class java1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите р");
        double p = in.nextDouble();
        System.out.println("Введите y");
        double y = in.nextDouble();
        System.out.println("Введите x");
        double x = in.nextDouble();
        System.out.println("Введите a");
        double a = in.nextDouble();
        System.out.println("Введите c");
        double c = in.nextDouble();
        double Z;
        double P;

        System.out.println("Z= " + Z(y,p));
        System.out.println("P= " + P(a,x,y,c));
    }
    public static double Z(double y,double p){
        return (Math.pow(Math.sin(p+0.4),2)/(y*y + 7.325*p));
    }
    public static double P(double x,double y,double a,double c){
        return ((Math.pow(a,5)+ Math.acos(a+Math.pow(x,3)) - Math.pow(Math.sin(y-c),4)))/(Math.pow(Math.sin(x+y),3)+Math.abs(x-y));
    }

}
