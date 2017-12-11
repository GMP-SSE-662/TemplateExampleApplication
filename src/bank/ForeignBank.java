package bank;

public class ForeignBank extends Bank {
    @Override
    void handleFee() {
        amountFromAccount += 10;
    }
}
