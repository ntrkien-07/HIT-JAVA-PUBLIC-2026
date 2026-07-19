import java.util.Scanner;
public class bai2 {
    int nam;
    void kiemtra(){
        if(nam%4!=0&& nam%100 !=0 || nam%4000==0){
            System.out.printf("nam %d la nam nhuan", nam);
        }else{
            System.out.printf("nam %d khong phai la nam nhuan", nam);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        bai2 e= new bai2();
        System.out.print("nhap gia tri cua nam");
        e.nam =sc.nextInt();
        e.kiemtra();
    }
}
