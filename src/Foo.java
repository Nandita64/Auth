import java.io.*;
interface Foo {
     public String str = "check";
}
class Alpha implements Foo {
    public Alpha(){
        System.out.print(str);
    }
}
class Beta extends Alpha {
    public Beta(){
    System.out.print("HI");}
}
class Delta extends Beta {
    public static void main( String[] args ) {
        Alpha x = new Beta();
        //insert code here 16
    } }