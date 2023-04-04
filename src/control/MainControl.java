/*
 * File: MainControl.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.03
 * Github: https://github.com/MrBrown16/javafx-template
 * Licence: GNU GPL
 */


package control;

import javafx.scene.control.Button;
import model.MainModel;
import view.MainView;

public class MainControl {
    MainView mainView;
    MainModel mainModel;

    public MainControl() {
        mainView = new MainView();
        handleEvent();
        mainModel = new MainModel();    
    }
    private void handleEvent(){
        Button calcButton = this.mainView.getSubButton().getCalcButton();
        calcButton.setOnAction(e->{
            System.out.println("BU!");
            String inputdStr = this.mainView.getInputd().getValue();
            double inputd = Double.parseDouble(inputdStr);
            Double volume = mainModel.calcCubeVolume(inputd);
            this.mainView.getVolumeP().setValue(volume.toString());
        });
    }

    public MainView getMainView() {
        return mainView;
    }
    
}
