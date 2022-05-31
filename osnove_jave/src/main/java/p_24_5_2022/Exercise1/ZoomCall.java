package p_24_5_2022.Exercise1;

public class ZoomCall {

    private String callLink;
    private String password;
    private User host;
    private User guest;

    public ZoomCall(String callLink, String password, User host) {
        this.callLink = callLink;
        this.password = password;
        this.host = host;
    }



    public String getCallLink() {
        return callLink;
    }


    public String getPassword() {
        return password;
    }

    public User getHost() {
        return host;
    }

        public User getGuest() {
        return guest;
    }

    public void setGuest(User guest) {
        this.guest = guest;
    }

    public void startCall(){
        System.out.println("Zoom Call: " + this.callLink);
        System.out.println("Password: " + this.password);
        System.out.print("Host: ");
        this.host.print();
        System.out.print("Guest: ");
        this.guest.print();
        System.out.println("Maximum length of ZoomCall: " + this.host.maxCallLength() + " min");

    }
}
