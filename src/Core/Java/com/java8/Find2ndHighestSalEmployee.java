package Core.Java.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find2ndHighestSalEmployee {
    public static void findEmployeeDetails() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(List.of(new Employee("Ram", 101, 32, 2000.0),
                new Employee("Shyam", 103, 42, 2001.0),
                new Employee("Vima", 105, 23, 2005.0)));
        System.out.println(employeeList);
        Employee emp2ndHighest = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSal))
                .skip(1).findFirst().get();
        System.out.println(emp2ndHighest);

        Employee employee = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getAge)).get();
        Double avgAge = employeeList.stream().collect(Collectors.averagingInt(Employee::getAge));
        Double avgAg1e = employeeList.stream().mapToDouble(Employee::getAge).average().orElseThrow();
        System.out.println("using collectros.." + avgAge);
        System.out.println("using matoint ..." + avgAg1e);
    }


}
