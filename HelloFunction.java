import java.util.*;


public class HelloFunction {
    public static void main(String[] args) {
        //hello();
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String Yname = sc.next();
        String output = name(Yname);
        System.out.println(output);
         


    }
    static void hello(){
        System.out.println("Hello World");
    }


    // Passing arguments through the strings function 
    static String name(String name){
        String a = "hello " + name;
        return a ;

        }
}
