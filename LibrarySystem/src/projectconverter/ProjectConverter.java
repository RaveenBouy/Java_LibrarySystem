/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author RavianXReaver
 */
public class ProjectConverter extends JFrame 
{
public JFrame frame;
public JPanel firstPanel, secondPanel, thirdPanel, backPanel;
private JButton calculateBtn, algebraBtn, geometryBtn, unitConBtn, engBtn, 
                algebraAverageBtn, algebraDTFBtn,
                engineeringOLBtn, engineeringSDTBtn, geometryAreaBtn, geometryVolumeBtn, 
                UCDigitalStorageBtn, UCTemperatureBtn, testB;

public JSeparator s1, s2;
final int heightx =40;

    public  ProjectConverter()
    {     
          //Initializing the frame
          frame = new JFrame();
          //frame.setLayout(null);
          frame.setSize(124,300);
          //frame.setSize(537,300);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          //Creating Panel Objects
          firstPanel = new JPanel();
          secondPanel = new JPanel();
          thirdPanel = new JPanel();
          backPanel = new JPanel();                  
          
          //Setting Panel Size
          firstPanel.setSize(103,247);
          secondPanel.setSize(155,247);
          thirdPanel.setSize(218,247);

          //Setting Panel Location
          firstPanel.setLocation(6,6);
          secondPanel.setLocation(125, 6);
          thirdPanel.setLocation(297,6);
          
          //Setting panel layout to null so then the buttons can be localized
          firstPanel.setLayout(null);
          GroupLayout layout = new GroupLayout(backPanel);
          backPanel.setLayout(layout);
          backPanel.add(firstPanel);
          
          //Creating Button Objects
          calculateBtn = new JButton("Calculator");
          algebraBtn = new JButton("Algebra");
          geometryBtn = new JButton("Geometry");
          unitConBtn = new JButton("Unit Converter");
          engBtn = new JButton("Engineering");     
          
          //Adding ActionCommands to buttons
          calculateBtn.setActionCommand("calculate");
          algebraBtn.setActionCommand("algebra");
          geometryBtn.setActionCommand("geometry");
          unitConBtn.setActionCommand("unitConverter");
          engBtn.setActionCommand("engineering");
          
          //Adding ActionListeners to buttons
          calculateBtn.addActionListener(new ButtonEventHandler());
          algebraBtn.addActionListener(new ButtonEventHandler());
          geometryBtn.addActionListener(new ButtonEventHandler());
          unitConBtn.addActionListener(new ButtonEventHandler());
          engBtn.addActionListener(new ButtonEventHandler());
                    
          //Add colors to panels ---Test
          //secondPanel.setBackground(Color.green);
          thirdPanel.setBackground(Color.blue);
                  
          //adding buttons to firstPanel
          firstPanel.add(calculateBtn);         
          firstPanel.add(algebraBtn);
          firstPanel.add(geometryBtn);
          firstPanel.add(unitConBtn);
          firstPanel.add(engBtn);
                  
          //setting location & size to buttons       
          calculateBtn.setBounds(0, 8, 103,heightx );
          algebraBtn.setBounds(0, 56, 103,heightx );
          geometryBtn.setBounds(0, 104, 103, heightx);
          unitConBtn.setBounds(0, 152, 103,heightx );
          engBtn.setBounds(0, 200, 103,heightx );
          
    
          frame.add(backPanel);
          frame.revalidate();
          frame.repaint();
          frame.setVisible(true);         
    }
    
    public static void main(String[] args) 
    {
        new ProjectConverter();   
    }
    
    private class ButtonEventHandler implements ActionListener
    {   
    public void actionPerformed(ActionEvent e)
    {
       String command = e.getActionCommand();
       //secondPanel.setBackground(Color.green);
       //thirdPanel.setBackground(Color.blue);
       if(command.equals("calculate"))
       {   
           secondPanel.setVisible(false);
           thirdPanel.setVisible(true);
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           thirdPanel.setLayout(null);
           frame.setSize(370,300);
           thirdPanel.setSize(218,247);
           thirdPanel.setLocation(125, 6);
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("calc"); 
        }
       else
       if(command.equals("algebra"))
       {   
           secondPanel.setVisible(true);
           thirdPanel.setVisible(false);          
           algebraAverageBtn = new JButton("Average");
           algebraDTFBtn     = new JButton("Decimal to Fration");
           algebraAverageBtn.setActionCommand("aAverage");
           algebraDTFBtn.setActionCommand("aDTF");
           algebraAverageBtn.addActionListener(new ButtonEventHandler());
           algebraDTFBtn.addActionListener(new ButtonEventHandler());
           secondPanel.removeAll();
           secondPanel.revalidate();
           secondPanel.repaint();
           secondPanel.setLayout(null);
           frame.setSize(303,300); 
           secondPanel.setSize(155,247);
           secondPanel.setLocation(125, 6);
           algebraAverageBtn.setBounds(0,40,155,heightx);  
           algebraDTFBtn.setBounds(0,98,155,heightx); 
           secondPanel.add(algebraAverageBtn);
           secondPanel.add(algebraDTFBtn);
           backPanel.add(secondPanel);
           backPanel.revalidate();
           backPanel.repaint();           
           System.out.println("algb");
       }
       else
       if(command.equals("geometry"))
       {
           secondPanel.setVisible(true);
           thirdPanel.setVisible(false);  
           geometryAreaBtn   = new JButton("Area");
           geometryVolumeBtn = new JButton("Volume");
           geometryAreaBtn.setActionCommand("gArea");
           geometryVolumeBtn.setActionCommand("gVolume");
           geometryAreaBtn.addActionListener(new ButtonEventHandler());
           geometryVolumeBtn.addActionListener(new ButtonEventHandler());
           secondPanel.removeAll();
           secondPanel.revalidate();
           secondPanel.repaint();
           secondPanel.setLayout(null);
           frame.setSize(303,300); 
           secondPanel.setSize(155,247);
           secondPanel.setLocation(125, 6);
           geometryAreaBtn.setBounds(0,40,155,heightx);  
           geometryVolumeBtn.setBounds(0,98,155,heightx); 
           secondPanel.add(geometryAreaBtn);
           secondPanel.add(geometryVolumeBtn);
           backPanel.add(secondPanel);
           backPanel.revalidate();
           backPanel.repaint();      
           System.out.println("geo");
       }
       else
       if(command.equals("unitConverter"))
       {   
           secondPanel.setVisible(true);
           thirdPanel.setVisible(false);  
           UCDigitalStorageBtn = new JButton("Digital Storage");
           UCTemperatureBtn    = new JButton("Temperature");
           UCDigitalStorageBtn.setActionCommand("uDS");
           UCTemperatureBtn.setActionCommand("uTemperature");
           UCDigitalStorageBtn.addActionListener(new ButtonEventHandler());
           UCTemperatureBtn.addActionListener(new ButtonEventHandler());
           secondPanel.removeAll();
           secondPanel.revalidate();
           secondPanel.repaint();
           secondPanel.setLayout(null);
           frame.setSize(303,300);
           secondPanel.setSize(155,247);
           secondPanel.setLocation(125, 6);
           UCDigitalStorageBtn.setBounds(0,40,155,heightx);  
           UCTemperatureBtn.setBounds(0,98,155,heightx);
           secondPanel.add(UCDigitalStorageBtn);
           secondPanel.add(UCTemperatureBtn);
           backPanel.add(secondPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("unit");
       }
       else
       if(command.equals("engineering"))
       {
           secondPanel.setVisible(true);
           thirdPanel.setVisible(false);  
           engineeringOLBtn  = new JButton("Ohm's Law");
           engineeringSDTBtn = new JButton("Speed/Distance/Time");
           engineeringOLBtn.setActionCommand("eOL");
           engineeringSDTBtn.setActionCommand("eSDT");
           engineeringOLBtn.addActionListener(new ButtonEventHandler());
           engineeringSDTBtn.addActionListener(new ButtonEventHandler());
           secondPanel.removeAll();
           secondPanel.revalidate();
           secondPanel.repaint();
           frame.setSize(303,300);
           secondPanel.setLayout(null);
           secondPanel.setSize(155,247);
           secondPanel.setLocation(125, 6);
           engineeringOLBtn.setBounds(0,40,155,heightx); 
           engineeringSDTBtn.setBounds(0,98,155,heightx);
           secondPanel.add(engineeringOLBtn);
           secondPanel.add(engineeringSDTBtn);
           backPanel.add(secondPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("eng");
       }
       else                            //Adding Listeners to the second Panel **All the windows for the 2nd panel**
       if(command.equals("aAverage"))
       {
           new DynamicPanels().aAverage();          
       }
       else
       if(command.equals("aDTF"))
       {
           new DynamicPanels().aDTF();
       }
       else
       if(command.equals("gArea"))
       {
           new DynamicPanels().gArea();
       }
       else
       if(command.equals("gVolume"))
       {
           new DynamicPanels().gVolume();
       }
       else
       if(command.equals("uDS"))
       {
           new DynamicPanels().uDS();
       }
       else
       if(command.equals("uTemperature"))
       {
           new DynamicPanels().uTemperature();
       }
       else
       if(command.equals("eOL"))
       {
           new DynamicPanels().eOL();
       }
       else
       if(command.equals("eSDT"))
       {
           new DynamicPanels().eSDT();
       }
    }
}
    private class DynamicPanels //Class which defines the content for the 3rd Panel.
    {
        public void aAverage()
        {     
           //Preparing the 3rd Panel            
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);  
           frame.setSize(550,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           testB = new JButton("WATTTTTTTT");
           thirdPanel.setLayout(null);
           thirdPanel.add(testB);
           testB.setBounds(0,98,185,heightx);                      
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();         
           System.out.println("aAverage");
        }
        
        public void aDTF()
        {
           //Preparing the 3rd Panel 
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(550,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("aDTF");              
        }
        
        public void gArea()
        {
           //preparing the 3rd Panel
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(550,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("gArea");             
        }
        
        public void gVolume()
        {
           //preparing the 3rd Panel
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(550,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("gVolume");            
        }
        
        public void uDS()
        {
           //preparing the 3rd Panel
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(550,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("uDS");             
        }
        
        public void uTemperature()
        {
           //preparing the 3rd Panel
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(550,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("uTemp");           
        }
        
        public void eOL()
        {
           //preparing the 3rd Panel 
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(550,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("eOL");             
        }
        
        public void eSDT()
        {
           //preparing the 3rd Panel 
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(550,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("eSPD");          
        }
    }
}

