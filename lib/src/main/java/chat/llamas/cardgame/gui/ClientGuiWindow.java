package chat.llamas.cardgame.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ClientGuiWindow {
    public static void main(String[] s) {
        JFrame frame = new JFrame("War Cards");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JFrame By Example");
        JButton button = new JButton();
        button.setText("Button");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class ClientPanel extends JPanel {

    public ClientPanel() {
        super(new BorderLayout());

        Border blackline = BorderFactory.createTitledBorder("Title");

        setBorder(blackline);
    }
}
class CardsInGamePanel extends JPanel {
    private JLabel filterByPlayerLabel;

    private JLabel filterByLocationLabel;

    private JLabel filterInHandLabel;
    public CardsInGamePanel() {
        super(new BorderLayout());

        Border blackline = BorderFactory.createTitledBorder("Cards In Play");

        setBorder(blackline);
    }
}