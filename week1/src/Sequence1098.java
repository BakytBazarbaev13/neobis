public class Sequence1098 {
    public static void main(String[] args) {
        int n=0;
        float i=0.0f,j;
        for (i=0.0f;i<2.2;i+=0.2){
            if (n==5){
                n=0;
            }
            for (j=1;j<=3;j++){
                if (n==0){
                    System.out.println("I="+i%.0f+" J="+j+i);
                }
                else if (i==2.0){
                    System.out.println("I="+i%.0f+" J="+j+i);
                }
                else System.out.println("I="+i%.1f+" J="+j+i);
                n++;
            }
        }
    }
}
