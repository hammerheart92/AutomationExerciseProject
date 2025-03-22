package modelObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class AddReviewOnProductModel {

    private String yourName;
    private String emailAddress;
    private String addReviewHere;

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

    public AddReviewOnProductModel(String jsonFilePath) {
        populateObject(jsonFilePath);
    }

    public void populateObject(String jsonFilePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Dynamically map all fields without specifying them manually
            objectMapper.readerForUpdating(this).readValue(new File(jsonFilePath));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to populate model from JSON file: " + jsonFilePath, e);
        }
    }
}

