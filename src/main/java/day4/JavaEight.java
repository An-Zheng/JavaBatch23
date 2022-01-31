package day4;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Supplier;

public class JavaEight {
    public static void main(String[] args) {
        Queue<Integer> heap = new PriorityQueue<>((o1,o2)->{ return o1-o2;});
        SayBye sb = ()->{
            System.out.println("buy");
        };
        sb.sayBye();

        Supplier<Double> generateRandomNum = ()-> Math.random();
        System.out.println(generateRandomNum.get());
    }
}

@FunctionalInterface
interface  SayBye{
    void sayBye();
    default  public  void syaHello()
    {
        System.out.println("Hello");
    }

    default public  void sayGM()
    {
        System.out.println("good morning");
    }
}