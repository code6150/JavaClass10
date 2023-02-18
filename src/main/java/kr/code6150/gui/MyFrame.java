package kr.code6150.gui;

import javax.swing.*;
import java.util.jar.JarEntry;

public class MyFrame extends JFrame {
    public MyFrame(String title, int width, int height) {
        // 첫 줄에 무조건 부모 객체 생성자
        super(title);
        //JFrame frame = new JFrame("제목")
        // frame.setSize(500, 500);

        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JTextField text = new JTextField(25);

        add(panel);
        panel.add(text);

    }

}
