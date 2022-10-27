package Infosystem;

class Department {
    private String name;
    private int salary;

    Department(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
