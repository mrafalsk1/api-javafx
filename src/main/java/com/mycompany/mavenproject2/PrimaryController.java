package com.mycompany.mavenproject2;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
public class PrimaryController {

    @FXML
    private ImageView image;;
    @FXML
    private void getImage() throws IOException {
        URL url = new URL("https://pic.re/image");
        
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        InputStream responseStream = connection.getInputStream();
        Image newImage = new Image(responseStream);
        System.out.println(image);
        image.setImage(newImage);
    }
}
