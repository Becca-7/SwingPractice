import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Hard {
    public Hard(){prepareGUI();}
    public static void main(String[] args) {
        Hard swingControlDemo = new Hard();
    }
    public void prepareGUI(){
        JFrame mainframe2 = new JFrame("Hard");
        mainframe2.setBounds(0,0,800,800);
        mainframe2.setLayout(new BorderLayout());
        JLabel topLabel = new JLabel("Top Label", JLabel.CENTER);
        mainframe2.add (topLabel, BorderLayout.NORTH);


        JPanel middleControlPanel = new JPanel();
        middleControlPanel.setLayout(new GridLayout(2,1));
        JPanel middleTopControlPanel = new JPanel(new GridLayout(1,2));

        JPanel LeftTopControlPanel = new JPanel();
        LeftTopControlPanel.setLayout(new GridLayout(3,3));
        JLabel top01=new JLabel("Top 0", JLabel.CENTER);
        JLabel top02=new JLabel("Top 0", JLabel.CENTER);
        JLabel top03=new JLabel("Top 0", JLabel.CENTER);
        JLabel top04=new JLabel("Top 0", JLabel.CENTER);
        JLabel top05=new JLabel("Top 0", JLabel.CENTER);

        JButton top1= new JButton("Top 1");
        JButton top2= new JButton("Top 2");
        JButton top3= new JButton("Top 3");
        JButton top4= new JButton("Top 4");
        LeftTopControlPanel.add(top01);
        LeftTopControlPanel.add(top1);
        LeftTopControlPanel.add(top02);
        LeftTopControlPanel.add(top2);
        LeftTopControlPanel.add(top03);
        LeftTopControlPanel.add(top3);
        LeftTopControlPanel.add(top04);
        LeftTopControlPanel.add(top4);
        LeftTopControlPanel.add(top05);

        JPanel rightTopControlPanel = new JPanel();
        rightTopControlPanel.setLayout(new GridLayout(2,1));
        JLabel topRight=new JLabel("Top Right", JLabel.CENTER);
        JButton right1= new JButton("1");

        JPanel bottomControlPanel = new JPanel(new GridLayout(0,9));
        JLabel bottom01=new JLabel("0", JLabel.CENTER);
        JLabel bottom02=new JLabel("0", JLabel.CENTER);
        JLabel bottom03=new JLabel("0", JLabel.CENTER);
        JLabel bottom04=new JLabel("0", JLabel.CENTER);
        JLabel bottom05=new JLabel("0", JLabel.CENTER);

        JButton bottom1= new JButton("1");
        JButton bottom2= new JButton("2");
        JButton bottom3= new JButton("3");
        JButton bottom4= new JButton("4");
        bottomControlPanel.add(bottom01);
        bottomControlPanel.add(bottom1);
        bottomControlPanel.add(bottom02);
        bottomControlPanel.add(bottom2);
        bottomControlPanel.add(bottom03);
        bottomControlPanel.add(bottom3);
        bottomControlPanel.add(bottom04);
        bottomControlPanel.add(bottom4);
        bottomControlPanel.add(bottom05);
        mainframe2.add(bottomControlPanel, BorderLayout.SOUTH);

        rightTopControlPanel.add(topRight);
        rightTopControlPanel.add(right1);

        JTextArea ta = new JTextArea();

        middleTopControlPanel.add(LeftTopControlPanel);
        middleTopControlPanel.add(rightTopControlPanel);
        middleControlPanel.add(middleTopControlPanel);
        middleControlPanel.add(ta);

        mainframe2.add(middleControlPanel, BorderLayout.CENTER);
        mainframe2.setVisible(true);
    }


}
