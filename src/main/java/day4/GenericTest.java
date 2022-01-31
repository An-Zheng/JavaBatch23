package day4;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
//        Node<Integer,String> no = new Node<Integer, String>(1,"sdf");
//        Integer [] arr = {213,231};
//        System.out.println(getFirstElement(arr));

        A<String> a1 = new A<>();
        a1.setFirst("dsfsdf");
        showBox(a1);

        ArrayList<Object> list = new ArrayList<>();
        list.add( 5);
    }

    public static <E> E getFirstElement(E[] arr)
    {
        return arr[0];
    }
    public static <E,V> E method(E[] arr,V[] arr1)
    {
        return arr[0];
    }

//    public   static  <T> void  showBox(A<T> box)
//    {
//        Number first = (Number)box.getFirst();
//        System.out.println(first);
//    }
    public   static   void  showBox(A<?> box)
    {
        Object first = box.getFirst();
        System.out.println(first);
    }
}

class Node<K,V>
{
    K key;
    V value;

    public Node(K key,V v)
    {
        this.key = key;
        this.value = v;
    }
}