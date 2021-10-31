package ru.mirea.task9;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

  class Mouse extends JFrame{
    JPanel[] pnl=new JPanel[3];
    JButton button1=new JButton("46 school");
    JButton button2=new JButton("64 school");
    JLabel lbl1 = new JLabel("Result: 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: DRAW");
    int sch46=0, sch64=0;
      public Mouse(){
        setSize(500,500);
        setLayout(new GridLayout(1,3));
        for(int i = 0 ; i < pnl.length ; i++)
        {
          pnl[i] = new JPanel();
          add(pnl[i]);
        }

        pnl[0].setLayout(new BorderLayout());
        pnl[0].add(button1, BorderLayout.CENTER);

        pnl[2].setLayout(new BorderLayout());
        pnl[2].add(button2, BorderLayout.CENTER);

        pnl[1].setLayout(new FlowLayout());
        pnl[1].add(lbl1);
        pnl[1].add(lbl2);
        pnl[1].add(lbl3);


        button1.addMouseListener(new MouseListener()
        {
          public void mouseExited(MouseEvent a){}
          public void mouseClicked(MouseEvent a)
          {
            sch46++;
            lbl1.setText("Result: " + sch46 + " X " + sch64);
            lbl2.setText("Last Scorer: school46");
            if (sch46> sch64)
              lbl3.setText("Winner: school46");
            else if (sch64 > sch46)
              lbl3.setText("Winner: school64");
            else
              lbl3.setText("Winner: DRAW");
          }
          public void mouseEntered(MouseEvent a) {}
          public void mouseReleased(MouseEvent a) {}
          public void mousePressed(MouseEvent a) {}
        });

        button2.addMouseListener(new MouseListener()
        {
          public void mouseExited(MouseEvent a){}
          public void mouseClicked(MouseEvent a)
          {
            sch64++;
            lbl1.setText("Result: " + sch64+ " X " + sch46);
            lbl2.setText("Last Scorer: school64");
            if (sch64 > sch46)
              lbl3.setText("Winner: school64");
            else if (sch46 > sch64)
              lbl3.setText("Winner: school46");
            else
              lbl3.setText("Winner: DRAW");
          }
          public void mouseEntered(MouseEvent a) {}
          public void mouseReleased(MouseEvent a) {}
          public void mousePressed(MouseEvent a) {}
        });
      }

    public static void main(String[]args)
    {
      new Mouse().setVisible(true);
    }

      }


