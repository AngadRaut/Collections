package collection.comparablecomparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        return this.getRoll_no()-(o.getRoll_no());
    }

    @Override
    public String toString() {
        return "Student{ " +
                "age=" + age +
                ", roll_no = " + roll_no +
                ", name = " + name + '\'' +
                ", div = " + div +
                " }\n";
    }

    public Student(int age, int roll_no, String name, char div) {
        this.age = age;
        this.roll_no = roll_no;
        this.name = name;
        this.div = div;
    }

    public int getAge() {
        return age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public char getDiv() {
        return div;
    }

    int age;
    int roll_no;
    String name ;
    char div ;

    public static void main(String[] args) {
        /*Student student = new Student(12,102,"Dhiraj",'A');
        Student student1 = new Student(11,105,"Shiv",'B');
        Student student2 = new Student(10,100,"Ram",'A');
        Student student3 = new Student(13,104,"Sham",'B');
        Student student4 = new Student(17,108,"Mohan",'A');
        Student student5 = new Student(18,107,"Rajni",'B');
        Student student6 = new Student(19,188,"Anand",'A');
        Student student7 = new Student(14,199,"Bhushan",'B');
        Student student8 = new Student(15,167,"Kalyan",'A');
        Student student9 = new Student(16,145,"Jogi",'B');
        Student student10 = new Student(21,134,"Vishnu",'A');
        Student student11 = new Student(20,156,"Sanjay",'B');*/

        List<Student> student_list = new ArrayList<>();
        student_list.add(new Student(12,102,"Dhiraj",'A'));
        student_list.add(new Student(11,105,"Shiv",'B'));
        student_list.add(new Student(10,100,"Ram",'A'));
        student_list.add(new Student(13,104,"Sham",'B'));
        student_list.add(new Student(17,108,"Mohan",'A'));
        student_list.add(new Student(18,107,"Rajni",'B'));
        student_list.add(new Student(19,188,"Anand",'A'));
        student_list.add(new Student(14,199,"Bhushan",'B'));
        student_list.add(new Student(15,167,"Kalyan",'A'));
        student_list.add(new Student(16,145,"Jogi",'B'));
        student_list.add(new Student(21,134,"Vishnu",'A'));
        student_list.add(new Student(20,156,"Sanjay",'B'));

        System.out.println(student_list);

        Collections.sort(student_list);

        System.out.println(student_list);


    }
}
