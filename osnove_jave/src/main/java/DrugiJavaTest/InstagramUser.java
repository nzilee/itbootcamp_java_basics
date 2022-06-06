package DrugiJavaTest;

public class InstagramUser {
    private String username;
    private String fullName;

    public InstagramUser(String username) {
        this.username = username;
    }

    public InstagramUser(String username, String fullName) {
        this.username = username;
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void print(){
        System.out.println("@" + this.username + "\t" + this.fullName);
    }

    public String generateURL (){
        return ("https://www.instagram.com/" + this.username + "/");
    }
}
