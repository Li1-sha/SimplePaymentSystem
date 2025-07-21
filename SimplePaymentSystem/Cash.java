public class Cash extends PaymentMethod{
    public Cash(){
    }

    public Cash(String name) {
        super(name);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using Cash: "+getName());
    }
}
