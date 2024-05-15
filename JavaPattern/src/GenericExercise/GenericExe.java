package GenericExercise;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings({"all"})
public class GenericExe {

  public static void main(String[] args) {

    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(new Employee("yujin", 30000, new MyDate(2003, 9, 1)));
    employees.add(new Employee("Wongyoung", 30000, new MyDate(2004, 8, 31)));
    employees.add(new Employee("yujin", 30000, new MyDate(2004, 9, 1)));

    System.out.println("employees: " + employees);

    // sort based on (1)first name(2)if name equal than based on the
    // birthdate.

    employees.sort(new Comparator<Employee>() {
      @Override
      public int compare(Employee e1, Employee e2) {
        if (!(e1 instanceof Employee && e2 instanceof Employee)){
          System.out.println("type not match");
          return 0;
        }
        int res = e1.getName().compareTo(e2.getName());
        if (res != 0) return res;

        return e1.getBirthday().compareTo(e2.getBirthday());

//        // name equal, compare birthday
//        int yearDiff = e1.getBirthday().getYear() - e2.getBirthday().getYear();
//        if (yearDiff != 0) return yearDiff;
//        // year equal, compare month
//
//        int monthDiff = e1.getBirthday().getMonth() - e2.getBirthday().getMonth();
//        if (monthDiff != 0) return monthDiff;
//
//        // compare day
//        return e1.getBirthday().getDay() - e2.getBirthday().getDay();

      }
    });

    System.out.println("results after sorting =======");
    System.out.println(employees);
  }

}
