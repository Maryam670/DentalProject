
package dental.clinic;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class test extends javax.swing.JFrame {
    
    JLabel l1;
    Thread t1;
    JProgressBar br;
   

    
       public test() {
           
           
           
        initComponents();
       
        
       l1=new JLabel(new ImageIcon("C:\\Users\\mshah\\Desktop\\myimg1.png"));
      l1.setSize(482,369);
        add(l1);
        setLayout(null);
       br=new JProgressBar(0,100);  
       br.setBounds(100,300,280,30);   
       br.setValue(0);    
       br.setStringPainted(true);    
       
       add(br);   
       t1=new Thread(rr);
        t1.start();
       
      
               
        setVisible(true);
  
    }
       Runnable rr=()->{
           
           try{
               while(true)
               {
                   
                   String[] imgs = {"C:\\Users\\mshah\\Desktop\\myimg2.png",
                                       "C:\\Users\\mshah\\Desktop\\myimg3.png",
                                       "C:\\Users\\mshah\\Desktop\\myimg4.png",
                                       "C:\\Users\\mshah\\Desktop\\myimg2.png"
                                    };
                   for (int i = 0; i <= 100; i++) {
                    Thread.sleep(80);
                br.setValue(i);
                    if(i!=0 && i%25==0){
                        int imgNo = (i/25)-1;

                        if(imgNo<=3){
                            l1.setIcon(new ImageIcon(imgs[imgNo+1]));
                        }
                    }
                }
                   
//                   t1.sleep(2000);
//                   l1.setIcon(new ImageIcon("C:\\Users\\mshah\\Desktop\\d11.png"));
//                   
//                   
//                   t1.sleep(2000);
//                   l1.setIcon(new ImageIcon("C:\\Users\\mshah\\Desktop\\d22.png"));
//                   t1.sleep(2000);
//                   l1.setIcon(new ImageIcon("C:\\Users\\mshah\\Desktop\\pls.png"));
               }
           }
           catch(Exception ex)
           {
               ex.getMessage();
               
           }
           new login().setVisible(true);
                this.dispose();
              
       };

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        test t11=new test();
        t11.setVisible(true);
                for(int i=0; i<=100; i++)
                    {
                        t11.br.setValue(i);
                        
                        
                    }    
              
                        
                    
               
          
       
            
        }
        
        
               
            
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

