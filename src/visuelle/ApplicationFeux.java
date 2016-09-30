package visuelle;

import java.awt.GridLayout;

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
    ImageIcon[] feux;
    
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
    
    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorldSwing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                //Add the ubiquitous "Hello World" label.
                JLabel label = new JLabel("Hello World");
                frame.getContentPane().add(label);

                //Display the window.
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
