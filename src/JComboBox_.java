import javax.swing.*;
import java.awt.*;

public class JComboBox_ {
    public static void main(String [] args){
        JComboBoxFrame tf = new JComboBoxFrame();
        tf.setSize(400, 400);
        tf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tf.setVisible(true);
    }
}

class JComboBoxFrame extends JFrame {
    private final JTextField tf;
    private final JComboBox<String> jcb; // a generic class

    public JComboBoxFrame(){
        super("JComboBox Display");
        this.setLayout(new FlowLayout());

        tf = new JTextField("Your favorite season:");
        tf.setEditable(false);
        this.add(tf);

        String[] seasons = {"Spring", "Summer", "Autumn", "Winter"};
        jcb = new JComboBox<>(seasons);
        jcb.setMaximumRowCount(3); // maximum displayed items
        this.add(jcb);
        jcb.addActionListener( select -> {
            String selected = seasons[jcb.getSelectedIndex()];
            tf.setText(selected);
        });

    }

}
