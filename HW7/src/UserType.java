abstract class UserType {
    private boolean isPremium;
    UserType(boolean isPremium){
        this.isPremium=isPremium;
    }
    void printInfo(User user) {
    }

    public boolean isPremium() {
        return isPremium;
    }
}
