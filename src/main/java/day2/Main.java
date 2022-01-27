package day2;

import javax.swing.plaf.IconUIResource;
import java.security.KeyPair;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.get(0);
        Vector<Integer> vec = new Vector<>();
        vec.add(6);
        vec.get(0);

        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(1);
        dq.offerLast(6);
        dq.pollFirst();
        dq.pollLast();

        Stack<Integer> st = new Stack<>();
        st.add(7);
        st.peek();
        st.pop();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(6);
        hs.add(7);
        hs.add(8);
        hs.contains(6);
        for (Integer h : hs) {
            System.out.println(h);
        }
        for(Integer a : hs)
        {
            System.out.println(a);
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,6);
        map.get(1);


        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + entry.getValue());
        }

        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext())
        {
            Map.Entry<Integer, Integer> entry = itr.next();

        }
//        TreeSet<Student> treeSet = new TreeSet<>();
//        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.age == o2.age)
//                    return 0;
//                return o1.age>o2.age?1:-1;
//            }
//        });
        TreeSet<Student> treeSet = new TreeSet<>((o1,o2) -> {
                            if (o1.age == o2.age)
                    return 0;
                return o1.age>o2.age?1:-1;
        });
        treeSet.add(new Student(27));
        treeSet.add(new Student(26));
        treeSet.add(new Student(29));

        for (Student stuD : treeSet)
        {
            System.out.println(stuD.age);
        }
    }
}
