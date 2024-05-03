import javax.swing.*;
import java.awt.*;

public class GadgetShop
{
    // instance variables - replace the example below with your own
    
private JButton addMobile = new JButton("Add Mobile");
private JButton clear = new JButton("Clear");
private JButton addmp3 = new JButton("Add MP3");
private JButton displayall = new JButton("Display all");
private JButton makeacall = new JButton("Make a call");
private JButton downloadmusic = new JButton("Download Music");
private JTextField Model = new JTextField();
private JTextField Price = new JTextField();
private JTextField Weight = new JTextField();
private JTextField Size = new JTextField();
private JTextField Credit = new JTextField();
private JTextField Memory = new JTextField();
private JTextField PhoneNo = new JTextField();
private JTextField Duration = new JTextField();
private JTextField Download = new JTextField();
private JTextField DisplayNumber= new JTextField();

    /**
     * Constructor for objects of class GadgetShopclass
     */
    public GadgetShop()
    {
        JFrame frame = new JFrame("Gadget Shop");
        frame.setSize (300,300); 
        frame.setLayout( new GridLayout(14,2));
    
        
        frame.add(addMobile);
        frame.add(clear);
        frame.add(addmp3);
        frame.add(displayall);
        frame.add(makeacall);
        frame.add(downloadmusic);
        frame.add(Model);
        frame.add(Price);
        frame.add(Weight);
        frame.add(Size);
frame.add(new JLabel("Model"));
        frame.add(Credit);
        frame.add(Memory);
        frame.add(PhoneNo);
        frame.add(Duration);
        frame.add(Download);
        frame.add(DisplayNumber);
        
        
        frame.add(new JLabel("Price"));
        frame.add(new JLabel("Weight"));
        frame.add(new JLabel("Size"));
        frame.add(new JLabel("Credit"));
        frame.add(new JLabel("Memory"));
        frame.add(new JLabel("PhoneNo"));
        frame.add(new JLabel("Duration"));
        frame.add(new JLabel("Download"));
        frame.add(new JLabel("DisplayNumber"));
        
    
        frame.setVisible(true);
        
    }


}
