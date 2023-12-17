package User;

public class User {
    private String name;
    private String surname;
    private String email;
    private UserType type;

    public User(UserType type, String name, String surname, String email){
        this.type=type;
        this.name=name;
        this.surname=surname;
        this.email=email;
    }

    public String getFullName() {
        return name+" "+surname;
    }

    public String getEmail() {
        return email;
    }
}