package kata5;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MoneyCalculatorFrame extends JFrame{

    public MoneyCalculatorFrame() {
        setTitle("MoneyCalculator");
        setMinimumSize(new Dimension(300, 300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createComponents();
        setVisible(true);
    }

    private void createComponents() {
        add(createExchangeDialog());
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private Component createExchangeDialog() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());
        return panel;
    }

    private Component createToolbar() {
        JPanel panel = new JPanel (new FlowLayout(FlowLayout.RIGHT));
        panel.add(createCalculateButton());
        panel.add(createCancelButton());
        return panel;
    }

    private JButton createCalculateButton() {
        JButton calculate = new JButton("calculate");
        return calculate;
    }

    private JButton createCancelButton() {
        
    }
    
}
