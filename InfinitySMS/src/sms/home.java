/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author KULLOVETH
 */
public class home implements ActionListener{
    JFrame fram;
   JPanel DashPanel,homePanel,proPanel;
    JLabel homeLabel,welcomeLabeL,DashLabel,prolabel;
    JButton addbut,viewbut,soldbut;
    JButton probut,genbut,aboutbut,logbut;
    
    public home(){
        
      
            //sold  product button
            soldbut =new JButton("Sold Item");
    soldbut.setBounds(300,250,200, 50);
     //addbut.setOpaque(true);
     soldbut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      Color soldcol= new Color(76,153,0);
   soldbut.setBackground(soldcol);
   soldbut.setForeground(Color.white);
               //view add product button
            viewbut =new JButton("View Item");
    viewbut.setBounds(500,150,200, 50);
     //addbut.setOpaque(true);
     viewbut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      Color viewcol= new Color(76,153,0);
   viewbut.setBackground(viewcol);
   viewbut.setForeground(Color.white);
        //add product button
            addbut =new JButton("Add Item");
    addbut.setBounds(100,150,200, 50);
     //addbut.setOpaque(true);
     addbut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      Color addcol= new Color(76,153,0);
   addbut.setBackground(addcol);
   addbut.setForeground(Color.white);
   
        logbut =new JButton("LOGOUT");
    logbut.setBounds(0, 450, 200, 50);
     //addbut.setOpaque(true);
     logbut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      Color logcol= new Color(76,153,0);
   logbut.setBackground(logcol);
   logbut.setForeground(Color.white);
        
   
  // about button starts here
        aboutbut =new JButton("ABOUT INFINITY SMS");
    aboutbut.setBounds(0,350,200, 50);
     //addbut.setOpaque(true);
     aboutbut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      Color abocol= new Color(76,153,0);
   aboutbut.setBackground(abocol);
   aboutbut.setForeground(Color.white);
        

//generate receipt starts here
        genbut =new JButton("GENERATE RECEIPT");
    genbut.setBounds(0, 250, 200, 50);
     //addbut.setOpaque(true);
     genbut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      Color gencol= new Color(76,153,0);
   genbut.setBackground(gencol);
   genbut.setForeground(Color.white);
        
   // product button starts here
        probut =new JButton("PRODUCT");
    probut.setBounds(0,150,200, 50);
    probut.addActionListener(this);
     //addbut.setOpaque(true);
     probut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      Color procol= new Color(76,153,0);
   probut.setBackground(procol);
   probut.setForeground(Color.white);
        
        DashLabel =new JLabel("DASHBOARD");
      DashLabel.setBounds(0, 100, 200, 30);
      DashLabel.setOpaque(true);
     DashLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      Color dashcol= new Color(76,153,0);
    DashLabel.setBackground(dashcol);
    DashLabel.setForeground(Color.white);
        
          welcomeLabeL =new JLabel("WELCOME");
      welcomeLabeL.setBounds(0, 0, 200, 30);
      welcomeLabeL.setOpaque(true);
      welcomeLabeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      Color welcol= new Color(76,153,0);
     welcomeLabeL.setBackground(welcol);
     welcomeLabeL.setForeground(Color.white);

     
      prolabel=new JLabel("PRODUCT MENU");
       
        prolabel.setBounds(0,0,800,30);
        prolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prolabel.setOpaque(true);
           Color prolcol= new Color(76,153,0);
        prolabel.setBackground(prolcol);
        prolabel.setForeground(Color.WHITE);
      
        
         //main menu label
        homeLabel=new JLabel("MAIN MENU");
       
        homeLabel.setBounds(0,0,800,30);
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setOpaque(true);
           Color homecol= new Color(76,153,0);
        homeLabel.setBackground(homecol);
        homeLabel.setForeground(Color.WHITE);
        
       //product panel with white background
        proPanel =new JPanel();
      proPanel.setBounds(201, 0, 800, 700);
      proPanel.setLayout(null);
      Color prodcol= new Color(1, 50, 67);
      proPanel.setBackground(prodcol);
      proPanel.add(prolabel);
      proPanel.add(addbut);
      proPanel.add(viewbut);
      proPanel.add(soldbut);
    proPanel.setVisible(false);
//home panel with white background
        homePanel =new JPanel();
      homePanel.setBounds(201, 0, 800, 700);
      homePanel.setLayout(null);
      Color homepcol= new Color(44,58,71);
      homePanel.setBackground(homepcol);
      homePanel.add(homeLabel);
        
      //dashboard panel with orange background  
      DashPanel =new JPanel();
      DashPanel.setLayout(null);
      DashPanel.setBounds(0, 0, 200, 700);
      Color col= new Color(255,128,0);
      DashPanel.setBackground(col);
            DashPanel.add(welcomeLabeL);
            DashPanel.add(DashLabel);
            DashPanel.add(probut);
            DashPanel.add(aboutbut);
            DashPanel.add(genbut);
            DashPanel.add(logbut);
      
     //frame 
    fram=new JFrame("INFINITY TECH WORLD STOCK MANAGEMENT SYSTEM");
    fram.setSize(1000,700);  
    fram.setLayout(null);  
    fram.setVisible(true);
    //fram.setUndecorated(true);
    fram.setLocationRelativeTo(null);
    fram.setResizable(false);
    fram.add(DashPanel);
     fram.add(homePanel);
    fram.add(proPanel);
   
    
    }
    
    
    
    
    public static void main(String[]args){
    new home();
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(probut)){
       homePanel.setVisible(false);
       proPanel.setVisible(true);
       }
    }
    
   
}
