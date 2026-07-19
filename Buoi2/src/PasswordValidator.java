import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap mat khau gom 8 ki tu");
        String password= sc.nextLine();
        String checkpassword=password.trim();
        int length=checkpassword.length();
        boolean digits=false;
        boolean capitalLetters=false;
        for(int i=0; i<length; i++){
        char c= checkpassword.charAt(i);
        if(c>='1' && c<='9'){
            digits=true;
          }
        if(c>='A'&&c<='Z'){
            capitalLetters=true;
         }
        }
        if(length>=8 && digits && capitalLetters){
            System.out.println("mat khau hop le");
        }else{
            System.out.println("mat khau khong hop le");
        }if(length<8){
            System.out.println("mat khau cua ban can toi thieu 8 ki tu");

        }if(!digits){
            System.out.println("mat khau cua ban can co it nhat 1 chu so tu 1-9");

        }if(!capitalLetters){
            System.out.println("mat khau cua ban can co it nhat 1 chu cai viet hoa");
        }
    }
}
