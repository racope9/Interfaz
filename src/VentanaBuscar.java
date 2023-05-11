import PaqG07.Puerto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBuscar {
    private JButton buscarBasesButton;
    private JTextField Prioridad;
    private JTextPane Texto;



public VentanaBuscar() {
    buscarBasesButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int prioridad = Integer.parseInt(Prioridad.getText());
            Puerto puerto = new Puerto();
            Texto.setText(puerto.BuscaContenedor(prioridad));
        }
    });
}
}
