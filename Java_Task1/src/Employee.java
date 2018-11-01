public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private  int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int persent){
        this.salary = salary + persent*(salary/100);
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: id:" + id +" firstName:" +firstName
                + "lastName" + lastName + "  salary:" + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Employee empl = (Employee) obj;
        return id == empl.id && firstName.equals(empl.firstName) && lastName.equals(empl.lastName) && salary == empl.salary;
    }

    @Override
    public int hashCode() {
        int result = id;
        result += firstName.hashCode();
        result += lastName.hashCode();
        result += salary;
        return result;
    }
}
