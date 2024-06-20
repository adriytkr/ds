import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Calculator{
  public JLabel display=new JLabel("");
  public String operand1accumulator="";
  public String operand2accumulator="";
  public boolean operationFlag=false;
  public enum OPERATION{ADDITION,SUBTRACTION,MULTIPLICATION,DIVISION};
  public OPERATION currentOperator=null;
  public JFrame frame=new JFrame();
  public JButton additionButton=new JButton("Addition");
  public JButton subtractionButton=new JButton("Subtraction");
  public JButton multiplicationButton=new JButton("Multiplication");
  public JButton divisionButton=new JButton("Division");
  public JButton submitButton=new JButton("Submit");
  public JPanel controllerPanel=new JPanel();
  public JPanel resultPanel=new JPanel();
  public JPanel numbersPanel=new JPanel();
  public JButton button1=new JButton("1");
  public JButton button2=new JButton("2");
  public JButton button3=new JButton("3");
  public JButton button4=new JButton("4");
  public JButton button5=new JButton("5");
  public JButton button6=new JButton("6");
  public JButton button7=new JButton("7");
  public JButton button8=new JButton("8");
  public JButton button9=new JButton("9");
  public JButton button0=new JButton("0");

  public void run(){
    frame.setSize(500,500);
    frame.setVisible(true);
  
    frame.getContentPane().add(BorderLayout.EAST,controllerPanel);
    controllerPanel.setLayout(new BoxLayout(controllerPanel, BoxLayout.Y_AXIS));
    controllerPanel.setBackground(Color.darkGray);
    controllerPanel.add(additionButton);
    controllerPanel.add(subtractionButton);
    controllerPanel.add(multiplicationButton);
    controllerPanel.add(divisionButton);
    controllerPanel.add(submitButton);
  
    frame.getContentPane().add(BorderLayout.CENTER,resultPanel);
    resultPanel.setBackground(Color.WHITE);
    resultPanel.setBorder(new EmptyBorder(10,10,10,10));
    resultPanel.add(display);
    display.setFont(new Font("Fira Code",Font.PLAIN,24));

    frame.getContentPane().add(BorderLayout.SOUTH,numbersPanel);

    numbersPanel.add(button1);
    numbersPanel.add(button2);
    numbersPanel.add(button3);
    numbersPanel.add(button4);
    numbersPanel.add(button5);
    numbersPanel.add(button6);
    numbersPanel.add(button7);
    numbersPanel.add(button8);
    numbersPanel.add(button9);
    numbersPanel.add(button0);

    button1.addActionListener(new NumberHandler('1'));
    button2.addActionListener(new NumberHandler('2'));
    button3.addActionListener(new NumberHandler('3'));
    button4.addActionListener(new NumberHandler('4'));
    button5.addActionListener(new NumberHandler('5'));
    button6.addActionListener(new NumberHandler('6'));
    button7.addActionListener(new NumberHandler('7'));
    button8.addActionListener(new NumberHandler('8'));
    button9.addActionListener(new NumberHandler('9'));
    button0.addActionListener(new NumberHandler('0'));

    additionButton.addActionListener(new OperationHandler(OPERATION.ADDITION, '+'));
    subtractionButton.addActionListener(new OperationHandler(OPERATION.SUBTRACTION, '-'));
    multiplicationButton.addActionListener(new OperationHandler(OPERATION.MULTIPLICATION, '*'));
    divisionButton.addActionListener(new OperationHandler(OPERATION.DIVISION, '/'));

    submitButton.addActionListener((new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        int operand1=Integer.valueOf(operand1accumulator);
        int operand2=Integer.valueOf(operand2accumulator);
        int result=0;

        switch(currentOperator){
          case OPERATION.ADDITION:
            result=operand1+operand2;
            break;
          case OPERATION.SUBTRACTION:
            result=operand1-operand2;
            break;
          case OPERATION.MULTIPLICATION:
            result=operand1*operand2;
            break;
          case OPERATION.DIVISION:
            result=operand1/operand2;
            break;
        }

        display.setText(Integer.toString(result));
        operand1accumulator=Integer.toString(result);
        operand2accumulator="";
      }
    }));
  }

  public class NumberHandler implements ActionListener{
    public char number;

    public NumberHandler(char number){
      this.number=number;
    }

    @Override
    public void actionPerformed(ActionEvent e){
      if(operationFlag) operand2accumulator+=this.number;
      else operand1accumulator+=this.number;
      display.setText(display.getText()+this.number);
    }
  }

  public class OperationHandler implements ActionListener{
    public OPERATION operation;
    public char symbol;

    public OperationHandler(OPERATION operation,char symbol){
      this.operation=operation;
      this.symbol=symbol;
    }

    @Override
    public void actionPerformed(ActionEvent e){
      operationFlag=true;
      currentOperator=this.operation;
      display.setText(display.getText()+this.symbol);
    }
  }
}
