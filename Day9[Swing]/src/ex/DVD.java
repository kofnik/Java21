package ex;

import javax.swing.*;

public class DVD extends JFrame {
    JButton[] controls = new JButton[5];

    public DVD() {
        super("DVD");
        setSize(500, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controls[0] = new JButton("Play");
        controls[1] = new JButton("Stop/Eject");
        controls[2] = new JButton("Rewind");
        controls[3] = new JButton("Fast-Forward");
        controls[4] = new JButton("Pause");
        JPanel panel = new JPanel();
        ButtonGroup group = new ButtonGroup();
        for (JButton team : controls) {
            group.add(team);
            panel.add(team);
        }
        add(panel);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] arguments) {
        DVD.setLookAndFeel();
        DVD ff = new DVD();
    }
}