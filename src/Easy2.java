import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Easy2 {
    private JFrame mainframe2;
    private JPanel controlPanel;
    private JLabel statusLabel;
    private TextArea ta;
    private JButton button;


    public Easy2(){prepareGUI();}

    public static void main(String[] args) {
        Easy2 swingControlDemo = new Easy2();
    }
    //starts constructor and runs code

    public void prepareGUI(){
        mainframe2 = new JFrame("Easy 2");
        mainframe2.setBounds(0,0,800,800);
        mainframe2.setLayout(new BorderLayout());

        JButton button1 = new JButton("button 1");
        mainframe2.add(button1, BorderLayout.NORTH);


        JPanel middleControlPanel = new JPanel();
        middleControlPanel.setLayout(new BorderLayout());
        JButton button2 = new JButton("button 2");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");
        middleControlPanel.add(button2, BorderLayout.EAST);
        middleControlPanel.add(button4, BorderLayout.WEST);
        middleControlPanel.add(button5, BorderLayout.CENTER);
        mainframe2.add(middleControlPanel, BorderLayout.CENTER);


        JButton button3 = new JButton("button 3");
        mainframe2.add(button3, BorderLayout.SOUTH);

//

        mainframe2.setVisible(true);
        //makes the mainframe show up
    }


}
