import bank.*;
import client.Client;

public class TemplateTestDrive {

    public static void main(String[] args) {
        Client testClient = new Client();

        System.out.println("\nNative Small Town Bank:");
        Bank testBank = new NativeSmallTownBank();
        testBank.performWithdrawal(testClient, 100);
        testClient.makeRewardsMember();
        testBank.performWithdrawal(testClient, 100);

        System.out.println("\nNative City Bank:");
        testBank = new NativeCityBank();
        testBank.performWithdrawal(testClient, 100);
        testClient.removeRewards();
        testBank.performWithdrawal(testClient, 100);

        System.out.println("\nForeignBank:");
        testBank = new ForeignBank();
        testBank.performWithdrawal(testClient, 100);
        testClient.makeRewardsMember();
        testBank.performWithdrawal(testClient, 100);
    }
}
