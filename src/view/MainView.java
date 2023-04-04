//view settings panels boxes added text set and added to view 

/*
 * File: MainView.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.04
 * Github: https://github.com/MrBrown16/lapterfogat_0366.git
 * Licence: GNU GPL
 */


package view;

import com.github.mrbrown16.inputlib.ButtonPanel;
import com.github.mrbrown16.inputlib.InputPanel;
import com.github.mrbrown16.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainView extends VBox{
    TitlePanel title;
    TitlePanel data;
    InputPanel inputd;
    ButtonPanel subButton;
    InputPanel volumeP;

    public MainView() {
        this.title = new TitlePanel();
        this.data = new TitlePanel();
        this.inputd = new InputPanel();
        this.subButton = new ButtonPanel();
        this.volumeP = new InputPanel();

        setMainView();
        addMainView();       
    }

    private void setMainView(){
        title.setText("Kocka térfogata lapátló alapján");
        data.setText("Móra Barna Szoft_I-1_N 2023.04.04");
        inputd.setText("A kocka Lapátlója: ");
        subButton.setText("Számít");
        volumeP.setText("A kocka térfogata: ");
    }
    private void addMainView(){
        this.getChildren().add(title);
        this.getChildren().add(data);
        this.getChildren().add(inputd);
        this.getChildren().add(subButton);
        this.getChildren().add(volumeP);
    }
    public TitlePanel getTitle() {
        return title;
    }

    public TitlePanel getData() {
        return data;
    }

    public InputPanel getInputd() {
        return inputd;
    }

    public ButtonPanel getSubButton() {
        return subButton;
    }

    public InputPanel getVolumeP() {
        return volumeP;
    }
}
