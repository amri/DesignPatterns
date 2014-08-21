package Chapter8TemplateExamples;

import javax.swing.*;
import java.awt.*;

/**
 * Created by amri on 16/8/14.
 */
public class MyFrame extends JFrame {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("New JFrame");

    }

    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);

    }



    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String message = "Test JFrame";

        graphics.drawString(message, 100, 100);
    }
}
