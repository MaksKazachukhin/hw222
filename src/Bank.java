public class Bank {
    private double amount;

    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(double sum) throws Limit {
        if (sum > amount) {
            throw new Limit("Недостаточно средств!", amount);
        }
        amount -= sum;
    }
}
