package hello.dtos;

public class User_dto {

    private String username;
    private String password;

    public User_dto(String username, String password) {
        this.username = getUsername();
        this.password = password;
    }

    public User_dto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
