import java.util.Scanner;

public class Grenais1131 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empates=0,interVictory=0,gremioVictory=0,count=0;
        for (;;){
            count++;
            int a= in.nextInt();
            int b= in.nextInt();

            if (a==b){
                empates++;
            }
            else if (a>b){
                interVictory++;
            }
            if (b>a){
                gremioVictory++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");

            int c=in.nextInt();
            if(c==2){
                break;
            }
        }
        System.out.println(count+" grenais\nInter:"+interVictory+"\nGremio:"+gremioVictory
                +"\nEmpates:"+empates);
        if(interVictory==gremioVictory)
            System.out.println("Não houve vencedor");
        else if(interVictory>gremioVictory)
            System.out.println("Inter venceu mais");
        else if(interVictory<gremioVictory)
            System.out.println("Gremio venceu mais");


    }
}
