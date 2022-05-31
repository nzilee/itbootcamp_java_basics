package p_24_5_2022.Exercise1;

public class UserZoomCallMain {
    public static void main(String[] args) {

        User host = new User("Host Hosting");
        host.subscribe(150);

        User guest = new User("Guest Guesting");

        ZoomCall call = new ZoomCall("www.zoomcall.com", "12345678", host);

        call.setGuest(guest);
        call.startCall();
    }
}
