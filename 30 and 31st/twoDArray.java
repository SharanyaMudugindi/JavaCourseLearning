public class twoDArray {
    public static void main(String[] args) {
        /*int[][] grades=new int[3][4];
        System.out.println(Arrays.toString(grades[0]));
        System.out.println(Arrays.toString(grades[1]));
        System.out.println(Arrays.toString(grades[2]));
        grades[0][0]=67;
        grades[0][1]=67;
        grades[0][2]=67;
        grades[0][3]=67;

        grades[1][0]=67;
        grades[1][1]=67;
        grades[1][2]=67;
        grades[1][3]=67;

        grades[2][0]=67;
        grades[2][1]=67;
        grades[2][2]=67;
        grades[2][3]=67;

        System.out.println(Arrays.toString(grades[0]));
        System.out.println(Arrays.toString(grades[1]));
        System.out.println(Arrays.toString(grades[2]))); */
        //faster way
        int[][] grades1={{1,5,1},
                         {1,1,1},
                         {1,1,1},
                         {1,1,1}};
        /*System.out.println(Arrays.toString(grades1[0]));
        System.out.println(Arrays.toString(grades1[1]));
        System.out.println(Arrays.toString(grades1[2]));
        System.out.println(Arrays.toString(grades1[3]));
        System.out.println((grades1[0][1]));
        System.out.println((grades1.length));
        System.out.println((grades1[0].length));
        System.out.println((grades1[1].length));

        for(int j=0;j<grades1[0].length;j++)
        {
            System.out.print(grades1[0][j]+" ");
        }
        System.out.println("\n");
        for(int j=0;j<grades1[1].length;j++)
        {
            System.out.print(grades1[1][j]+" ");
        }
        System.out.println("\n");
        for(int j=0;j<grades1[2].length;j++)
        {
            System.out.print(grades1[2][j]+" ");
        }*/
        for(int i=0;i<grades1.length;i++)
        {
            for(int j=0;j<grades1[i].length;j++)
            {
                System.out.print(grades1[i][j]+" ");
                
            }
            System.out.println("\n");



        }



        

        



        }


    }
