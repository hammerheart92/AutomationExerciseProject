package modelObject;

public class LoginToYourAccountModel extends BaseModel {

    private String emailAddress;
    private String password;

    public LoginToYourAccountModel(String jsonFilePath) {
        super(jsonFilePath);
    }

    // Getters and Setters
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
