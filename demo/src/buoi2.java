import java.util.Scanner;

public class buoi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int[] a = {6, 4, 8, 9};

    System.out.println("Phần tử đầu tiên: "+ a[0]);

    a[2]=10;
    System.out.println("Độ dài của mảng: "+a.length);
    System.out.println("Duyệt bằng for thường:");
    for(
    int i = 0;
    i<a.length;i++)

    {
        System.out.println("Ví trí " + i + " có giá trị: " + a[i]);
    }
    System.out.println("Duyệt bằng for-each:");
    for(
    int value :a)

    {
        System.out.println(value);
    }
}
}