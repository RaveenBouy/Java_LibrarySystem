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
public JPanel firstPanel, secondPanel, thirdPanel, fourthPanel, backPanel;
private JButton book,member,borrowReturn,author,addBook,viewBook,borrowBook,viewBorrow,returnBook, addMember, viewMember, addAuthor, viewAuthor;

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
          fourthPanel = new JPanel();
          backPanel = new JPanel();                  
          
          //Setting Panel Size
          firstPanel.setSize(103,247);
          secondPanel.setSize(155,247);
          thirdPanel.setSize(218,247);
          fourthPanel.setSize(218,247);

          //Setting Panel Location
          firstPanel.setLocation(6,6);
          secondPanel.setLocation(125, 6);
          thirdPanel.setLocation(297,6);
          fourthPanel.setLocation(525,6);
          
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
          //thirdPanel.setBackground(Color.blue);
                  
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
           secondPanel.add(viewMember);
           backPanel.add(secondPanel);
           backPanel.revalidate();
           backPanel.repaint();      
           System.out.println("member");
       }
       else
       if(command.equals("borrowReturn"))
       {   
           secondPanel.setVisible(true);
           thirdPanel.setVisible(false);  
           borrowBook = new JButton("Borrow Book");
           viewBorrow = new JButton("View Borrowed");
           returnBook  = new JButton("Return Book");
           borrowBook.setActionCommand("borrowBook");
           viewBorrow.setActionCommand("viewBorrow");
           returnBook.setActionCommand("returnBook");
           borrowBook.addActionListener(new ButtonEventHandler());
           viewBorrow.addActionListener(new ButtonEventHandler());
           returnBook.addActionListener(new ButtonEventHandler());
           secondPanel.removeAll();
           secondPanel.revalidate();
           secondPanel.repaint();
           secondPanel.setLayout(null);
           frame.setSize(303,300);
           secondPanel.setSize(155,247);
           secondPanel.setLocation(125, 6);
           borrowBook.setBounds(0,40,155,heightx);  
           viewBorrow.setBounds(0,98,155,heightx);  
           returnBook.setBounds(0,156,155,heightx);
           secondPanel.add(borrowBook);
           secondPanel.add(viewBorrow);
           secondPanel.add(returnBook);
           backPanel.add(secondPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("borrowReturn");
       }
       else
       if(command.equals("author"))
       {
           secondPanel.setVisible(true);
           thirdPanel.setVisible(false);  
           addAuthor  = new JButton("Add Author");
           viewAuthor = new JButton("View Author");
           addAuthor.setActionCommand("addAuthor");
           viewAuthor.setActionCommand("viewAuthor");
           addAuthor.addActionListener(new ButtonEventHandler());
           viewAuthor.addActionListener(new ButtonEventHandler());
           secondPanel.removeAll();
           secondPanel.revalidate();
           secondPanel.repaint();
           frame.setSize(303,300);
           secondPanel.setLayout(null);
           secondPanel.setSize(155,247);
           secondPanel.setLocation(125, 6);
           addAuthor.setBounds(0,40,155,heightx); 
           viewAuthor.setBounds(0,98,155,heightx);
           secondPanel.add(addAuthor);
           secondPanel.add(viewAuthor);
           backPanel.add(secondPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("author");
       }
       else                            //Adding Listeners to the second Panel **All the windows for the 2nd panel**
       if(command.equals("addBook"))
       {
           new DynamicPanels().bookAdd();          
       }
       else
       if(command.equals("viewBook"))
       {
           new DynamicPanels().bookView();
       }
       else
       if(command.equals("addMember"))
       {
           new DynamicPanels().gArea();
       }
       else
       if(command.equals("viewMember"))
       {
           new DynamicPanels().gVolume();
       }
       else
       if(command.equals("borrowBook"))
       {
           new DynamicPanels().uDS();
       }
       else
       if(command.equals("viewBorrow"))
       {
           new DynamicPanels().uDS();
       }
       else
       if(command.equals("returnBook"))
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
        public void bookAdd()
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
           JLabel namel = new JLabel("Name");
           JLabel genrel = new JLabel("Genre");
           JLabel descriptionl = new JLabel("Description");
           JLabel authorl = new JLabel("Author");
           JLabel availabilityl = new JLabel("Availability");
           JButton submit = new JButton("Submit");
           
           JTextField namet = new JTextField();
           JTextField genret = new JTextField();
           JTextArea descriptiont = new JTextArea();
           JTextField authort = new JTextField();
           JTextField availabilityt = new JTextField();
                    
           namel.setBounds(20, 0, 100, 20);
           namet.setBounds(20, 20, 150, 20);
           genrel.setBounds(20, 40, 100, 20);
           genret.setBounds(20, 60, 150, 20);
           descriptionl.setBounds(20, 80, 100, 20);
           descriptiont.setBounds(20, 100, 150, 30);
           authorl.setBounds(20, 130, 100, 20);
           authort.setBounds(20, 150, 150, 20);
           availabilityl.setBounds(20, 170, 100, 20);
           availabilityt.setBounds(20, 190, 20, 20);
           submit.setBounds(50, 215, 90, 25);
           
           thirdPanel.setLayout(null);
           thirdPanel.add(namel);
           thirdPanel.add(namet);
           thirdPanel.add(genrel);
           thirdPanel.add(genret);
           thirdPanel.add(descriptionl);
           thirdPanel.add(descriptiont);
           thirdPanel.add(authorl);
           thirdPanel.add(authort);
           thirdPanel.add(availabilityl);
           thirdPanel.add(availabilityt);
           thirdPanel.add(submit);
                                
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();         
           System.out.println("addBook");
           
        }
        
        public void bookView()
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
           JList books = new JList();
           books.setBounds(0, 0, 200, 200);
           thirdPanel.setLayout(null);
           thirdPanel.add(books);
           
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("viewBook");              
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
           JLabel namel = new JLabel("Name");
           JLabel genrel = new JLabel("Genre");
           JLabel descriptionl = new JLabel("Description");
           JLabel authorl = new JLabel("Author");
           JLabel availabilityl = new JLabel("Availability");
           JButton submit = new JButton("Submit");
           
           JTextField namet = new JTextField();
           JTextField genret = new JTextField();
           JTextArea descriptiont = new JTextArea();
           JTextField authort = new JTextField();
           JTextField availabilityt = new JTextField();
                    
           namel.setBounds(20, 0, 100, 20);
           namet.setBounds(20, 20, 150, 20);
           genrel.setBounds(20, 40, 100, 20);
           genret.setBounds(20, 60, 150, 20);
           descriptionl.setBounds(20, 80, 100, 20);
           descriptiont.setBounds(20, 100, 150, 30);
           authorl.setBounds(20, 130, 100, 20);
           authort.setBounds(20, 150, 150, 20);
           availabilityl.setBounds(20, 170, 100, 20);
           availabilityt.setBounds(20, 190, 20, 20);
           submit.setBounds(50, 215, 90, 25);
           
           thirdPanel.setLayout(null);
           thirdPanel.add(namel);
           thirdPanel.add(namet);
           thirdPanel.add(genrel);
           thirdPanel.add(genret);
           thirdPanel.add(descriptionl);
           thirdPanel.add(descriptiont);
           thirdPanel.add(authorl);
           thirdPanel.add(authort);
           thirdPanel.add(availabilityl);
           thirdPanel.add(availabilityt);
           thirdPanel.add(submit);
           
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

