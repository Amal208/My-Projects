/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.IntelliJTheme;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import com.formdev.flatlaf.util.LoggingFacade;

/**
 *
 * @author Nisansala Probodani
 */
public class splash {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
            LookAndFeel laf = new FlatDarkLaf();
            UIManager.setLookAndFeel(laf);
//            IntelliJTheme.setup(splash.class.getResourceAsStream("src//resources//Night Owl Contrast.theme.json"));
            homepage hp = new homepage();
            hp.setVisible(true);
        } catch (Exception e) {
        }
    }
}
