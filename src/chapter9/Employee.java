package chapter9;

public class Employee extends Person {

    private String employeId;
    private String title;

    public Employee() {
        super("Stan");
        System.out.println("This is the Employee Constructor!");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeId() {
        return employeId;
    }

    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }
}
