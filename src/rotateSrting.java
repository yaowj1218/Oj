public class rotateSrting {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        int j=0;
        if(str.length==0) return;
        int m=offset%str.length;
        char[] temp=new char[m];
        for(int i=str.length-m;i<str.length;i++){
            temp[j++]=str[i];
        }
        for(int k=str.length-m-1;k>=0;k--){
            str[k+m]=str[k];
        }
        for(int n=0;n<m;n++){
            str[n]=temp[n];
        }

    }
}
