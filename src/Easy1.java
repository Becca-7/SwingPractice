import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Easy1 {
    private JFrame mainframe;
    private JPanel controlPanel;
    private JLabel statusLabel;
    private TextArea ta;
    private JButton button;
    //define wanted components


    public Easy1(){prepareGUI();}
    //constructor

    public static void main(String[] args) {
        Easy1 swingControlDemo = new Easy1();
    }
    //starts constructor and runs code

    public void prepareGUI(){
    mainframe = new JFrame("Easy 1");
    //creating a new object for the JFrame class, creating the mainframe
    mainframe.setBounds(0,0,800,800);
    //set the size of the mainframe I think
    mainframe.setLayout(new BorderLayout());
    //setting the type of frame


    JButton button1 = new JButton("button 1");
    mainframe.add(button1, BorderLayout.NORTH);

    JPanel middleControlPanel = new JPanel();
    middleControlPanel.setLayout(new GridLayout(2,3));
    JButton button2 = new JButton("button 2");
    JLabel label1 = new JLabel("label 1",JLabel.CENTER);
    JButton button4 = new JButton("button 4");
    JLabel label2 = new JLabel("label 2",JLabel.CENTER);
    JButton button5 = new JButton("button 5");
    middleControlPanel.add(button2);
    middleControlPanel.add(label1);
    middleControlPanel.add(button4);
    middleControlPanel.add(label2);
    middleControlPanel.add(button5);
    mainframe.add(middleControlPanel, BorderLayout.CENTER);


        JButton button3 = new JButton("button 3");
        mainframe.add(button3, BorderLayout.SOUTH);

//

        mainframe.setVisible(true);
        //makes the mainframe show up
    }
//notes to work off of:
//        JPanel controlPanel = new JPanel();
//     controlPanel.setLayout(new BorderLayout());
//     //making a control panel
//
//     JButton button = new JButton("Start Already");
//     controlPanel.add(button, BorderLayout.WEST);
//     //putting the button on the control panel
////mainframe is the entire thing and it can have control panels in each little box
//        JLabel statusLabel = new JLabel("Taking Too Long");
//        controlPanel.add(statusLabel, BorderLayout.SOUTH);
//        mainframe.add(controlPanel);
//                //adding to the mainframe goes left to right top to bottom



}
