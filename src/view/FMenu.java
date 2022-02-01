package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FMenu {
    private JButton adicionarEmpregadoButton;
    private JButton consultaButton;
    private JPanel panelPrincipal;

    public static void main(String[] args) {
        JFrame frame=new JFrame("Gestão de Empregados");
        frame.setContentPane(new FMenu().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public FMenu() {
        adicionarEmpregadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FEmpregado().setVisible(true);

            }
        });
        consultaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FConsulta().setVisible(true);
            }
        });
    }

}
