package client;

public class Client {
    private boolean rewardsMember;

    public Client() {
        rewardsMember = false;
    }

    public void makeRewardsMember() {
        System.out.println("You just received rewards member status!");
        rewardsMember = true;
    }

    public void removeRewards() {
        System.out.println("You lost your rewards member status!");
        rewardsMember = false;
    }

    public boolean isRewardsMember() {
        return rewardsMember;
    }
}
