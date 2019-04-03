import javax.swing.*;

public class CalcJFrame extends JFrame {

    public CalcJFrame() {

        setBounds(100, 100, 265, 400);
        setTitle("MaxCalc");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new CalcJPanel());
        setVisible(true);
    }
}
