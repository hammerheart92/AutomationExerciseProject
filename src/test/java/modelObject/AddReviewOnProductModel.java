package modelObject;

public class AddReviewOnProductModel extends BaseModel {

    private String yourName;
    private String emailAddress;
    private String addReviewHere;

    public AddReviewOnProductModel(String jsonFilePath) {
        super(jsonFilePath);
    }

    // Getters and Setters

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddReviewHere() {
        return addReviewHere;
    }

    public void setAddReviewHere(String addReviewHere) {
        this.addReviewHere = addReviewHere;
    }
}

