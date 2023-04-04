/*
 * File: App.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.04
 * Github: https://github.com/MrBrown16/lapterfogat_0366.git
 * Licence: GNU GPL
 */


import control.MainControl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        MainControl mainControl = new MainControl();
        Scene scene = new Scene(mainControl.getMainView(), 400, 400 );
        stage.setTitle("Kocka térfogata");
        stage.setScene(scene);
        stage.show();
    }
}
