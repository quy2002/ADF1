package sample;
public class Student {
    String name;
    int age;
    int mark;

    public Student() {
    }

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name+ " "+ age+ " "+ mark;
    }

}
