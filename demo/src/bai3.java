import java.util.Scanner;
public class bai3 {
    int n;
    void tinh(){
        int ketqua = 1;
       for(int i=1; i<n ; i++){
          ketqua += i*ketqua;
       }
       System.out.printf(" n!="+ketqua);
    }
    void tinhtong(){
        int tong =0;
        for(int i=0; i<=n; i++){
            if(i%2==0){
                tong += i;
            }
        }
        System.out.println("tong="+tong);
    }
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        bai3 tinhn =new bai3();
        System.out.print( "nhap gia tri cua n");
        tinhn.n= sc.nextInt();
        tinhn.tinh();
        tinhn.tinhtong();
    }

}