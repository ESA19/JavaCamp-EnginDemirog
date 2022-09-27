public class Actor {
    private String first_Name;
    private String last_Name;

    public Actor(String first_Name, String last_Name) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
    }

    @Override
    public String toString() {
        return first_Name + " " + last_Name;
    }

}
