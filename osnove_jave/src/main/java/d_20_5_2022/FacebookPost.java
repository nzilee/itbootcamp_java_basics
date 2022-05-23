package d_20_5_2022;

public class FacebookPost {

    public String fullName;
    public String profileName;
    public String postedText;
    public int likeNumber;
    public int shareNumber;

    public FacebookPost() { }

    public FacebookPost(String fullName, String profileName, String postedText){
        this.fullName = fullName;
        this.profileName = profileName;
        this.postedText = postedText;
    }

    public void like(){
        this.likeNumber++;
    }

    public void dislike(){
        if (this.likeNumber == 0){
            this.likeNumber = 0;
        } else {
            this.likeNumber--;
        }
    }

    public void share(){
        this.shareNumber++;
    }

    public void print(){
        System.out.println(this.fullName + " >>> " + this.profileName + "\n"
                + this.postedText);
        System.out.println("Likes: " + this.likeNumber + " | Shares: " + this.shareNumber);
    }
}
