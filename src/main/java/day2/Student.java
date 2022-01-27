package day2;

public class Student implements  Comparable<Student>{
    Integer age;
    @Override
    public int compareTo(Student o) {
        if (this.age == o.age)
            return 0;
        return this.age>o.age?1:-1;

    }
    public Student(Integer age)
    {
        this.age = age;
    }
}
