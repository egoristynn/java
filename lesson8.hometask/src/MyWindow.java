import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lesson8.Hometask");
        setBounds(300, 300, 400, 400);

        JButton [] buttons = new JButton[3];
        setLayout(new FlowLayout());
        for (int i = 0; i < buttons.length; i++)
        {

            buttons[i] = new JButton("Кнопка " + i);
            add(buttons[i]);
        }

        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Кнопка 0 нажата");
            }
        });

        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Кнопка 1 нажата");
            }
        });

        buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Кнопка 2 нажата");
            }
        });


        setVisible(true);
    }
}
