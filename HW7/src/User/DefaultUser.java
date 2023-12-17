package User;

public class DefaultUser implements UserType{
    public int activityLvl;
    public DefaultUser(int activityLvl) {
        this.activityLvl=activityLvl;
    }

    @Override
    public void printInfo(User user) {
        System.out.println("Username: "+user.getFullName());
        System.out.println("Status: Default User");
        System.out.println("E-Mail: "+user.getEmail());
    }
}