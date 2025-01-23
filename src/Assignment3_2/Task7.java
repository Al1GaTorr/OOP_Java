package Assignment3_2;

public class Task7 {
    public class Programmer {
    private int salary = 1000;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        if (salary > this.salary){
        this.salary = salary;
    }
    }
    }
}
