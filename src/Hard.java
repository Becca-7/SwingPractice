import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Hard {
    private JFrame mainframe2;
    private JPanel controlPanel;
    private JLabel statusLabel;
    private TextArea ta;
    private JButton button;


    public Hard(){prepareGUI();}

    public static void main(String[] args) {
        Hard swingControlDemo = new Hard();
    }

    public void prepareGUI(){
        mainframe2 = new JFrame("Hard");
        mainframe2.setBounds(0,0,800,800);
        mainframe2.setLayout(new BorderLayout());
        JLabel topLabel = new JLabel("Top Label", JLabel.CENTER);
        mainframe2.add (topLabel, BorderLayout.NORTH);


        JPanel middleControlPanel = new JPanel();
        middleControlPanel.setLayout(new GridLayout(2,2));

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

        /*JPanel bottomControlPanel = new JPanel(new GridLayout(0,9));
        JLabel bottom01=new JLabel("Top 0", JLabel.CENTER);
//        JLabel 02=new JLabel("Top 0", JLabel.CENTER);
//        JLabel top03=new JLabel("Top 0", JLabel.CENTER);
//        JLabel top04=new JLabel("Top 0", JLabel.CENTER);
//        JLabel top05=new JLabel("Top 0", JLabel.CENTER);
//
//        JButton top1= new JButton("Top 1");
//        JButton top2= new JButton("Top 2");
//        JButton top3= new JButton("Top 3");
//        JButton top4= new JButton("Top 4");
        bottomControlPanel.add(top01);
        bottomControlPanel.add(top1);
        bottomControlPanel.add(top02);
        bottomControlPanel.add(top2);
        bottomControlPanel.add(top03);
        bottomControlPanel.add(top3);
        bottomControlPanel.add(top04);
        bottomControlPanel.add(top4);
        bottomControlPanel.add(top05);

*/

        rightTopControlPanel.add(topRight);
        rightTopControlPanel.add(right1);



        middleControlPanel.add(LeftTopControlPanel);
        middleControlPanel.add(rightTopControlPanel);
        JLabel emptyLabel1 = new JLabel("");
        middleControlPanel.add(emptyLabel1);
        JLabel emptyLabel2 = new JLabel("");
        middleControlPanel.add(emptyLabel2);

        mainframe2.add(middleControlPanel, BorderLayout.CENTER);
        mainframe2.setVisible(true);
        //makes the mainframe show up
    }


}
