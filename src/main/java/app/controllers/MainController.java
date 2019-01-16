package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    @FXML
    private WebView webView;

    @Value("${minecraft.url}")
    private String url;

    @FXML
    private void initialize(){
        webView.getEngine().load(url);
    }
}
