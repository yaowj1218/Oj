public class sortIntegers {
    public void sortIntegers(int[] A) {
        // write your code here
        //selectSort(A);
        //bubleSort(A);
        insertSort(A);
    }
    public void selectSort(int[] A){
        int min_idx=0;
        for(int i=0;i<A.length;i++){
            min_idx=i;
            for(int j=i;j<A.length;j++){
                if(A[j]<A[min_idx]) min_idx=j;
            }
            //swap(A[i],A[min_idx]);
            int temp = A[i];
            A[i]=A[min_idx];
            A[min_idx]=temp;
        }
    }
    public void bubleSort(int[] A){
        for(int i=0;i<A.length;i++){
            for(int j = i+1;j<A.length;j++){
                if(A[j]<A[i]){
                    int temp = A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
                //swap(A[i],A[j]);
            }
        }

    }
    public void insertSort(int[] A){
        for(int i=0;i<A.length;i++){
            while(i>0&&A[i-1]>A[i]){
                int temp = A[i];
                A[i]=A[i-1];
                A[i-1]=temp;
                i--;
            }
        }
    }

    // public void swap(int a,int b){
    //     int temp = a;
    //         a=b;
    //         b=temp;
    // }
}
