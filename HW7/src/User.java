public class User {
    private String name;
    private String surname;
    private String email;

    User(String name, String surname, String email){
        this.name=name;
        this.surname=surname;
        this.email=email;
    }

    public String getFullName() {
        return name+""+surname;
    }

    public String getEmail() {
        return email;
    }
}