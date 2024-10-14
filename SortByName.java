package javaBasics;
import java.util.Comparator;
public class SortByName implements Comparator<Student>{
    public int compare(Student o1,Student o2){
        String s1 = (String) o1.name;
        String s2 = (String) o2.name;

        return s1.compareTo(s2);
    }
}
