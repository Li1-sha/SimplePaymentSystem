public class CreditCard extends PaymentMethod{
    public CreditCard() {
    }

    public CreditCard(String name) {
        super(name);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using Credit Card: "+getName());
    }
}
