package DrugiJavaTest;

import java.util.ArrayList;

public class InstagramStory {

    private InstagramUser autor;
    private String swipeUpLink;
    private String linkDoSlike;
    private ArrayList<InstagramAddOn> dodaci = new ArrayList<>();
    private ArrayList<InstagramUser> users = new ArrayList<>();

    public InstagramUser getAutor() {
        return autor;
    }

    public String getSwipeUpLink() {
        return swipeUpLink;
    }

    public String getLinkDoSlike() {
        return linkDoSlike;
    }

    public ArrayList<InstagramAddOn> getDodaci() {
        return dodaci;
    }

    public ArrayList<InstagramUser> getUsers() {
        return users;
    }

    public void setSwipeUpLink(String swipeUpLink) {
        this.swipeUpLink = swipeUpLink;
    }

    public InstagramStory(InstagramUser autor,
                          String linkDoSlike,
                          ArrayList<InstagramAddOn> dodaci,
                          ArrayList<InstagramUser> users) {
        this.autor = autor;
        this.linkDoSlike = linkDoSlike;
        this.dodaci = dodaci;
        this.users = users;
    }

    public void dodajDodatak(InstagramAddOn dodatak){
        this.dodaci.add(dodatak);
    }

    public void obrisiDodatak(int ID){
        for (int i = 0; i < this.dodaci.size(); i++) {
            if (this.dodaci.get(i).getID() == ID){
                this.dodaci.remove(i);
            }
        }
    }

    private boolean jestePogledao(String username){
        for (int i = 0; i < this.users.size(); i++) {
            if (this.users.get(i).getUsername().equals(username)){
                return true;
            }
        } return false;
    }

    public void pogledajStory(InstagramUser m){
        if (!this.jestePogledao(m.getUsername())){
            this.users.add(m);
        }
    }

    public void postavljanjeStorija(){
        this.autor.print();
        System.out.println("Story:");
        System.out.println("Image: " + this.linkDoSlike);
        for (int i = 0; i < this.dodaci.size(); i++) {
            this.dodaci.get(i).print();
        }
        if (this.swipeUpLink != null){
            System.out.println("<<< swipe up >>>");
            System.out.println(this.swipeUpLink);
        }
    }

    public int brojPregleda(){
        int brojPregleda = 0;
        for (int i = 0; i < this.users.size(); i++) {
            this.users.get(i);
            brojPregleda++;
        } return brojPregleda;
    }

    public void korisniciKojiSuPregledali(){
        System.out.println("Viewers: " + this.brojPregleda());
        for (int i = 0; i < this.users.size(); i++) {
            this.users.get(i).print();
        }
    }
}
