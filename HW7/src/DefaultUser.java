public class DefaultUser extends UserType{
    DefaultUser(boolean isPremium) {
        super(isPremium);
    }

    @Override
    void printInfo(User user) {
        System.out.println("DefaultUser: "+user.getFullName());
        System.out.println("Status: "+isPremium());
        System.out.println("E-Mail: "+user.getEmail());
    }

}
