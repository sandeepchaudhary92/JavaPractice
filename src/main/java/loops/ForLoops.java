package loops;

public class ForLoops {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++)
        {
            for (int j=1; j<=2;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
      //  moreloop();

        paterns();

    }
  /* public static void moreloop(){

        for (int i=1; i<=4; i++)
        {
            for (int j=1;j<=4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/

    public static void paterns(){

        for (int i=1; i<=3;i++)
        {
            int n=1;
            for (int j=1; j<=3;j++){
                System.out.print(n+ " ");
                n++;
            }
            System.out.println();


        }
    }


}







