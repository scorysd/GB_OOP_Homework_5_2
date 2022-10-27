package Infosystem;

class Payplatform {
    Department department;
    Worker worker;

    Payplatform() {
    }
    public void Pay(Worker worker, Department department){
        System.out.printf("Зарплпта %s %s ", worker.getFirstName(), worker.getLastName());
        System.out.printf("работающего в отдле %s = ", department.getName());
        System.out.printf("%f рублей\n", worker.getExperience() * department.getSalary());
    }
}
