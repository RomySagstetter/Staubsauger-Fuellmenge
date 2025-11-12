package Tests;

import Anzeige.Anzeige;

import javax.swing.SwingUtilities;

public class Main1 {

    public static void main(String[] args) {
        // GUI-Start auf Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            Anzeige anzeige = Anzeige.getInstance();
            anzeige.showAnzeige();
        });
    }
}


