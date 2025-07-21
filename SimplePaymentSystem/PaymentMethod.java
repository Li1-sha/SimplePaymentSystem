public abstract class PaymentMethod {
    private String name;

    public PaymentMethod(){
    }
    public PaymentMethod(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void pay(double amount);
}
