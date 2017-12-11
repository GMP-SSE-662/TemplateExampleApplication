package bank;

import client.Client;

public abstract class Bank {

    int amountFromAccount;

    /**
     * Performs a withdrawal.
     * @param client person asking to withdraw money
     * @param requiredAmount amount client wants to withdraw
     * @return the total amount of money the client takes out
     *          of his/her bank account, including the withdrawn
     *          amount.
     */
    public final void performWithdrawal(Client client, int requiredAmount) {
        amountFromAccount = 0;
        if (client.isRewardsMember())
            handleRewards();
        handleFee();
        notifyClient(requiredAmount);
    }

    abstract void handleFee();

    void handleRewards() {
        System.out.println("Sorry, we don't offer rewards member benefits at this location.");
    }

    private void notifyClient(int requiredAmount) {
        System.out.println(String.format("You asked for: %s", requiredAmount));
        System.out.println(String.format("Total withdrawn after fee: %s", amountFromAccount + requiredAmount));
    }
}
