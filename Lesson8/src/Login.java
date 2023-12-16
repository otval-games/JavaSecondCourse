public class Login {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        sendToMars();
        saveInDB();
    }

    public void sendToMars(){
        System.out.println("Sended to Mars: "+name);
    }

    public void saveInDB(){
        System.out.println("Saved in DB: "+name);
    }
}
