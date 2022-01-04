package AntiElite.com;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String[] responses = {"No,You're awesome!","Thank you!","*blush*"};

        JOptionPane.showOptionDialog(
                null,
                "You are awesome!",
                "Secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                responses,
                0);



    }
}
