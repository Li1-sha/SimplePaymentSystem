//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    CreditCard creditCard = new CreditCard("Visa");
    Cash cash = new Cash("Wallet");
    creditCard.pay(50.0);
    cash.pay(20.0);
    }
}
