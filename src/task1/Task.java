package task1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task extends JFrame {

    JPanel pnl = new JPanel();
    private int i=0, j=0;
    private String team = "123";

    public Task(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        //Action action = new SimpleAction();
        JLabel lab1 = new JLabel();
        lab1.setText("Result: " + i + " + " + j);
        JLabel lab2 = new JLabel();
        lab2.setText("Last Scorer: " + team);
        JLabel lab3 = new JLabel();
        lab3.setText("Winner: " + team);

        JButton button1 = new JButton();
        button1.setName("button1");
        button1.setText("AC Milan");
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                i++;
                lab1.setText("Result: " + i + " + " + j);
                lab2.setText("Last Scorer: AC Milan");
                if (i>j){
                    lab3.setText("Winner: AC Milan");
                }
                if (i<j){
                    lab3.setText("Winner: Real Madrid");
                }
                if (i==j){
                    lab3.setText("Winner: DRAW");
                }
                //System.out.println("Нажатие на кнопку <" + button1.getName() + ">" + i);
            }
        });

        JButton button2 = new JButton();
        button2.setName("button2");
        button2.setText("Real Madrid");
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                j++;
                lab1.setText("Result: " + i + " + " + j);
                lab2.setText("Last Scorer: Real Madrid");
                if (i>j){
                    lab3.setText("Winner: AC Milan");
                }
                if (i<j){
                    lab3.setText("Winner: Real Madrid");
                }
                if (i==j){
                    lab3.setText("Winner: DRAW");
                }
                //System.out.println("Нажатие на кнопку <" + button2.getName() + ">" + j);

            }
        });

        container.add(button1,BorderLayout.WEST);
        container.add(button2, BorderLayout.EAST);
        container.add(lab1, BorderLayout.CENTER, JLabel.CENTER);
        container.add(lab2, BorderLayout.NORTH, JLabel.CENTER);
        container.add(lab3, BorderLayout.SOUTH, JLabel.CENTER);
        setSize(320, 100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Task().setVisible(true);
    }
}
