package models;

public class Customer {
    private String email;
    private String name;

    public Customer(String email, String name) {
        this.email = email;
        this.name = name;
    }

    // toString() -> human readable output
    @Override
    public String toString() {
        return "Customer[email=" + email + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Customer other = (Customer) obj;

        return this.email.equalsIgnoreCase(other.email);
    }

    @Override
    public int hashCode() {
        return email.toLowerCase().hashCode();
    }
}