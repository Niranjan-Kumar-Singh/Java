package models;

public class Employee {
    private int empId;
    private String department;

    public Employee(int empId, String department) {
        this.empId = empId;
        this.department = department;
    }

    // toString() -> human readable output
    @Override
    public String toString() {
        return "Employee[id=" + empId + ", dept=" + department + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee other = (Employee) obj;
        return this.empId == other.empId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(empId);
    }
}