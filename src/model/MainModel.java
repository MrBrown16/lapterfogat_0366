// behind the scenes calculations database handling....

/*
 * File: MainModel.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.04
 * Github: 
 * Licence: GNU GPL
 */

package model;

public class MainModel {

    public MainModel() {
    }

    public Double calcCubeVolume(double inputd){
        Double volume = (Math.pow(inputd, 3))/(Math.sqrt(8));
        return volume;
    }
}
