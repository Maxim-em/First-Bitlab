package Project_Java.Module2_Lab8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MainFrame extends JFrame {
    public MainFrame(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Client");

        JLabel iplabel = new JLabel("IP: ");
        iplabel.setSize(50, 30);
        iplabel.setLocation(150, 100);
        add(iplabel);

        JLabel portlabel = new JLabel("PORT: ");
        portlabel.setSize(50, 30);
        portlabel.setLocation(150, 140);
        add(portlabel);

        JTextField ipfield = new JTextField();
        ipfield.setSize(100, 30);
        ipfield.setLocation(190, 100);
        add(ipfield);

        JTextField portfield = new JTextField();
        portfield.setSize(100, 30);
        portfield.setLocation(190, 140);
        add(portfield);

        JButton connect = new JButton("CONNECT");
        connect.setSize(200,30);
        connect.setLocation(170, 180);
        connect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextArea message = new JTextArea();
                message.setSize(250, 250);
                message.setLocation(200, 250);
                add(message);


                JButton send = new JButton("SEND");
                send.setSize(200, 30);
                send.setLocation(130, 510);
                send.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try{
                            Socket socket = new Socket(ipfield.getText(), (Integer.parseInt(portfield.getText())));
                            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                            outputStream.writeObject(message.getText());
                            message.setText("");
                        }catch(Exception exception){
                            exception.printStackTrace();
                        }
                    }
                });
                add(send);
            }
        });
        add(connect);
    }
}
