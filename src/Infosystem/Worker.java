package Infosystem;

class Worker {
    private String firstName;
    private String lastName;
    private double experience;

    Worker(String firstName, String lastName, double experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getExperience() {
        return experience;
    }
}
