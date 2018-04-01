public class searchMatrix {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // // write your code here
        // int row=matrix.length;
        // if (row==0) return false;
        // int column=matrix[0].length;
        // int i=0,j=0;
        // while(i<row-1){
        //     if(target==matrix[i][j]) return true;
        //     else if(target>matrix[i][j]){
        //         if(j<column-1) j++;
        //         else{
        //             i++;j=0;
        //         }
        //     }
        // }
        // return false; 超时。。。最好分段

        int row=matrix.length;
        if (row==0) return false;
        int column=matrix[0].length;
        int i=0,j=column-1;
        while(i<row&&j>=0){
            if(target==matrix[i][j]) return true;
            else if(target>matrix[i][j]){
                i++;
            }else if(target<matrix[i][j]){
                j--;
            }
        }
        return false;
    }
}
