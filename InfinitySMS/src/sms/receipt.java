/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author KULLOVETH
 */
public class receipt extends JFrame{
    JPanel receiptPanel;
    JLabel receiptLabel,locaLabel,townLabel;
    
    
   public receipt(){
       
       townLabel=new JLabel("Awka Anambra State");
  townLabel.setBounds(170,40,150,30);
 townLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       //receiptLabel.setOpaque(true);
   townLabel.setForeground(Color.BLACK);
    
    locaLabel=new JLabel("87 Ziks Avenue,Opposite Dike Park");
  locaLabel.setBounds(150,20,200,30);
   locaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       //receiptLabel.setOpaque(true);
    locaLabel.setForeground(Color.BLACK);
       
       
       receiptLabel=new JLabel("INFINITY TECH WORLD");
      receiptLabel.setBounds(170,0,150,30);
        receiptLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       //receiptLabel.setOpaque(true);
        Color receiptcol= new Color(76,153,0);
       receiptLabel.setBackground(receiptcol);
       receiptLabel.setForeground(Color.BLACK);
       
       //initialize panel
       receiptPanel =new JPanel();
      receiptPanel.setBounds(0, 0, 500, 500);
     receiptPanel.setLayout(null);
      Color receipcol= new Color(255,255,255);
      receiptPanel.setBackground(receipcol);
      receiptPanel.add(receiptLabel);
      receiptPanel.add(locaLabel);
      receiptPanel.add(townLabel);
      
      //initialize frame
    new JFrame("INFINITY TECH WORLD RECEIPT");
    setSize(500,500);  
   setLayout(null);  
   setVisible(true);
  setLocationRelativeTo(null);
  setResizable(false);
       add(receiptPanel);
   } 
   
   public static void main(String[]args){
       new receipt();
   }
}
