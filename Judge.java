import java.util.Arrays;

public class Judge {

    public int findJudge (int N, int [][] trust){
        if (N<1|| N>1000){
            System.out.println("This is an invalid town");
            return -1;
        }
        if (trust.length>=10000){
            System.out.println("This is an ivalid array of trust");
            return -1;
        }
        boolean[] canidates = new boolean[N];
        int[] influence = new int[N];
        Arrays.fill(canidates,true);
        for (int i = 0;i<trust.length;i++){
            int[] trusted = trust[i];
            canidates[trusted[0]-1]=false;
            influence[trusted[1]-1]=(influence[trusted[1]-1])+1;
        }
        for (int j=0;j<N;j++){
            if (canidates[j]&&influence[j]==N-1){
                return j+1;
            }
        }

        return -1;
    }

}
