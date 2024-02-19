import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class JRadioButton_ {
    public static void main(String[] args){
        RadioButtonFrame rf = new RadioButtonFrame();
        rf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        rf.setSize(300, 300);
        rf.setVisible(true);

    }
}

class RadioButtonFrame extends JFrame {
    private final JTextField tf;
    private final Font plainFt;
    private final Font boldFt;
    private final Font italicFt;
    private final Font boldItalicFt;
    private final JRadioButton plain;
    private final JRadioButton bold;
    private final JRadioButton italic;
    private final JRadioButton boldItalic;
    private final ButtonGroup radiosg; // must put all buttons in one group!!!

    public RadioButtonFrame(){
        super("RadioButton Display");
        this.setLayout(new FlowLayout());

        tf = new JTextField("Font Style Changes", 25);
        this.add(tf);

        plainFt = new Font("Serif", Font.PLAIN, 14);
        boldFt = new Font("Serif", Font.BOLD, 14);
        italicFt = new Font("Serif", Font.ITALIC, 14);
        boldItalicFt = new Font("Serif", Font.BOLD | Font.ITALIC, 14);

        plain = new JRadioButton("plain", true);
        this.add(plain);
        plain.addActionListener( click -> {
                tf.setFont(plainFt);
        });

        bold = new JRadioButton("bold", false);
        this.add(bold);
        bold.addActionListener( click -> {
            tf.setFont(boldFt);
        });

        italic = new JRadioButton("italic", false);
        this.add(italic);
        italic.addActionListener( click -> {
            tf.setFont(italicFt);
        });

        boldItalic = new JRadioButton("bold+ita", false);
        this.add(boldItalic);
        boldItalic.addActionListener( click -> {
            tf.setFont(boldItalicFt);
        });

        radiosg = new ButtonGroup();
        radiosg.add(plain);
        radiosg.add(bold);
        radiosg.add(italic);
        radiosg.add(boldItalic);



    }


}
