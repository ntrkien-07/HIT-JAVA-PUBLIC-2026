import java.util.Scanner;
class dienthoai {
        String ten;
        double gia;
        int soluong;
        void hienthi(){
            System.out.printf("sản phẩm bạn đang quan tâm la %s - co gia tien %.2f - số lượng mặt hang la %d\n",ten,gia,soluong);
        }
        void kiemtra(){
            if(soluong > 0){
                System.out.println("trạng thái: còn hàng");
            }
            else {
                System.out.println("trạng thái: hết hàng");
            }
        }
    }
    public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            dienthoai dt1 = new dienthoai();
            System.out.print("nhap ten:");
            dt1.ten = sc.nextLine();
            System.out.print("nhap gia");
            dt1.gia = sc.nextDouble();
            System.out.print("nhập số lượng máy");
            dt1.soluong = sc.nextInt();
            System.out.println("kết quả tra cứu---------------");
            dt1.hienthi();
            dt1.kiemtra();
        }
    }

