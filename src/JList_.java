import javax.swing.*;
import java.awt.*;

public class JList_ {
    public static void main(String[] args){
        JListFrame jf = new JListFrame();
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(400, 400);
        jf.setVisible(true);
    }
}

class JListFrame extends JFrame {
    private final JList<String> jl;

    public JListFrame(){
        super("JList Display");
        this.setLayout(new FlowLayout());
        String[] options = {"BLACK", "RED", "YELLOW", "WHITE", "GREEN", "BLUE"};
        Color[] colors = {Color.BLACK, Color.RED, Color.YELLOW, Color.WHITE, Color.GREEN, Color.BLUE};

        jl = new JList<>(options);
        jl.setVisibleRowCount(3); // at most 3 options can be visible at the same time
        jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // only single selection
        //JList itself does not provide scrollbar visibility
        this.add(new JScrollPane(jl));

        //JFrame has three panes: background pane, content pane, glass pane
        //the background pane is totally covered by content pane
        //must change the color of the content pane
        jl.addListSelectionListener( change -> {
            this.getContentPane().setBackground(colors[jl.getSelectedIndex()]);
        });
    }

}
