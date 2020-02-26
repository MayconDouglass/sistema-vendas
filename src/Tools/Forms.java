/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import View.viewMainMenu;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author Maycon
 */
public class Forms {
    
    public void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = viewMainMenu.Desktop.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    
}
