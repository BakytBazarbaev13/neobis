import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int countHour,countMinute;
        int hour,minute,endHour,endMinute;
        hour=in.nextInt();
        minute= in.nextInt();
        endHour= in.nextInt();
        endMinute=in.nextInt();

        countHour=endHour-hour;
        if(countHour<0){
            countHour=24+(endHour-hour);
        }
        countMinute=endMinute-minute;
        if (countMinute<0){
            countMinute=60+(endMinute-minute);
            countHour--;
        }
        if (endHour == hour && endMinute==minute) {

            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else System.out.println("O JOGO DUROU "+countHour+" HORA(S) E "+countMinute+" MINUTO(S)");
    }
}
