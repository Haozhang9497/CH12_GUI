import javax.swing.*;
import java.awt.*;

public class LayoutManager_Grid_Border {
    public static void main(String[] args){
        PanelFrame pf = new PanelFrame();
        pf.setSize(500, 500);
        pf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pf.setVisible(true);
    }
}

class PanelFrame extends JFrame {
    private final JPanel pn;
    private final JButton[] bts = new JButton[5];

    public PanelFrame(){
        super("JPanel with Buttons Display");
        // BorderLayout split the container into five parts
        // NORTH, SOUTH, WEST, EAST, CENTER
        // set the layout for the frame as BorderLayout
        this.setLayout(new BorderLayout());

        // set the layout for the panel as GridLayout
        // in the constructor specify:
        // row#, col#, gap btw cols, gap btw rows
        pn = new JPanel(new GridLayout(1, bts.length, 9, 3));

        for(int i = 0; i < bts.length; i++){
            bts[i] = new JButton("Button" + (i + 1));
            pn.add(bts[i]);
        }

        // add panel into the sounth part of the frame
        // CENTER PART can squeeze other parts if there is nothing in other parts
        // other parts cannot squeeze CENTER even if CENTER is empty
        this.add(pn, BorderLayout.SOUTH);;


    }
}
