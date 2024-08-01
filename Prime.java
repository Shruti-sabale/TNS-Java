public class Prime {
    public static void main(String[] args) {
        int num=41;
        int temp=num-1;
        for(int i=temp;i>2;i--){
            if(num%i==0){
                System.out.println(num+" is not prime");
                break;
            } 
            else{
                System.out.println(num+" is prime");
                break;
            }
        }
    }
}
