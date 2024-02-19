import javax.swing.*;
import java.awt.*;

public class JLabel_ {
    public static void main(String[] args){
        JFrame jf = new JFrame("JLabels Display");
        jf.setLayout(new FlowLayout());
        // FlowLayout() is a layout manager
        // order the component from left to right
        //and change the position when resize the window


        JLabel lb1 = new JLabel("This is a JLabel text");
        //will display tip info when mouse hovering on the label
        lb1.setToolTipText("lb1");

        Icon ic = new ImageIcon("C:\\Users\\zhang\\IdeaProjects\\Ch12_GUI\\src\\check_icon.png");
        JLabel lb2 = new JLabel("A picture label",
                ic, SwingConstants.LEFT);
        lb2.setToolTipText("lb2");
        lb2.setBackground(Color.YELLOW);
        lb2.setHorizontalTextPosition(SwingConstants.RIGHT);
        lb2.setVerticalTextPosition(SwingConstants.BOTTOM);

        jf.add(lb1);
        jf.add(lb2);

        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.show();
    }
}
