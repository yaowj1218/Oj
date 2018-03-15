import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> list = new ArrayList<String>();//这样创建一个 List
        for(int i=1;i<=n;i++){
            if((i%3==0)&&(i%5==0)){//条件苛刻的放前面，防止跳过
                list.add("fizz buzz");
            }
            else if(i%3==0){//else if 保证了三个里面只要有一个成功了就不用进行以下的操作。
                list.add("fizz");
            }
            else if(i%5==0){
                list.add("buzz");
            }
            else list.add(String.valueOf(i));

        }
        return list;
    }
}
