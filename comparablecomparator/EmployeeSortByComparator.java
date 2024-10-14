package collection.comparablecomparator;
import java.util.Comparator;

public class EmployeeSortByComparator implements Comparator<Employee>

    // sort by id
{
   /* @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getId() > o2.getId() ? 1 : o1.getId() < o2.getId() ? -1 : 0 ;

    }*/

    // sort by salary
   /* @Override
    public int compare(Employee o1, Employee o2){
        return o1.getSalary() > o2.getSalary() ? 1 : o1.getSalary() < o2.getSalary() ? -1 : 0 ;
    }*/

    // sort by name
    @Override
    public int compare(Employee o1 , Employee o2){
        return o1.getName().compareTo(o2.getName());
    }
}
