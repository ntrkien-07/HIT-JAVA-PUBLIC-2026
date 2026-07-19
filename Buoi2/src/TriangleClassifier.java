import java.util.Scanner;
public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("nhap b:");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("nhap c:");
        int c = Integer.parseInt(sc.nextLine());
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("3 canh ban vua nhap tao thanh tam giac deu");
            } else {
                if (a == b || a == c || b == c) {
                    System.out.println("3 canh ban vua nhap tao thanh tam giac can");
                } else {
                    System.out.println("3 canh ban vvua nhap tao thanh tam giac thuong");
                }
            }
            double chuvi = a + b + c;
            double p = chuvi / 2.0;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("chu vi= %.2f %n",chuvi);
            System.out.printf("dien tich = %.2f %n", S);
        } else {
            System.out.println("ba canh ban nhap khong tao thanh mot tam giac hop le");
        }
    }
}