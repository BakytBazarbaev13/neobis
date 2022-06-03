import java.util.Scanner;

    public class BanknotesAndCoins {
       public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            double num= in.nextDouble();
            int a,b,c,d;
            a= (int) num;
           System.out.println("NOTAS:");
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

           System.out.println("MOEDAS:");
            System.out.println(num + " moeda(s) de R$ 1.00");
            num%=1;
           System.out.println(num/0.5 + " moeda(s) de R$ 0.5");
           num%=0.5;
           System.out.println(num/0.25 + " moeda(s) de R$ 0.25");
           num%=0.25;
           System.out.println(num/0.10 + " moeda(s) de R$ 0.10");
           num%=0.10;
           System.out.println(num/0.05 + " moeda(s) de R$ 0.05");
            num%=0.05;
           System.out.println(num/0.01 + " moeda(s) de R$ 0.01");
           /*num%=0.01;*/

    }
}
