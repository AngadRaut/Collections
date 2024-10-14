package javaBasics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Collections;
public class SortUsingComparator implements Comparator<Student> {
    @Override
    public int compare(Student obj1, Student obj2){
        Integer i1 = (Integer)obj1.age;
        Integer i2 = (Integer)obj2.age;
        return i1-i2;
    }
    public static void main(String[] args) {
    }
}
