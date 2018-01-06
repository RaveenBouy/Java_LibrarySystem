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
private JButton book,member,borrowReturn,author,addBook,viewBook, addMember, viewMember, addAuthor, viewAuthor;

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
          //calculateBtn = new JButton("Calculator");
          book = new JButton("Books");
          member = new JButton("Members");
          borrowReturn = new JButton("Borrow/Return");
          author = new JButton("Authors");     
          
          //Adding ActionCommands to buttons
          //calculateBtn.setActionCommand("calculate");
          book.setActionCommand("book");
          member.setActionCommand("member");
          borrowReturn.setActionCommand("borrowReturn");
          author.setActionCommand("author");
          
          //Adding ActionListeners to buttons
          //calculateBtn.addActionListener(new ButtonEventHandler());
          book.addActionListener(new ButtonEventHandler());
          member.addActionListener(new ButtonEventHandler());
          borrowReturn.addActionListener(new ButtonEventHandler());
          author.addActionListener(new ButtonEventHandler());
                    
          //Add colors to panels ---Test
          //secondPanel.setBackground(Color.green);
          thirdPanel.setBackground(Color.blue);
                  
          //adding buttons to firstPanel
          firstPanel.add(book);         
          firstPanel.add(member);
          firstPanel.add(borrowReturn);
          firstPanel.add(author);
                  
          //setting location & size to buttons       
          book.setBounds(0, 8, 103,heightx );
          member.setBounds(0, 56, 103,heightx );
          borrowReturn.setBounds(0, 104, 103, heightx);
          author.setBounds(0, 152, 103,heightx );
          
    
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
       if(command.equals("book"))
       {   
           secondPanel.setVisible(true);
           thirdPanel.setVisible(false);          
           addBook = new JButton("Add Book");
           viewBook = new JButton("View Book");
           addBook.setActionCommand("addBook");
           viewBook.setActionCommand("viewBook");
           addBook.addActionListener(new ButtonEventHandler());
           viewBook.addActionListener(new ButtonEventHandler());
           secondPanel.removeAll();
           secondPanel.revalidate();
           secondPanel.repaint();
           secondPanel.setLayout(null);
           frame.setSize(303,300); 
           secondPanel.setSize(155,247);
           secondPanel.setLocation(125, 6);
           addBook.setBounds(0,40,155,heightx);  
           viewBook.setBounds(0,98,155,heightx); 
           secondPanel.add(addBook);
           secondPanel.add(viewBook);
           backPanel.add(secondPanel);
           backPanel.revalidate();
           backPanel.repaint();           
           System.out.println("Books");
       }
       else
       if(command.equals("member"))
       {
           secondPanel.setVisible(true);
           thirdPanel.setVisible(false);  
           addMember   = new JButton("Add Member");
           viewMember = new JButton("View Member");
           addMember.setActionCommand("addMember");
           viewMember.setActionCommand("viewMember");
           addMember.addActionListener(new ButtonEventHandler());
           viewMember.addActionListener(new ButtonEventHandler());
           secondPanel.removeAll();
           secondPanel.revalidate();
           secondPanel.repaint();
           secondPanel.setLayout(null);
           frame.setSize(303,300); 
           secondPanel.setSize(155,247);
           secondPanel.setLocation(125, 6);
           addMember.setBounds(0,40,155,heightx);  
           viewMember.setBounds(0,98,155,heightx); 
           secondPanel.add(addMember);
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

