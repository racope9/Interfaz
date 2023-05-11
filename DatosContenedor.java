package PaqG07;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DatosContenedor extends JFrame{
    private JList list1;
    protected JPanel panel1;
    private JTextPane datitos;

    public DatosContenedor(String s, int w, int h){

        setContentPane(panel1);
        setTitle("Datos del contenedor");

        setSize(w, h);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);

        datitos.setText(s);

    }



}
