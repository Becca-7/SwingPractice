import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Medium2 {
    private JFrame mainframe2;
    private JPanel controlPanel;
    private JLabel statusLabel;
    private TextArea ta;
    private JButton button;


    public Medium2(){prepareGUI();}

    public static void main(String[] args) {
        Medium2 swingControlDemo = new Medium2();
    }
    //starts constructor and runs code

    public void prepareGUI(){
        mainframe2 = new JFrame("Medium 2");
        mainframe2.setBounds(0,0,800,800);
        mainframe2.setLayout(new GridLayout(3,3));

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");
        JButton button6 = new JButton("button 6");
        JButton button7 = new JButton("button 7");
        JButton button8 = new JButton("button 8");

        JPanel middleControlPanel = new JPanel();
        middleControlPanel.setLayout(new BorderLayout());
        JLabel label = new JLabel("label", JLabel.CENTER);
        JButton button9 = new JButton("button 9");
        JButton button10 = new JButton("button 10");
        middleControlPanel.add(label, BorderLayout.CENTER);
        middleControlPanel.add(button9, BorderLayout.EAST);
        middleControlPanel.add(button10, BorderLayout.SOUTH);

        mainframe2.add(button1);
        mainframe2.add(button2);
        mainframe2.add(button3);
        mainframe2.add(button4);
        mainframe2.add(middleControlPanel);
        mainframe2.add(button5);
        mainframe2.add(button6);
        mainframe2.add(button7);
        mainframe2.add(button8);

        mainframe2.setVisible(true);
        //makes the mainframe show up
    }


}
