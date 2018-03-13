public class hexConversion {
    /**
     * @param n: a decimal number
     * @param k: a Integer represent base-k
     * @return: a base-k number
     */
    private static char[] array = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            .toCharArray();
    public String hexConversion(int n, int k) {
        // write your code here
        StringBuffer str=new StringBuffer();
        String returnStr=new String();
        while(n/k!=0){
            str.insert(0,array[n%k]);
            n=n/k;
        }
        str.insert(0,array[n%k]);
        returnStr=str.toString();
        return returnStr;
    }
}
