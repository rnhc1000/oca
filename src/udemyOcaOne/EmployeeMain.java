package udemyOcaOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static udemyOcaOne.EmployeeData.employeeData;

class Employee {
  int id;
  String name;
  int age;
  String gender;
  String department;
  int yearOfJoining;
  double salary;

  public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
  {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.department = department;
    this.yearOfJoining = yearOfJoining;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getYearOfJoining() {
    return yearOfJoining;
  }

  public void setYearOfJoining(int yearOfJoining) {
    this.yearOfJoining = yearOfJoining;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", gender='" + gender + '\'' +
            ", department='" + department + '\'' +
            ", yearOfJoining=" + yearOfJoining +
            ", salary=" + salary +
            '}' +
            "\n";
  }
}
class EmployeeData {

  public static List<Employee> employeeData() {

    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
    employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
    employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
    employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
    employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
    employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
    employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
    employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
    employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
    employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
    employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
    employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
    employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
    employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
    employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
    employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
    employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
    return employeeList;
  }
}
public class EmployeeMain {
  public static void main(String[] args) {
    List<Employee> listOfEmployees = new ArrayList<>();
    listOfEmployees = employeeData();
    // Employees Males and Females
    Map<String, Long> employeesGender = new HashMap<>();
    employeesGender = countMalesFemales(listOfEmployees);
    System.out.println(employeesGender);
    List<String> dept = new ArrayList<>();
    dept = countDepartments(listOfEmployees);
    System.out.println(dept);
    Map<String, Double> age = new HashMap<>();
    age = averageAge(listOfEmployees);
    System.out.println(age);
    List<String> employee2015 = new ArrayList<>();
    employee2015 = after2015(listOfEmployees);
    System.out.println(employee2015);
    Map<String,Long> listOfEmployeesByDepartment = new HashMap<>();
    listOfEmployeesByDepartment = countEmployeePerDepartment(listOfEmployees);
    System.out.println(listOfEmployeesByDepartment);
  }

  public static Map<String, Long> countMalesFemales(List<Employee> employeeList) {
    return employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
  }

  public static List<String> countDepartments(List<Employee> employeeList) {
  List<String> departments = new ArrayList<>();
    employeeList.stream()
            .map(Employee::getDepartment)
            .distinct()
            .forEach(departments::add);
   return departments;
  }

  public static Map<String, Double> averageAge(List<Employee> employeeList) {
    return employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
  }

  public static List<String> after2015(List<Employee> employeeList) {
    List<String> employeeListAfter2015 = new ArrayList<>();
    employeeList.stream()
            .filter(e -> e.getYearOfJoining() > 2015)
            .map(employee -> employee.getName())
            .forEach(employeeListAfter2015::add);
    return employeeListAfter2015;
  }

  public static Map<String, Long> countEmployeePerDepartment(List<Employee> employeeList) {
    Map<String,Long> countEmployees = employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
    return countEmployees;

  }
}
