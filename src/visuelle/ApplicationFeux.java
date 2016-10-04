package visuelle;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.FlowLayout;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Fenêtre
 * @author caup2301
 *
 */
public class ApplicationFeux
{
    JLabel label;
    JButton button;
    GridLayout layout;
    static List<ImageIcon> feux;
    
    /*
     * Disposition des feux
     *              0
     *       1              3
     *              2
     * 
     */
    
    /*
     * Procédure pour faire une image en swing
     *  BufferedImage img = ImageIO.read(new File(IMG_PATH));
         ImageIcon icon = new ImageIcon(img);
         JLabel label = new JLabel(icon);
     */
    
    private static  List<ImageIcon> loadImage(){
        List<ImageIcon> feux = new ArrayList<>();
        BufferedImage img = null;
        
         // IMAGE VIDE
        try
        {img = ImageIO.read(new File("src/image/vide.png"));}
        catch (IOException e)
        {e.printStackTrace();}
        ImageIcon VIDE = new ImageIcon(img);
        feux.add(VIDE);
        
        // IMAGE ROUGE
        try
        {img = ImageIO.read(new File("src/image/rouge.png"));}
        catch (IOException e)
        {e.printStackTrace();}
        ImageIcon ROUGE = new ImageIcon(img);
        feux.add(ROUGE);
        
        // IMAGE VERT
        try
        {img = ImageIO.read(new File("src/image/vert.png"));}
        catch (IOException e)
        { e.printStackTrace();}
        ImageIcon VERT = new ImageIcon(img);
        feux.add(VERT);
        
        // IMAGE JAUNE
        try
        {img = ImageIO.read(new File("src/image/jaune.png"));}
        catch (IOException e)
        {e.printStackTrace();}
        ImageIcon JAUNE = new ImageIcon(img);
        feux.add(JAUNE);
        
        return feux;

    }
    
    public static void main(String args[]) {
        
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 
                // creates window with title
                JFrame frame = new JFrame("HelloWorldSwing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // creates the main layout
                FlowLayout mainLayout = new FlowLayout();
                frame.setLayout(mainLayout);

                // creates the grid for the lights
                JPanel gridPanel = new JPanel();
                GridLayout gridLayout = new GridLayout(3,3);
                gridPanel.setLayout(gridLayout);
                
                // add the grid and the the text box to the layout
                frame.add(gridPanel);
                frame.add(new JTextField("FUCKTHISSHITGODDAMMIT"));
                
                // loads the image of the lights
                feux = loadImage();
                
                List<JLabel> feuxLabel = new ArrayList<>();
                
                for (int x = 0; x < 3; x++) {
                    for (int y = 0 ; y < 3; y++){
                        
                        JLabel test;
                        if((x+y)%2 == 1) test = new JLabel(feux.get(1));
                        else test = new JLabel(feux.get(0)); 
                        gridPanel.add(test);
                    }
                }
              
                //Display the window.
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
