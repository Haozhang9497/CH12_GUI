import javax.swing.*;
import java.awt.*;

public class LayoutManager_FlowLayout {
    public static void main(String[] args){
        LayoutFrame lf = new LayoutFrame();
        lf.setSize(400, 400);
        lf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        lf.setVisible(true);

    }
}

class LayoutFrame extends JFrame{
    private final JButton leftbt;
    private final JButton centerbt;
    private final JButton rightbt;

    public LayoutFrame(){
        super("FlowLayout Display");
        this.setLayout(new FlowLayout());

        leftbt = new JButton("Left");
        this.add(leftbt);
        leftbt.addActionListener( click -> {
            this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
            // need to revalidate/repaint to make the layout change effective!!!
            this.getContentPane().revalidate();
            this.getContentPane().repaint();
        });

        centerbt = new JButton("Center");
        this.add(centerbt);
        centerbt.addActionListener( click -> {
            this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
            // need to revalidate/repaint to make the layout change effective!!!
            this.getContentPane().revalidate();
            this.getContentPane().repaint();
        });

        rightbt = new JButton("Right");
        this.add(rightbt);
        rightbt.addActionListener( click -> {
            this.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT));
            // need to revalidate/repaint to make the layout change effective!!!
            this.getContentPane().revalidate();
            this.getContentPane().repaint();
        });

    }
}
