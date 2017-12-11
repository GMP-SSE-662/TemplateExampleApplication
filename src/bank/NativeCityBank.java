package bank;

public class NativeCityBank extends Bank {
    @Override
    void handleFee() {
        amountFromAccount += 5;
    }

    @Override
    void handleRewards() {
        System.out.println("We do have a rewards program!" +
                "You saved $2!");
        amountFromAccount -= 2;
    }
}
