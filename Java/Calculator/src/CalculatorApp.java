import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {
    public static void main(String[] args) {
        new Calculator();
    }
}

class Calculator extends JFrame {
    JTextField t1;
    JButton bsum, bsub, bdiv, bmult, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, point, equal, backspace, clear;
    JLabel l1;
    JRadioButton jRadioButtonOn, jRadioButtonOff;
    ButtonGroup buttonGroup;
    int calculation;

    double num, ans;

    Calculator() {
        JPanel p = new JPanel();
        setLayout(null);
        setType(Type.UTILITY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setSize(260, 300);
        setLocation(800, 200);

        buttonGroup = new ButtonGroup();
        t1 = new JTextField();
        bsum = new JButton("+");
        bsub = new JButton("-");
        bdiv = new JButton("/");
        bmult = new JButton("*");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        point = new JButton(".");
        equal = new JButton("=");
        backspace = new JButton("<--");
        clear = new JButton("C");
        jRadioButtonOn = new JRadioButton("On");
        jRadioButtonOff = new JRadioButton("Off");
        l1 = new JLabel();

        buttonGroup.add(jRadioButtonOn);
        buttonGroup.add(jRadioButtonOff);
        add(t1);
        add(bsum);
        add(bsub);
        add(bdiv);
        add(bmult);
        add(l1);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(jRadioButtonOn);
        add(jRadioButtonOff);
        add(backspace);
        add(point);
        add(equal);
        add(clear);

        t1.setBounds(10, 30, 225, 30);
        jRadioButtonOn.setBounds(10, 70, 50, 30);
        jRadioButtonOff.setBounds(65, 70, 50, 30);
        bsum.setBounds(185, 110, 50, 30);
        bsub.setBounds(185, 145, 50, 30);
        bdiv.setBounds(185, 180, 50, 30);
        bmult.setBounds(185, 215, 50, 30);
        b0.setBounds(65, 215, 50, 30);
        b1.setBounds(10, 110, 50, 30);
        b2.setBounds(65, 110, 50, 30);
        b3.setBounds(120, 110, 50, 30);
        b4.setBounds(10, 145, 50, 30);
        b5.setBounds(65, 145, 50, 30);
        b6.setBounds(120, 145, 50, 30);
        b7.setBounds(10, 180, 50, 30);
        b8.setBounds(65, 180, 50, 30);
        b9.setBounds(120, 180, 50, 30);
        equal.setBounds(120, 215, 50, 30);
        point.setBounds(10, 215, 50, 30);
        backspace.setBounds(185, 70, 50, 30);
        clear.setBounds(120, 70, 50, 30);
        l1.setBounds(185, 2, 50, 20);


        bsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bsumActionPerformed(e);
            }
        });
        bsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bsubActionPerformed(e);
            }
        });
        bmult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bmultActionPerformed(e);
            }
        });
        bdiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bdivActionPerformed(e);
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b0ActionPerformed(e);
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1ActionPerformed(e);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b2ActionPerformed(e);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b3ActionPerformed(e);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b4ActionPerformed(e);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b5ActionPerformed(e);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b6ActionPerformed(e);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b7ActionPerformed(e);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b8ActionPerformed(e);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b9ActionPerformed(e);
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pointActionPerformed(e);
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearActionPerformed(e);
            }
        });
        bsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bsumActionPerformed(e);
            }
        });
        bsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bsubActionPerformed(e);
            }
        });
        bmult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bmultActionPerformed(e);
            }
        });
        bdiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bdivActionPerformed(e);
            }
        });
        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backspaceActionPerformed(e);
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                equalActionPerformed(e);
                t1.setText(ans+"");
            }
        });
        jRadioButtonOn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jRadioButtonOnActionPerformed(e);
            }
        });
        jRadioButtonOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jRadioButtonOffActionPerformed(e);         
            }
        });
        setVisible(true);
        disableMethod();
    }

    void b0ActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + "0");
    }

    void b1ActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + "1");
    }

    void b2ActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + "2");
    }

    void b3ActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + "3");
    }

    void b4ActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + "4");
    }

    void b5ActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + "5");
    }

    void b6ActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + "6");
    }

    void b7ActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + "7");
    }

    void b8ActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + "8");
    }

    void b9ActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + "9");
    }

    void clearActionPerformed(ActionEvent e) {
        t1.setText("");
    }

    void pointActionPerformed(ActionEvent e) {
        t1.setText(t1.getText() + ".");
    }

    void bsumActionPerformed(ActionEvent e) {
        calculation = 1;
        try {
            num = Double.parseDouble(t1.getText());
        } catch (Exception ev) {

        } finally {
            l1.setText(num + "+");
            t1.setText("");
        }

    }

    void bsubActionPerformed(ActionEvent e) {
        calculation = 2;
        try {
            num = Double.parseDouble(t1.getText());
        } catch (Exception ev) {

        } finally {
            l1.setText(num + "-");
            t1.setText("");
        }
    }

    void bmultActionPerformed(ActionEvent e) {
        calculation = 3;
        try {
            num = Double.parseDouble(t1.getText());
        } catch (Exception ev) {

        } finally {
            l1.setText(num + "*");
            t1.setText("");
        }
    }

    void bdivActionPerformed(ActionEvent e) {
        calculation = 4;
        try {
            num = Double.parseDouble(t1.getText());
        } catch (Exception ev) {

        } finally {
            l1.setText(num + "/");
            t1.setText("");
        }
    }

    void backspaceActionPerformed(ActionEvent e) {
        int length = t1.getText().length();
        int number = t1.getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(t1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            t1.setText(store);
        }
    }

    void equalActionPerformed(ActionEvent e) {
        arithmeticOperation();
        num=ans;
        l1.setText("");
    }

    void jRadioButtonOnActionPerformed(ActionEvent e) {
        enableMethod();
    }

    void jRadioButtonOffActionPerformed(ActionEvent e) {
        disableMethod();
    }

    void disableMethod() {
        t1.setText("");
        jRadioButtonOff.setEnabled(false);
        jRadioButtonOn.setEnabled(true);
        t1.setEnabled(false);
        b0.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        backspace.setEnabled(false);
        clear.setEnabled(false);
        bsub.setEnabled(false);
        bmult.setEnabled(false);
        bsum.setEnabled(false);
        bdiv.setEnabled(false);
        equal.setEnabled(false);
        point.setEnabled(false);
        num=0;
        ans=0;
    }

    private void enableMethod() {
        jRadioButtonOff.setEnabled(true);
        jRadioButtonOn.setEnabled(false);
        t1.setEnabled(true);
        b0.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        backspace.setEnabled(true);
        clear.setEnabled(true);
        bsub.setEnabled(true);
        bmult.setEnabled(true);
        bsum.setEnabled(true);
        bdiv.setEnabled(true);
        equal.setEnabled(true);
        point.setEnabled(true);
    }

    void arithmeticOperation() {
        switch (calculation) {
            case 1:
                try {
                    ans = num + Double.parseDouble(t1.getText());
                } catch (Exception ev) {

                } finally {
                    t1.setText(Double.toString(ans));
                    break;
                }
            case 2:
                try {
                    ans = num - Double.parseDouble(t1.getText());
                } catch (Exception ev) {

                } finally {
                    t1.setText(Double.toString(ans));
                    break;
                }
            case 3:
                try {
                    ans = num * Double.parseDouble(t1.getText());
                } catch (Exception ev) {

                } finally {
                    t1.setText(Double.toString(ans));
                    break;
                }
            case 4:
                try {
                    ans = num / Double.parseDouble(t1.getText());
                } catch (Exception ev) {

                } finally {
                    t1.setText(Double.toString(ans));
                    break;
                }
        }
    }
}
