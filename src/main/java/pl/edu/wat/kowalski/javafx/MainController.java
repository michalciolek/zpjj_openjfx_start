package pl.edu.wat.kowalski.javafx;

import javafx.scene.control.Label;

public class MainController {
    public Label helloLabel;

    public void initialize() {
        helloLabel.setText("Hello from Java");
    }
}
