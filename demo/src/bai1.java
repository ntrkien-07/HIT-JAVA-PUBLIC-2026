import java.util.Scanner;

public class bai1{
    double cd;
    double cr;
    void tinhchuvi(){
        double chuvi =(cd+cr)*2;
        System.out.println("chu vi hcn la"+chuvi);
    }

    void tinhdientich(){
        double dientich =(cd*cr);
        System.out.println("dien tich bang"+dientich);
    }

    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        bai1 hcn = new bai1();
        System.out.print("nhap gia tri cua chieu dai");
        hcn.cd = sc.nextDouble();
        System.out.print("nhap gia tri cua chieu rong");
        hcn.cr = sc.nextDouble();
        hcn.tinhchuvi();
        hcn.tinhdientich();
    }
}

