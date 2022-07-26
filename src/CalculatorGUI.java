import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {

    private  double total1 = 0.0;
    private  double total2 = 0.0;
    private char math_operator;
    private JPanel CalculatorGUI;
    private JTextField textField1;
    private JButton BtnEquals;
    private JButton BtnDivide;
    private JButton BtnEight;
    private JButton BtnNine;
    private JButton BtnFive;
    private JButton BtnTwo;
    private JButton BtnDot;
    private JButton BtnPlus;
    private JButton BtnSix;
    private JButton BtnThree;
    private JButton BtnClear;
    private JButton BtnMinus;
    private JButton BtnMultiply;
    private JButton BtnSeven;
    private JButton BtnFour;
    private JButton BtnOne;
    private JButton BtnZero;

    private void getOperator (String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    public CalculatorGUI() {
        BtnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() +BtnOne.getText();
                textField1.setText(btnOneText);
            }});
        BtnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField1.getText() +BtnTwo.getText();
                textField1.setText(btnTwoText);
            }});
        BtnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textField1.getText() +BtnThree.getText();
                textField1.setText(btnThreeText);
            }});
        BtnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textField1.getText() +BtnFour.getText();
                textField1.setText(btnFourText);
            }});
        BtnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textField1.getText() +BtnFive.getText();
                textField1.setText(btnFiveText);
            }});
        BtnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField1.getText() +BtnSix.getText();
                textField1.setText(btnSixText);
            }});
        BtnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField1.getText() +BtnSeven.getText();
                textField1.setText(btnSevenText);
            }});
        BtnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField1.getText() +BtnEight.getText();
                textField1.setText(btnEightText);
            }});
        BtnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField1.getText() +BtnNine.getText();
                textField1.setText(btnNineText);
            }});
        BtnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textField1.getText() + BtnZero.getText();
                textField1.setText(btnZeroText);
            }});
        BtnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")) {
                    textField1.setText("0.");
                }
                else if (textField1.getText().contains(".")){
                    BtnDot.setEnabled(false);
                }
                else { String btnDotText = textField1.getText() + BtnDot.getText();
                    textField1.setText(btnDotText);
                }
                BtnDot.setEnabled(true);

            }});
        BtnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textField1.setText("");
            }});
        BtnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textField1.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textField1.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textField1.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textField1.getText());
                        break;
                }
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }});
        BtnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnPlus.getText();
                getOperator(button_text);
            }});
        BtnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnMinus.getText();
                getOperator(button_text);
            }});
        BtnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnMultiply.getText();
                getOperator(button_text);
            }});
        BtnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnDivide.getText();
                getOperator(button_text);
            }});
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUI");
        frame.setContentPane(new CalculatorGUI().CalculatorGUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
