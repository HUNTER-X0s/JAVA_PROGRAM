public class matrix_addition {
    public static void main(String[] args) {
        int [][] mat1={{1,2,3},
                       {4,5,6}};
        int [][] mat2={{7,8,9},
                       {12,34,56}};
        int [][] result={{0,0,0},
                         {0,0,0}};

        for(int i=0;i<mat1.length;i++){//row no.of times
            for(int j=0;j<mat1[i].length;j++){ //column no.of times
                System.out.format("setting value for i=%d and j=%d\n",i,j);
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        //printing the values of 2d array
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j] +" ");
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
            System.out.println(" ");
        }
    }
}
