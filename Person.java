public class Person
{ 
    
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    @Override
    public String toString() {
        return "Person: " + name;
    }
}

public class Student extends Person {
    private static final String[] CLASS_STATUS = {"head", "manager", "Junior", "Senior"};
    private String classStatus;
    
    public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }
    
    @Override
    public String toString() {
        return "Student: " + getName();
    }
}

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;
    
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    
    @Override
    public String toString() {
        return "Employee: " + getName();
    }
}

public class Faculty extends Employee {
    private String officeHours;
    private String rank;
    
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    @Override
    public String toString() {
        return "Faculty: " + getName();
    }
}