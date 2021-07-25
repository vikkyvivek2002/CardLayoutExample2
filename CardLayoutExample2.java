import java.awt.*;  
import java.awt.event.*;
class CardLayoutExample1 extends Frame implements ActionListener
{
     public static void main(String args[])
       {
   
     CardLayout card = new CardLayout(20,20);
         setLayout(card);
         Button Btnfirst = new Button("first ");
         Button BtnSecond = new Button ("Second");
         Button BtnThird = new Button("Third");
         add(Btnfirst,"Card1");
         add(BtnSecond,"Card2");
         add(BtnThird,"Card3");
         Btnfirst.addActionListener(this);
         BtnSecond.addActionListener (this);
         BtnThird.addActionListener(this);
     
     public void actionPerformed(ActionEvent e)
     {
       card.next(this);
     }

            CardLayoutExample1 frame = new CardLayoutExample1();
            frame.setTitle("CardLayout in Java Example");
            frame.setSize(220,150);
            frame.setResizable(false);
            frame.setVisible(true);
       }
   }
