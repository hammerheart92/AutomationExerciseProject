package modelObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class BaseModel {

    public BaseModel(String jsonFilePath) {
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
