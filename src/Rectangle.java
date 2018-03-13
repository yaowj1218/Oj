public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    private int width;
    private int height;
    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return this.width*this.height;
    }
}
//构造函数前不加 public 就是 protect 同包内可用。
