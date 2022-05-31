package p_30_5_2022.igPost;

public class InstagramUser {

    private String username;
    private String imeIprezime;
    private String email;

    public InstagramUser(String username, String imeIprezime, String email) {
        this.username = username;
        this.imeIprezime = imeIprezime;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print(){
        System.out.println(this.username + " - " + this.imeIprezime + " - " + this.email);
    }

}
