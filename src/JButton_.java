import javax.swing.*;
import java.awt.*;

public class JButton_ {
    public static void main(String[] args){
        ButtonFrame bf = new ButtonFrame();
        bf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        bf.setSize(250,100);
        bf.setVisible(true);
    }
}

class ButtonFrame extends JFrame {
    private final JTextField tf;
    private final JCheckBox boldText;
    private final JCheckBox itaText;

    public ButtonFrame(){
        super("JCheckBox Display");
        setLayout(new FlowLayout());

        tf = new JTextField("Font Style Changes", 20);
        tf.setEditable(false);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        this.add(tf);

        boldText = new JCheckBox("Bold");
        this.add(boldText);
        boldText.addActionListener( click -> {
            if(boldText.isSelected()){
                tf.setFont(new Font("Serif", Font.BOLD, 14));
            }else{
                tf.setFont(new Font("Serif", Font.PLAIN, 14));
            }
        });

        itaText = new JCheckBox("Italic");
        this.add(itaText);
        itaText.addActionListener( click -> {
            if(itaText.isSelected()){
                tf.setFont(new Font("Serif", Font.ITALIC, 14));
            }else{
                tf.setFont(new Font("Serif", Font.PLAIN, 14));
            }

        });


    }
}
