package javaBasics;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        Student s = new Student("Digvijay",102);
        Student s1 = new Student("Ram",101);
        Student s2 = new Student("Sham",109);
        Student s3 = new Student("Vishnu",108);
        Student s4 = new Student("Rani",104);
        Student s5 = new Student("Shraddha",103);
        Student s6 = new Student("Bharati",105);
        Student s7 = new Student("Kirti",107);
        Student s8 = new Student("Monika",106);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s5);
        list.add(s2);
        list.add(s7);
        list.add(s3);
        list.add(s6);
        list.add(s);
        list.add(s4);
        list.add(s1);
        list.add(s8);

        System.out.println("before sorting list = /n"+list);

        Collections.sort(list,new SortByName());
        System.out.println("after sorting list = /n"+list);

    }
    }

