import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame implements ActionListener
{
    private ImageIcon icon;
    private Container c;
    private JLabel text;
    private JTextField textField;
    private Font customFont1, customFont2;
    private JButton clear, back, mod, div, one, two, three, add, four, five, six, sub, seven, eight, nine, mul, equal, zero, dot, sqat;
    private double a=0;
    private double b=0;
    private int ans=0;
    private double result;
    Main()
    {
        frameStructure();
        titleInsideFrame();
        addingTextField();
        addingButtons();
    }
    public void frameStructure()
    {
        //Frame
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        icon= new ImageIcon(getClass().getResource("Ico.png"));
        this.setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(800,200, 400,500);
        setTitle("Swing Calculator");
        setResizable(false);
    }

    public void titleInsideFrame()
    {
        text= new JLabel();
        text.setText("Swing Calculator");
        text.setBounds(280, 0, 100, 50);
        text.setForeground(Color.white);
        add(text);
    }

    public void addingTextField()
    {
        textField=new JTextField();
        customFont1=new Font("Digital-7", Font.ROMAN_BASELINE, 50);
        textField.setFont(customFont1);
        textField.setBounds(20,50,345,80);
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setFocusable(false);
        add(textField);
    }

    public void addingButtons()
    {
        customFont2= new Font("Unispace", Font.ROMAN_BASELINE, 20);
        back=new JButton("DC");
        back.setBounds(290, 330, 75, 50);
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.setFont(customFont2);
        back.setFocusable(false);
        add(back);
        back.addActionListener(this);

        clear=new JButton("AC");
        clear.setBounds(290, 390, 75, 50);
        clear.setBackground(Color.RED);
        clear.setForeground(Color.WHITE);
        clear.setFont(customFont2);
        clear.setFocusable(false);
        add(clear);
        clear.addActionListener(this);

        mod=new JButton("%");
        mod.setBounds(290, 210, 75, 50);
        mod.setBackground(Color.WHITE);
        mod.setForeground(Color.BLACK);
        mod.setFont(customFont2);
        mod.setFocusable(false);
        add(mod);
        mod.addActionListener(this);

        div=new JButton("÷");
        div.setBounds(290, 150, 75, 50 );
        div.setBackground(Color.LIGHT_GRAY);
        div.setForeground(Color.BLACK);
        div.setFont(customFont2);
        div.setFocusable(false);
        add(div);
        div.addActionListener(this);

        seven=new JButton("7");
        seven.setBounds(20, 210, 75, 50);
        seven.setBackground(Color.WHITE);
        seven.setForeground(Color.BLACK);
        seven.setFont(customFont2);
        seven.setFocusable(false);
        add(seven);
        seven.addActionListener(this);

        eight=new JButton("8");
        eight.setBounds(110, 210, 75, 50);
        eight.setBackground(Color.WHITE);
        eight.setForeground(Color.BLACK);
        eight.setFont(customFont2);
        eight.setFocusable(false);
        add(eight);
        eight.addActionListener(this);

        nine=new JButton("9");
        nine.setBounds(200, 210, 75, 50);
        nine.setBackground(Color.WHITE);
        nine.setForeground(Color.BLACK);
        nine.setFont(customFont2);
        nine.setFocusable(false);
        add(nine);
        nine.addActionListener(this);

        mul=new JButton("×");
        mul.setBounds(200, 150, 75, 50 );
        mul.setBackground(Color.LIGHT_GRAY);
        mul.setForeground(Color.BLACK);
        mul.setFont(customFont2);
        mul.setFocusable(false);
        add(mul);
        mul.addActionListener(this);

        four=new JButton("4");
        four.setBounds(20, 270, 75, 50);
        four.setBackground(Color.WHITE);
        four.setForeground(Color.BLACK);
        four.setFont(customFont2);
        four.setFocusable(false);
        add(four);
        four.addActionListener(this);

        five=new JButton("5");
        five.setBounds(110, 270, 75, 50);
        five.setBackground(Color.WHITE);
        five.setForeground(Color.BLACK);
        five.setFont(customFont2);
        five.setFocusable(false);
        add(five);
        five.addActionListener(this);

        six=new JButton("6");
        six.setBounds(200, 270, 75, 50);
        six.setBackground(Color.WHITE);
        six.setForeground(Color.BLACK);
        six.setFont(customFont2);
        six.setFocusable(false);
        add(six);
        six.addActionListener(this);

        sub=new JButton("-");
        sub.setBounds(110, 150, 75, 50 );
        sub.setBackground(Color.LIGHT_GRAY);
        sub.setForeground(Color.BLACK);
        sub.setFont(customFont2);
        sub.setFocusable(false);
        add(sub);
        sub.addActionListener(this);

        one=new JButton("1");
        one.setBounds(20, 330, 75, 50);
        one.setBackground(Color.WHITE);
        one.setForeground(Color.BLACK);
        one.setFont(customFont2);
        one.setFocusable(false);
        add(one);
        one.addActionListener(this);

        two=new JButton("2");
        two.setBounds(110, 330, 75, 50);
        two.setBackground(Color.WHITE);
        two.setForeground(Color.BLACK);
        two.setFont(customFont2);
        two.setFocusable(false);
        add(two);
        two.addActionListener(this);

        three=new JButton("3");
        three.setBounds(200, 330, 75, 50);
        three.setBackground(Color.WHITE);
        three.setForeground(Color.BLACK);
        three.setFont(customFont2);
        three.setFocusable(false);
        add(three);
        three.addActionListener(this);

        add=new JButton("+");
        add.setBounds(20, 150, 75, 50 );
        add.setBackground(Color.LIGHT_GRAY);
        add.setForeground(Color.BLACK);
        add.setFont(customFont2);
        add.setFocusable(false);
        add(add);
        add.addActionListener(this);

        equal=new JButton("=");
        equal.setBounds(20, 390, 75, 50);
        equal.setBackground(Color.WHITE);
        equal.setForeground(Color.BLACK);
        equal.setFont(customFont2);
        equal.setFocusable(false);
        add(equal);
        equal.addActionListener(this);

        zero=new JButton("0");
        zero.setBounds(110, 390, 75, 50);
        zero.setBackground(Color.WHITE);
        zero.setForeground(Color.BLACK);
        zero.setFont(customFont2);
        zero.setFocusable(false);
        add(zero);
        zero.addActionListener(this);

        dot=new JButton(".");
        dot.setBounds(200, 390, 75, 50);
        dot.setBackground(Color.WHITE);
        dot.setForeground(Color.BLACK);
        dot.setFont(customFont2);
        dot.setFocusable(false);
        add(dot);
        dot.addActionListener(this);

        sqat=new JButton("√");
        sqat.setBounds(290, 270, 75, 50 );
        sqat.setBackground(Color.WHITE);
        sqat.setForeground(Color.BLACK);
        sqat.setFont(customFont2);
        sqat.setFocusable(false);
        add(sqat);
        sqat.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        Object source= e.getSource();
        try
        {
            if (source == clear)
            {
                textField.setText("");
            }
            else if (source == back)
            {
                int length = textField.getText().length();
                int number = length - 1;
                if (length > 0)
                {
                    StringBuilder del = new StringBuilder(textField.getText());
                    del.deleteCharAt(number);
                    textField.setText(del.toString());
                }
            }
            else if (source == zero)
            {
                if (textField.getText().equals("0"))
                {
                    return;
                } else
                {
                    textField.setText(textField.getText() + "0");
                }
            }
            else if (source == one)
            {
                textField.setText(textField.getText() + "1");
            }
            else if (source == two)
            {
                textField.setText(textField.getText() + "2");
            }
            else if (source == three)
            {
                textField.setText(textField.getText() + "3");
            }
            else if (source == four)
            {
                textField.setText(textField.getText() + "4");
            }
            else if (source == five)
            {
                textField.setText(textField.getText() + "5");
            }
            else if (source == six)
            {
                textField.setText(textField.getText() + "6");
            }
            else if (source == seven)
            {
                textField.setText(textField.getText() + "7");
            }
            else if (source == eight)
            {
                textField.setText(textField.getText() + "8");
            }
            else if (source == nine)
            {
                textField.setText(textField.getText() + "9");
            }
            else if (source == dot)
            {
                if (textField.getText().contains("."))
                {
                    return;
                }
                else
                {
                    textField.setText(textField.getText() + ".");
                }
            }
            else if (source == add)
            {
                a = Double.parseDouble(textField.getText());
                ans = 1;
                textField.setText("");
            }
            else if (source == sub)
            {
                a = Double.parseDouble(textField.getText());
                ans = 2;
                textField.setText("");
            }
            else if (source == mul)
            {
                a = Double.parseDouble(textField.getText());
                ans = 3;
                textField.setText("");
            }
            else if (source == div)
            {
                a = Double.parseDouble(textField.getText());
                ans = 4;
                textField.setText("");
            }
            else if (source == mod)
            {
                a = Double.parseDouble(textField.getText());
                ans = 5;
                textField.setText("");
            }
            else if (source == sqat)
            {
                a = Double.parseDouble(textField.getText());
                double sqt = Math.sqrt(a);
                String ss = String.format("%.12f", sqt);
                if (ss.endsWith(".0"))
                {
                    textField.setText(ss.replace(".0", ""));
                }
                else
                {
                    textField.setText(ss);
                }
            }
            else if (source == equal)
            {
                b = Double.parseDouble(textField.getText());
                switch (ans)
                {
                    case 1:
                        result = a + b;
                        break;
                    case 2:
                        result = a - b;
                        break;
                    case 3:
                        result = a * b;
                        break;
                    case 4:
                        if (b == 0)
                        {
                            throw new ArithmeticException("Can't Divide by Zero");
                        }
                        else
                        {
                            result = a / b;
                            break;
                        }
                    case 5:
                        result = a % b;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator");
                }
                if (Double.toString(result).endsWith(".0"))
                {
                    textField.setText(Double.toString(result).replace(".0", ""));
                }
                else
                {
                    textField.setText(String.format("%.11f", result));
                }
            }
        }
        catch(ArithmeticException ae)
        {
            JOptionPane.showMessageDialog(this, "Can't Divide by Zero", "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(IllegalArgumentException iae)
        {
            JOptionPane.showMessageDialog(this, "Invalid operator", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args)
    {
        Main Frame=new Main();
        Frame.setVisible(true);
    }
}