import java.util.Scanner;
public class PointDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap x1: ");
        int x1= Integer.parseInt(sc.nextLine());
        System.out.print("nhap y1");
        int y1 = Integer.parseInt(sc.nextLine());
        System.out.print("nhap x2");
        int x2 = Integer.parseInt(sc.nextLine());
        System.out.print("nhap y2");
        int y2= Integer.parseInt(sc.nextLine());
        double Euclideandistance= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.printf("khoang cach euclidean giua 2 diem = %.2f %n",Euclideandistance);
    }
}
