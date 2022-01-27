package day1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Antra");

        String s1 = new String("a");
        StringTest(s1);
        System.out.println(s1);
    }
    public static void StringTest(String s1)
    {
        s1 = s1 + "aa";
        System.out.println(s1);
    }
}
