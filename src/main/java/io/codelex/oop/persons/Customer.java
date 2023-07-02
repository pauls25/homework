package io.codelex.oop.persons;

public class Customer extends Person {
    private String customerId;
    private int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.purchaseCount = purchaseCount;
        this.customerId = id;
    }

    public int getPurchaseCount() {
        return this.purchaseCount;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    @Override
    public String getInfo() {
        return String.format("Full name: %s, customer Id: %s, purchase count: %d\n",
                this.getFullName(),
                this.getCustomerId(),
                this.getPurchaseCount());
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
