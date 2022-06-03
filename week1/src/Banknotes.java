import java.util.Scanner;

    public class Banknotes {
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            long num= in.nextLong();
            System.out.println(num);
            System.out.println(num/100+" nota(s) de R$ 100,00");
            num%=100;
            System.out.println(num/50+" nota(s) de R$ 50,00");
            num%=50;
            System.out.println(num/20+" nota(s) de R$ 20,00");
            num%=20;
            System.out.println(num/10+" nota(s) de R$ 10,00");
            num%=10;
            System.out.println(num/5+" nota(s) de R$ 5,00");
            num%=5;
            System.out.println(num/2+" nota(s) de R$ 2,00");
            num%=2;
            System.out.println(num +" nota(s) de R$ 1,00");

        }
}
