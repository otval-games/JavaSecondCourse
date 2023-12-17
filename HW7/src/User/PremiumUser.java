package User;

public class PremiumUser implements UserType{
    public int activityLvl;
    public PremiumUser(int activityLvl) {
        this.activityLvl=activityLvl;
    }

    @Override
    public void printInfo(User user) {
        System.out.println("Username: "+user.getFullName());
        System.out.println("Status: Premium User");
        System.out.println("E-Mail: "+user.getEmail());
    }
}
