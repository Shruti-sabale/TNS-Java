public class Palindrome {
    public static void main(String[] args) {
        ispalindrome(122);
    }
    static int ispalindrome(int num){
            int temp=num;
            int modulo=0;
            int res=0;
            while(temp>0){
                modulo=temp%10;
                res=res*10+modulo;
                temp=temp/10;
            }if (res==num) {
                System.out.println();
                System.out.println(num +" is palindrome ");
                      return res;
            }
            else{
                System.out.println(num+" is not palindrome");
            }
            return res;
    }
    
}
