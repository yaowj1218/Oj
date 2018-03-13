import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    /**
     * @param n: an integer
     * @return: an integer f(n)
     */
    // public int fibonacci(int n) {
    //     // write your code here
    //       // write your code here
    //     if(n==1)
    //     return 0;
    //     else if(n==2)
    //     return 1;
    //     else return fibonacci(n-2)+fibonacci(n-1);
    // }
    public int fibonacci(int n) {
        // write your code here
        // write your code here
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        for (int i = 0; i < n; i++) {
            if (list.size() < (i + 1)) {
                list.add(list.get(i - 1) + list.get(i - 2));
            }
        }
        return list.get(n - 1);
    }
}
//数组一般规定大小 list 没限制，用起来比较方便
// 数字比较大的情况下，递归效率不理想，考虑分治算法或者数组或者其他方法