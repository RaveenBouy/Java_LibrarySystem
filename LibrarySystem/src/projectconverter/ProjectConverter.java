/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
          book = new JButton("Books");
          member = new JButton("Members");
          borrowReturn = new JButton("Borrow/Return");
          author = new JButton("Authors");     
          
          //Adding ActionCommands to buttons
          book.setActionCommand("book");
          member.setActionCommand("member");
          borrowReturn.setActionCommand("borrowReturn");
          author.setActionCommand("author");
          
          //Adding ActionListeners to buttons
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
    @Override
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
           try {
               new DynamicPanels().bookView();
           } catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       if(command.equals("addMember"))
       {
           new DynamicPanels().memberAdd();
       }
       else
       if(command.equals("viewMember"))
       {
           try {
               new DynamicPanels().memberView();
           } catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       if(command.equals("borrowBook"))
       {
           new DynamicPanels().borrowBook();
       }
       else
       if(command.equals("viewBorrow"))
       {
           try {
               new DynamicPanels().viewBorrowBook();
           } catch (SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       if(command.equals("returnBook"))
       {
           new DynamicPanels().returnBook();
       }
       else
       if(command.equals("addAuthor"))
       {
           new DynamicPanels().addAuthor();
       }
       else
       if(command.equals("viewAuthor"))
       {
           try {
               new DynamicPanels().viewAuthor();
           } catch (SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
}
    private class DynamicPanels extends JFrame//Class which defines the content for the 3rd Panel.
    {       
        JButton submitb,sortb,searchb;
        JTextField namet,genret,authort,availabilityt,searcht;//Book
        JTextField titlema,namema,nationalityma,cityma,countryma,contactma; //member, author
        JTextArea descriptiont;
        JComboBox titleMa;
        JList list;
        DefaultListModel lm;
        String selectedValue = new String();       
        JLabel ansnamel,ansgenrel,ansavailabilityl,ansauthorl,ansanamel,ansanationalityl;         
        JTextField returnedAfter;
        String returnedAuthName;
        
        public void bookAdd()
        {     
           //Preparing the 3rd Panel            
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);  
           frame.setSize(520,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           JLabel namel = new JLabel("Name");
           JLabel genrel = new JLabel("Genre");
           JLabel descriptionl = new JLabel("Description");
           JLabel authorl = new JLabel("Author");
           JLabel availabilityl = new JLabel("Availability");
           submitb = new JButton("Submit");
           submitb.setActionCommand("addBookSubmit");
           submitb.addActionListener(new ButtonEventHandler());
           
           namet = new JTextField();
           genret = new JTextField();
           descriptiont = new JTextArea();
           authort = new JTextField();
           availabilityt = new JTextField();
                    
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
           submitb.setBounds(50, 215, 90, 25);
           
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
           thirdPanel.add(submitb);
                                
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();         
           System.out.println("addBook");
           
        }
        
        public void bookView() throws ClassNotFoundException, SQLException //BookView************************
        {
           selectedValue = "book";
           
           //Preparing the 3rd Panel 
           fourthPanel.removeAll();
           fourthPanel.revalidate();
           fourthPanel.repaint();
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(530,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content          
           lm = new DefaultListModel();
           JLabel bookSearchl = new JLabel("Search Book");
           list = new JList(lm);
           sortb = new JButton("Sort");
           searchb = new JButton("Search");
           searcht = new JTextField();
           sortb.setActionCommand("bookSort");
           searchb.setActionCommand("bookSearch");
           list.addListSelectionListener(new ButtonEventHandler());
           sortb.addActionListener(new ButtonEventHandler());
           searchb.addActionListener(new ButtonEventHandler());
           list.setBounds(0, 0, 120,247);
           sortb.setBounds(135, 10, 60, 20);
           bookSearchl.setBounds(123, 60, 80, 20);
           searcht.setBounds(123, 80, 90, 20);
           searchb.setBounds(130, 105, 75, 20);
           
           ResultSet books = Book.getBooks();
           lm.removeAllElements();
           while(books.next())
           {
              lm.addElement(books.getString(1));
           }
           
           thirdPanel.setLayout(null);
           thirdPanel.add(list);
           thirdPanel.add(sortb);
           thirdPanel.add(bookSearchl);
           thirdPanel.add(searcht);
           thirdPanel.add(searchb);
           
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("viewBook");              
        }
        
        public void memberAdd()
        {
           //preparing the 3rd Panel
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(530,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           JLabel titlel = new JLabel("Title");
           JLabel namel = new JLabel("Name");
           JLabel nationalityl = new JLabel("Nationality");
           JLabel cityl = new JLabel("City");
           JLabel countryl = new JLabel("Country");
           JLabel contactl = new JLabel("Contact");
           submitb = new JButton("Submit");
           submitb.setActionCommand("addMemberSubmit");
           submitb.addActionListener(new ButtonEventHandler());
           
           titleMa = new JComboBox(); 
           titleMa.addItem("Mr"); 
           titleMa.addItem("Mrs");
           namema = new JTextField();
           nationalityma = new JTextField();
           cityma = new JTextField();
           countryma = new JTextField();
           contactma = new JTextField();
                    
           titlel.setBounds(20, 0, 100, 20);
           titleMa.setBounds(20, 20, 48, 20);
           namel.setBounds(73, 0, 100, 20);
           namema.setBounds(73, 20, 100, 20);
           nationalityl.setBounds(73, 40, 100, 20);
           nationalityma.setBounds(73, 60, 100, 20);
           cityl.setBounds(73, 80, 100, 20);
           cityma.setBounds(73, 100, 100, 20);
           countryl.setBounds(73, 120, 100, 20);
           countryma.setBounds(73, 140, 100, 20);
           contactl.setBounds(73, 160, 100, 20);
           contactma.setBounds(73, 180, 100, 20);
           submitb.setBounds(76, 210, 90, 25);
          
           thirdPanel.setLayout(null);
           thirdPanel.add(titlel);
           thirdPanel.add(titleMa);
           thirdPanel.add(namel);
           thirdPanel.add(namema);
           thirdPanel.add(nationalityl);
           thirdPanel.add(nationalityma);
           thirdPanel.add(cityl);
           thirdPanel.add(cityma);
           thirdPanel.add(countryl);
           thirdPanel.add(countryma);
           thirdPanel.add(contactl);
           thirdPanel.add(contactma);
           thirdPanel.add(submitb);
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("AddMember");             
        }
        
        public void memberView() throws ClassNotFoundException, SQLException
        {
           selectedValue = "member";
           
           //preparing the 3rd Panel
           fourthPanel.removeAll();
           fourthPanel.revalidate();
           fourthPanel.repaint();
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(530,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           lm = new DefaultListModel();
           JLabel memberSearch = new JLabel("Search Member");
           list = new JList(lm);
           sortb = new JButton("Sort");
           searchb = new JButton("Search");
           searcht = new JTextField();
           sortb.setActionCommand("memberSort");
           searchb.setActionCommand("memberSearch");
           list.addListSelectionListener(new ButtonEventHandler());
           sortb.addActionListener(new ButtonEventHandler());
           searchb.addActionListener(new ButtonEventHandler());
           list.setBounds(0, 0, 120,247);
           sortb.setBounds(135, 10, 60, 20);
           memberSearch.setBounds(123, 60, 100, 20);
           searcht.setBounds(123, 80, 90, 20);
           searchb.setBounds(130, 105, 75, 20);
           
           Member m1 = new Member();
           ResultSet members = m1.viewPerson();
           lm.removeAllElements();
           while(members.next())
           {
              lm.addElement(members.getString(1));
           }
           thirdPanel.setLayout(null);
           thirdPanel.add(list);
           thirdPanel.add(sortb);
           thirdPanel.add(memberSearch);
           thirdPanel.add(searcht);
           thirdPanel.add(searchb);
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("memberView");            
        }
        
        public void borrowBook()
        {
           //preparing the 3rd Panel
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(530,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           JLabel name = new JLabel("Borrower Name");
           JLabel book = new JLabel("Book Name");
           namet = new JTextField();
           namema = new JTextField();
           submitb = new JButton("Submit");
           submitb.setActionCommand("submitBorrow");
           submitb.addActionListener(new ButtonEventHandler());
           name.setBounds(30, 10, 100, 20);
           namet.setBounds(30, 30, 150, 20);
           book.setBounds(30, 65, 100, 20);
           namema.setBounds(30, 85, 150, 20);
           submitb.setBounds(58, 120, 90, 24);
           thirdPanel.setLayout(null);
           thirdPanel.add(name);
           thirdPanel.add(namet);
           thirdPanel.add(book);
           thirdPanel.add(namema);
           thirdPanel.add(submitb);
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("borrowBook");             
        }
        
        public void viewBorrowBook() throws SQLException, ClassNotFoundException
        {
           String todayydate = new String();
           Calendar todayy = Calendar.getInstance();
           todayydate = todayy.getTime().toString();
           //preparing the 3rd Panel
           fourthPanel.removeAll();
           fourthPanel.revalidate();
           fourthPanel.repaint();
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(530,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           lm = new DefaultListModel();
           list = new JList(lm);         
           list.setBounds(0, 0, 200,227);
           thirdPanel.setLayout(null);
           thirdPanel.add(list);
           
           ResultSet bookborrowview = bookBorrow.getBorrowed();
           lm.removeAllElements();
            try 
            {
                while(bookborrowview.next())
                {
                    lm.addElement(bookborrowview.getString(2));
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("viewBorrowBook");           
        }
        
        public void returnBook()
        {
           String todayydate = new String();
           Calendar todayy = Calendar.getInstance();
           todayydate = todayy.getTime().toString();
                           
           //preparing the 3rd Panel
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(530,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           JLabel name = new JLabel("Borrower Name");
           JLabel book = new JLabel("Book Name");
           JLabel bdate = new JLabel("");
           JLabel tdate = new JLabel(todayydate);  
           JLabel returnedAfterl = new JLabel("Returned after:");         
           namet = new JTextField();
           namema = new JTextField();
           returnedAfter = new JTextField();
           submitb = new JButton("Submit");
           submitb.setActionCommand("submitBookReturn");
           submitb.addActionListener(new ButtonEventHandler());
                                                                       
           name.setBounds(30, 10, 100, 20);
           namet.setBounds(30, 30, 150, 20);
           book.setBounds(30, 65, 100, 20);
           namema.setBounds(30, 85, 150, 20);
           bdate.setBounds(30, 105, 150, 20);
           tdate.setBounds(30, 125, 150, 20);
           returnedAfterl.setBounds(30, 145, 100, 20);
           returnedAfter.setBounds(120, 145, 20, 20);
           submitb.setBounds(60, 180, 90, 20);
           
           thirdPanel.setLayout(null);
           thirdPanel.add(name);
           thirdPanel.add(namet);
           thirdPanel.add(book);
           thirdPanel.add(namema);
           thirdPanel.add(bdate);
           thirdPanel.add(tdate);
           thirdPanel.add(returnedAfterl);
           thirdPanel.add(returnedAfter);
           thirdPanel.add(returnedAfter);
           thirdPanel.add(submitb);
           //returnedAfter
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("returnBook");             
        }
        
        public void addAuthor()
        {
           //preparing the 3rd Panel
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(530,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           JLabel titlel = new JLabel("Title");
           JLabel namel = new JLabel("Name");
           JLabel nationalityl = new JLabel("Nationality");
           JLabel cityl = new JLabel("City");
           JLabel countryl = new JLabel("Country");
           JLabel contactl = new JLabel("Contact");
           submitb = new JButton("Submit");
           submitb.setActionCommand("addAuthorSubmit");
           submitb.addActionListener(new ButtonEventHandler());
           
           thirdPanel.setLayout(null);
           titleMa = new JComboBox(); 
           titleMa.addItem("Mr"); 
           titleMa.addItem("Mrs");
           namema = new JTextField();
           nationalityma = new JTextField();
           cityma = new JTextField();
           countryma = new JTextField();
           contactma = new JTextField();
                    
           titlel.setBounds(20, 0, 100, 20);
           titleMa.setBounds(20, 20, 48, 20);
           namel.setBounds(73, 0, 100, 20);
           namema.setBounds(73, 20, 100, 20);
           nationalityl.setBounds(73, 40, 100, 20);
           nationalityma.setBounds(73, 60, 100, 20);
           cityl.setBounds(73, 80, 100, 20);
           cityma.setBounds(73, 100, 100, 20);
           countryl.setBounds(73, 120, 100, 20);
           countryma.setBounds(73, 140, 100, 20);
           contactl.setBounds(73, 160, 100, 20);
           contactma.setBounds(73, 180, 100, 20);
           submitb.setBounds(76, 210, 90, 25);        
           
           thirdPanel.setLayout(null);
           thirdPanel.add(titlel);
           thirdPanel.add(titleMa);
           thirdPanel.add(namel);
           thirdPanel.add(namema);
           thirdPanel.add(nationalityl);
           thirdPanel.add(nationalityma);
           thirdPanel.add(cityl);
           thirdPanel.add(cityma);
           thirdPanel.add(countryl);
           thirdPanel.add(countryma);
           thirdPanel.add(contactl);
           thirdPanel.add(contactma);
           thirdPanel.add(submitb);
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("addAuthor");       
        }
        
        public void viewAuthor() throws SQLException
        {
           selectedValue = "author";
            
           //preparing the 3rd Panel 
           fourthPanel.removeAll();
           fourthPanel.revalidate();
           fourthPanel.repaint();
           thirdPanel.removeAll();
           thirdPanel.revalidate();
           thirdPanel.repaint();
           secondPanel.setVisible(true);
           thirdPanel.setVisible(true);
           frame.setSize(530,300);
           thirdPanel.setLocation(297,6);
           thirdPanel.setSize(218,247);
           
           //Initializing the Content
           lm = new DefaultListModel();
           JLabel authorSearch = new JLabel("Search Author");
           list = new JList(lm);
           sortb = new JButton("Sort");
           searchb = new JButton("Search");
           searcht = new JTextField();
           sortb.setActionCommand("authorSort");
           searchb.setActionCommand("authorSearch");
           list.addListSelectionListener(new ButtonEventHandler());
           sortb.addActionListener(new ButtonEventHandler());
           searchb.addActionListener(new ButtonEventHandler());
           list.setBounds(0, 0, 120,247);
           sortb.setBounds(135, 10, 60, 20);
           authorSearch.setBounds(123, 60, 100, 20);
           searcht.setBounds(123, 80, 90, 20);
           searchb.setBounds(130, 105, 75, 20);
           
           Author a1 = new Author();
           ResultSet members = a1.viewPerson();
           lm.removeAllElements();
           while(members.next())
           {
              lm.addElement(members.getString(1));
           }
           thirdPanel.setLayout(null);
           thirdPanel.add(list);
           thirdPanel.add(sortb);
           thirdPanel.add(authorSearch);
           thirdPanel.add(searcht);
           thirdPanel.add(searchb);
           
           //preparing the 3rd Panel
           backPanel.add(thirdPanel);
           backPanel.revalidate();
           backPanel.repaint();
           System.out.println("viewAuthor");             
        }
        
    private class ButtonEventHandler implements ActionListener, ListSelectionListener,Runnable
    {   
    public void actionPerformed(ActionEvent e)            
    {
       String command = e.getActionCommand();
       //secondPanel.setBackground(Color.green);
       //thirdPanel.setBackground(Color.blue);
       if(command.equals("addBookSubmit"))
       {  
        Book b1 = new Book();
        b1.setAuthName(authort.getText());
        b1.setName(namet.getText());
        b1.setGenre(genret.getText());
        b1.setDescription(descriptiont.getText());
        b1.setAvailability(Integer.parseInt(availabilityt.getText())); 
                  
           try {
               b1.addBook();
           } catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           System.out.println("addbook");
       }
       else
       if(command.equals("addMemberSubmit"))
       {  
       Member m1 = new Member();
       m1.setTitle(titleMa.getSelectedItem().toString());
       m1.setName(namema.getText());
       m1.setCountry(countryma.getText());
       m1.setCity(cityma.getText());
       m1.setNationality(nationalityma.getText());                        
       m1.setContact(contactma.getText());       
       m1.addPerson();
           System.out.println("addMember");
       }
       else
       if(command.equals("addAuthorSubmit"))
       {  
       Author a1 = new Author();
       a1.setTitle(titleMa.getSelectedItem().toString());
       a1.setName(namema.getText());
       a1.setCountry(countryma.getText());
       a1.setCity(cityma.getText());
       a1.setNationality(nationalityma.getText());                        
       a1.setContact(contactma.getText());       
       a1.addPerson();
       }
       else
       if(command.equals("bookSort"))
       {  
       Book b3 = new Book();
       ResultSet books = b3.sort();
           try {
               lm.removeAllElements();
               while(books.next())
               {
                   lm.addElement(books.getString(1));                 
               }
               System.out.println("bookSort");
           } catch (SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       if(command.equals("memberSort"))
       {  
       Member m3 = new Member();
       ResultSet members = m3.sort();
           try {
               lm.removeAllElements();
               while(members.next())
               {
                   lm.addElement(members.getString(1));                  
               }
               System.out.println("memberSort");
           } catch (SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       if(command.equals("authorSort"))
       {  
       Author a3 = new Author();
       ResultSet authors = a3.sort();
           try {
               lm.removeAllElements();
               while(authors.next())
               {
                   lm.addElement(authors.getString(1));                  
               }
               System.out.println("authorSort");
           } catch (SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       if(command.equals("bookSearch"))
       {  
        Book b3 = new Book();
        ResultSet books = b3.search(searcht.getText());
           try 
           {
               lm.removeAllElements();
               while(books.next())
               {
                   lm.addElement(books.getString(1));
               }
               System.out.println("bookSearch");
            } catch (SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       if(command.equals("memberSearch"))
       {  
        Member m3 = new Member();
        ResultSet members = m3.search(searcht.getText());
           try 
           {
               lm.removeAllElements();
               while(members.next())
               {
                   lm.addElement(members.getString(2));
               }
               System.out.println("bookSearch");
            } catch (SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       if(command.equals("authorSearch"))
       {  
        Author a3 = new Author();
        ResultSet authors = a3.search(searcht.getText());
           try 
           {
               lm.removeAllElements();
               while(authors.next())
               {
                   lm.addElement(authors.getString(2));
               }
               System.out.println("authorSearch");
            } catch (SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       if(command.equals("submitBorrow"))
       {  
           bookBorrow bb3 = new bookBorrow();
           bb3.setMemberName(namet.getText());
           bb3.setBookName(namema.getText());
           try {
               bb3.addRecord();
               System.out.println("borrowBook");
           } catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       if(command.equals("submitBookReturn"))
       {  
           
           bookBorrow bb5 = new bookBorrow();
           try 
           {
               bb5.returnBook(namet.getText(), Integer.parseInt(returnedAfter.getText()));
           } 
           catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }    
        
        @Override
        public void valueChanged(ListSelectionEvent e) 
        {
            if(e.getSource() == list && selectedValue == "book") //Use of Threadding
                {
                   String selectedvaluex = list.getSelectedValue().toString();
                   returnedAuthName = new String();
                   fourthPanel.removeAll();
                   fourthPanel.revalidate();
                   fourthPanel.repaint();
                   //fourthPanel.setBackground(Color.green);
                   System.out.println(list.getSelectedValue()); 
                   frame.setSize(770,300);
                   
                   //Implementing the content
                   JLabel bookl = new JLabel("Book Details");   
                   JLabel namel = new JLabel("Book:");
                   JLabel genrel = new JLabel("Genre:");                   
                   JLabel availabilityl = new JLabel("Availability:");
                   JLabel authorl = new JLabel("Author Details");      
                   JLabel anamel = new JLabel("Author:");      
                   JLabel nationalityl = new JLabel("Nationality:");                       
                                     
                   ansnamel = new JLabel("");
                   ansgenrel = new JLabel("");
                   ansavailabilityl = new JLabel("");
                   ansauthorl = new JLabel("");
                   ansanationalityl = new JLabel("");

                   
                try 
                {
                    ResultSet getBookAuthor = Book.getBookDetails(selectedvaluex);
                    while(getBookAuthor.next())
                        {
                           returnedAuthName = (getBookAuthor.getString(3)); 
                        }
                    Runnable obj1 = new ButtonEventHandler();
                    Thread t1 = new Thread(obj1);
                    t1.start();
                    
                    System.out.println(returnedAuthName);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
                }
                                                                                       
                   bookl.setBounds(20, 0, 100, 20);
                   namel.setBounds(20, 20, 150, 20);
                   ansnamel.setBounds(70, 20, 150, 20);                  
                   genrel.setBounds(20, 40, 100, 20);
                   ansgenrel.setBounds(70, 40, 100, 20);
                   availabilityl.setBounds(20, 60, 100, 20);
                   ansavailabilityl.setBounds(90, 60, 100, 20);
                   authorl.setBounds(20, 100, 100, 20);
                   anamel.setBounds(20, 120, 150, 20);
                   ansauthorl.setBounds(70, 120, 150, 20);
                   nationalityl.setBounds(20, 140, 100, 20);
                   ansanationalityl.setBounds(90, 140, 100, 20);

                   fourthPanel.setLayout(null);
                   fourthPanel.add(bookl);
                   fourthPanel.add(namel);                                                                                                                           
                   fourthPanel.add(ansnamel);                                                                                                                           
                   fourthPanel.add(genrel);                                                                                                                           
                   fourthPanel.add(ansgenrel);                                                                                                                           
                   fourthPanel.add(availabilityl);                                                                                                                           
                   fourthPanel.add(ansavailabilityl);                                                                                                                           
                   fourthPanel.add(authorl);                                                                                                                           
                   fourthPanel.add(anamel);                                                                                                                           
                   fourthPanel.add(ansauthorl);                                                                                                                           
                   fourthPanel.add(nationalityl);                                                                                                                           
                   fourthPanel.add(ansanationalityl);                                                                                                                                                                                                         
                   backPanel.add(fourthPanel);                  
                }  
            else
            if(e.getSource() == list && selectedValue == "member")
            {     
               System.out.println(list.getSelectedValue()); 
               frame.setSize(770,300);
               backPanel.add(fourthPanel);  
               
               String selectedvaluex = list.getSelectedValue().toString();
                   returnedAuthName = new String();
                   fourthPanel.removeAll();
                   fourthPanel.revalidate();
                   fourthPanel.repaint();
                   //fourthPanel.setBackground(Color.green);
                   System.out.println(list.getSelectedValue()); 
                   frame.setSize(770,300);
                   
                   //Implementing the content
                   JLabel bookl = new JLabel("Member Details");   
                   JLabel namel = new JLabel("Name:");
                   JLabel genrel = new JLabel("Nationality:");                   
                   JLabel availabilityl = new JLabel("City:");
                   JLabel authorl = new JLabel("Country:");      
                   JLabel anamel = new JLabel("Contact:");      
                                                          
                   ansnamel = new JLabel("");
                   ansgenrel = new JLabel("");
                   ansavailabilityl = new JLabel("");
                   ansauthorl = new JLabel("");
                   ansanationalityl = new JLabel("");
                
                try 
                {
                    Member mm5 = new Member();
                    ResultSet getmemberd = mm5.viewPersonDetails(selectedvaluex);
                    while(getmemberd.next())
                        {
                            ansnamel.setText(getmemberd.getString(2));
                            ansgenrel.setText(getmemberd.getString(3));
                            ansavailabilityl.setText(getmemberd.getString(4));
                            ansauthorl.setText(getmemberd.getString(5));
                            ansanationalityl.setText(getmemberd.getString(6));
                            System.out.println("Values?"); 
                        }                    
                    System.out.println(returnedAuthName);
                } catch (SQLException ex) {
                    Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
                }
                                                                                       
                   bookl.setBounds(20, 0, 100, 20);
                   namel.setBounds(20, 20, 150, 20);
                   ansnamel.setBounds(70, 20, 150, 20);                  
                   genrel.setBounds(20, 40, 100, 20);
                   ansgenrel.setBounds(90, 40, 100, 20);
                   availabilityl.setBounds(20, 60, 100, 20);
                   ansavailabilityl.setBounds(50, 60, 100, 20);
                   authorl.setBounds(20, 80, 100, 20);
                   ansauthorl.setBounds(70, 80, 150, 20);
                   anamel.setBounds(20, 100, 150, 20);                  
                   ansanationalityl.setBounds(70, 100, 100, 20);

                   fourthPanel.setLayout(null);
                   fourthPanel.add(bookl);
                   fourthPanel.add(namel);                                                                                                                           
                   fourthPanel.add(ansnamel);                                                                                                                           
                   fourthPanel.add(genrel);                                                                                                                           
                   fourthPanel.add(ansgenrel);                                                                                                                           
                   fourthPanel.add(availabilityl);                                                                                                                           
                   fourthPanel.add(ansavailabilityl);                                                                                                                           
                   fourthPanel.add(authorl);                                                                                                                           
                   fourthPanel.add(anamel);                                                                                                                           
                   fourthPanel.add(ansauthorl);                                                                                                                                                                                                                                                   
                   fourthPanel.add(ansanationalityl);                                                                                                                                                                                                         
                   backPanel.add(fourthPanel);     
                                                                    
            }  
            else
            if(e.getSource() == list && selectedValue == "author")
                {
                  System.out.println(list.getSelectedValue()); 
               frame.setSize(770,300);
               backPanel.add(fourthPanel);  
               
               String selectedvaluex = list.getSelectedValue().toString();
                   returnedAuthName = new String();
                   fourthPanel.removeAll();
                   fourthPanel.revalidate();
                   fourthPanel.repaint();
                   //fourthPanel.setBackground(Color.green);
                   System.out.println(list.getSelectedValue()); 
                   frame.setSize(770,300);
                   
                   //Implementing the content
                   JLabel bookl = new JLabel("Author Details");   
                   JLabel namel = new JLabel("Name:");
                   JLabel genrel = new JLabel("Nationality:");                   
                   JLabel availabilityl = new JLabel("City:");
                   JLabel authorl = new JLabel("Country:");      
                   JLabel anamel = new JLabel("Contact:");      
                                                          
                   ansnamel = new JLabel("");
                   ansgenrel = new JLabel("");
                   ansavailabilityl = new JLabel("");
                   ansauthorl = new JLabel("");
                   ansanationalityl = new JLabel("");
                
                try 
                {
                    Author aa5 = new Author();
                    ResultSet getauthord = aa5.viewPersonDetails(selectedvaluex);
                    while(getauthord.next())
                        {
                            ansnamel.setText(getauthord.getString(2));
                            ansgenrel.setText(getauthord.getString(3));
                            ansavailabilityl.setText(getauthord.getString(4));
                            ansauthorl.setText(getauthord.getString(5));
                            ansanationalityl.setText(getauthord.getString(6));
                            System.out.println("Values?"); 
                        }                    
                    System.out.println(returnedAuthName);
                } catch (SQLException ex) {
                    Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
                }
                                                                                       
                   bookl.setBounds(20, 0, 100, 20);
                   namel.setBounds(20, 20, 150, 20);
                   ansnamel.setBounds(70, 20, 150, 20);                  
                   genrel.setBounds(20, 40, 100, 20);
                   ansgenrel.setBounds(90, 40, 100, 20);
                   availabilityl.setBounds(20, 60, 100, 20);
                   ansavailabilityl.setBounds(50, 60, 100, 20);
                   authorl.setBounds(20, 80, 100, 20);
                   ansauthorl.setBounds(70, 80, 150, 20);
                   anamel.setBounds(20, 100, 150, 20);                  
                   ansanationalityl.setBounds(70, 100, 100, 20);

                   fourthPanel.setLayout(null);
                   fourthPanel.add(bookl);
                   fourthPanel.add(namel);                                                                                                                           
                   fourthPanel.add(ansnamel);                                                                                                                           
                   fourthPanel.add(genrel);                                                                                                                           
                   fourthPanel.add(ansgenrel);                                                                                                                           
                   fourthPanel.add(availabilityl);                                                                                                                           
                   fourthPanel.add(ansavailabilityl);                                                                                                                           
                   fourthPanel.add(authorl);                                                                                                                           
                   fourthPanel.add(anamel);                                                                                                                           
                   fourthPanel.add(ansauthorl);                                                                                                                                                                                                                                                   
                   fourthPanel.add(ansanationalityl);                                                                                                                                                                                                         
                   backPanel.add(fourthPanel);                       
                }      
            
        }

        @Override
        public void run() 
        {
        System.out.println("THIS IS THREAD");
        try 
        {
            ResultSet bookviews = Book.getBookDetails(returnedAuthName);
            
            while(bookviews.next())
                {
                    ansnamel.setText(bookviews.getString(1));
                    ansgenrel.setText(bookviews.getString(4));
                    ansavailabilityl.setText(bookviews.getString(5));
                    System.out.println("Values?");
                }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
            Author av3 = new Author();
            ResultSet authorviews = av3.viewPersonDetails(returnedAuthName);
                    
        try {
            while(authorviews.next())
            {
                ansauthorl.setText(authorviews.getString(2));
                ansanationalityl.setText(authorviews.getString(3));
                System.out.println("Values?");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
        }
   }
  }
}

//Comments will be added later for the presentation time.