
import javax.swing.JFrame;

/**
 *
 * @author biond
 */
public class GameFrame extends JFrame {

    //Erstellung des GameFrames
    public GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
    }
    
}
