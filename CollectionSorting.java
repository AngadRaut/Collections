package javaBasics;

import java.util.ArrayList;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionSorting implements Comparable<CollectionSorting>{
    String bank_name;
    int interest_rate;
    CollectionSorting(String bank_name,int interest_rate){
        this.bank_name=bank_name;
        this.interest_rate=interest_rate;
    }
    public String getBank_name(){
        return bank_name;
    }
    public int getInterest_rate(){
        return interest_rate;
    }
    public String toString(){
        return getBank_name()+":"+getInterest_rate();
    }

    // sorting by name of bank
    /*@Override
    public int compareTo(CollectionSorting object){
        return this.bank_name.compareTo(object.bank_name);
    }*/

    @Override
    public int compareTo(CollectionSorting o){
        return this.interest_rate-o.interest_rate;
    }
    public static void main(String[] args) {
        CollectionSorting obj = new CollectionSorting("SBI",5);
        CollectionSorting obj1 = new CollectionSorting("SBH",4);
        CollectionSorting obj2 = new CollectionSorting("KOTAK",3);
        CollectionSorting obj3 = new CollectionSorting("AXIS",2);
        CollectionSorting obj4= new CollectionSorting("BALAJI",1);
        CollectionSorting obj5 = new CollectionSorting("SAI BABA",0);
        CollectionSorting obj6 = new CollectionSorting("GRAMIN",9);
        CollectionSorting obj7 = new CollectionSorting("VIDARBHA",3);

        ArrayList<CollectionSorting> list = new ArrayList<>();
        list.add(obj3);
        list.add(obj6);
        list.add(obj4);
        list.add(obj7);
        list.add(obj2);
        list.add(obj);
        list.add(obj5);
        list.add(obj1);
        System.out.println("before sorting list = \n"+list);

        // sorting the list
        Collections.sort(list);
        System.out.println("before sorting list = \n"+list);
    }
}
