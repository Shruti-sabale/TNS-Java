import java.util.Scanner;
public class Singledigitsum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=input.nextInt();
        int digit=0;
        int sum=0; 
            for (int i = 0; 0 < num; i++) {
                digit=num%10;
                sum=sum+digit;
                num=num/10;
                if(sum>9&&num==0){
                    num=sum;
                    sum=0;
                }
            }
            System.out.println("the sum is "+ sum);
    }
}
