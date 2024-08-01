public class Armstrong {
    public static void main(String[] args) {
    int num=153;
    int temp=num;
    int res=0;
    int mod=0;
        for (int i = 0; 0 < num; i++) {
            mod=num%10;
            res=res+(mod*mod*mod);
            num=num/10;
        }
        if (res==temp) {
            System.err.println();
            System.out.println(temp+" armstrong");
        }
        else{
            System.out.println();
            System.out.println(temp+" not armstrong");
        }

}

}