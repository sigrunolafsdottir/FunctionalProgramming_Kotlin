package Demos

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants


fun JFrame.getBaseApp() : JFrame{
    val p = JPanel()
    val button = JButton("Tryck här")
    this.add(p)
    p.add(button)
    this.pack();
    this.setLocation(1000, 500);
    this.setVisible(true);
    this.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
    return this
}


fun main(){
    val jFrame = JFrame().getBaseApp()
}