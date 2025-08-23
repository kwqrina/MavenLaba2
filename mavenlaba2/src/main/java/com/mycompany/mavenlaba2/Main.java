/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenlaba2;

import controller.ArmyController;
import javax.swing.SwingUtilities;

/**
 *
 * @author ekate
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArmyController controller = new ArmyController();
            controller.launchApplication();
        });
    }
}
