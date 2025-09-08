import java.util.Objects;

public class User {

    private String name;
    private String userID;

    public User (String name, String userID) {
        this.name = name;
        this.userID = userID;
    }

    public String getName() { return name;}
    public void setName(String name) {this.name = name;}

    public String getUserId() { return userID;}
    public void setUserID(String userID) {this.userID = userID;}

    @Override
    public String toString(){
        return String.format("%s, %s", name, userID);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof User)) return false;
        User user = (User) o;
        return name.equalsIgnoreCase(user.name) && userID.equalsIgnoreCase(user.userID);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name.toLowerCase(),userID.toLowerCase());
    }
}
