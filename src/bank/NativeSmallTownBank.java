package bank;

public class NativeSmallTownBank extends Bank {
    @Override
    void handleFee() {
        amountFromAccount += 5;
    }
}
