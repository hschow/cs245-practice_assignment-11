public class Practice11Test {


    public static void main(String[] args){

        Judge judy = new Judge();
        int[][] t1 = new int[][]{{1,2},{2,1},{1,3},{2,3}};
        int[][] t2 = new int[][]{{1,3},{2,1},{3,1},{2,3}};
        int[][] t3 = new int[][]{{1,2},{2,1},{1,3},{2,3},{4,1}};
        int[][] t4 = new int[][]{};
        int[][] t5 = new int[][]{{1,2}};
        int[][] t6 = new int[][]{{1,3},{2,3}};
        int[][] t7 = new int[][]{{1,3},{2,3},{3,1}};
        int[][] t8 = new int[][]{{1,2},{2,3}};
        int[][] t9 = new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        System.out.println(judy.findJudge(3, t1)); //If there is an judge then the numbetr that corresponds to the judge will be printed otherwise, -1 will be printed
        System.out.println(judy.findJudge(3, t2));
        System.out.println(judy.findJudge(4, t3));
        System.out.println(judy.findJudge(0, t4));
        System.out.println(judy.findJudge(2,t5));
        System.out.println(judy.findJudge(3,t6));
        System.out.println(judy.findJudge(3,t7));
        System.out.println(judy.findJudge(3,t8));
        System.out.println(judy.findJudge(4,t9));
    }

}
