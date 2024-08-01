public class Sumofdigits {
 public static void main(String[] args) {
    int num=123;
    int digit=0;
    int sum=0;
    while (0<num) {
        digit=num%10;
        sum+=digit;
        num=num/10;
    } System.out.println(sum);
 }   
}
