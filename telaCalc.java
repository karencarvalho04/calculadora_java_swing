import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaCalc extends JFrame {
    private JTextField txtSaida;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn0;
    private JButton btnVirgula;
    private JButton btnLimpar;
    private JButton btnResultado;
    private JButton btnSomar;
    private JButton btnSubtrair;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JPanel pnlTelaCalc;
    private JButton btnSqrt;
    private JButton btnPorcentagem;

    double valor1;
    double valor2;
    String operador;

    public telaCalc() {

        addListeners();
        initComponents();

    }

    private void initComponents() {

        JPanel telaCalc = new JPanel();
        setSize(500, 350);
        setContentPane(pnlTelaCalc);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setVisible(true);
    }

    private void addListeners() {

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "9");
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "0");
            }
        });
        btnVirgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + ".");

            }
        });
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "+";
            }
        });
        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "-";
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "*";
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "/";
            }
        });
        btnSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "sqrt";
                double sqrt = Math.sqrt(valor1);
                txtSaida.setText(String.valueOf(sqrt));
            }
        });
        btnPorcentagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "%";
            }
        });
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor2 = Double.parseDouble(txtSaida.getText());
                if (operador == "+") {
                    txtSaida.setText(String.valueOf(valor1 + valor2));
                } else if (operador == "-") {
                    txtSaida.setText(String.valueOf(valor1 - valor2));
                } else if (operador == "*") {
                    txtSaida.setText(String.valueOf(valor1 * valor2));
                } else if (operador == "/") {
                    txtSaida.setText(String.valueOf(valor1 / valor2));
                } else if (operador == "%") {
                    txtSaida.setText(String.valueOf(valor1 * (valor2 / 100)));
                }
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText("");
                operador = "";
            }
        });
    }

    public static void main(String[] args) {
        telaCalc calculadora = new telaCalc();

    }


        }


