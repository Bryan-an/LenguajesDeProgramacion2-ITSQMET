/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.parkinglot;

import java.util.HashMap;

/**
 *
 * @author bryan
 */
public class ParkingLot {

    //Fields
    private HashMap<Integer, String> positions = new HashMap<Integer, String>();

    public void ParkingLot() {
        for (int i = 1; i <= 10; i++) {
            positions.put(i, null);
        }
    }

}
