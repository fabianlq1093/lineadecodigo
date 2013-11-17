/**
  * @file Ventan.groovy
  * @version 1.0
  * @author Ariel Carraro
  * @date   30-marzo-2013
  * @url    http://lineadecodigo.com/groovy/ejecutar-un-proceso-batch-en-groovy/
  * @description  Crear una ventana Swing en Groovye)
  */
 

import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.ImageIcon
import javax.swing.*
import java.awt.event.*
import java.awt.*


ventana()

def ventana(){
  frame=new JFrame(title: '::Ventana en Groovy::',size: [270,300],layout: new FlowLayout(),defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE)

  btnActiva=new JButton("<html><font color='white'>Activa</font></html>",new ImageIcon("pet01.png"))
  btnActiva.setBackground(Color.blue)
  btnActiva.setToolTipText("activar...")
  btnActiva.addActionListener({
    def cad=JOptionPane.showInputDialog("Tu nombre:")
    JOptionPane.showMessageDialog(null,"Hola "+cad,"Aviso del sistema",JOptionPane.PLAIN_MESSAGE,new ImageIcon("pet01.png"))

   } as ActionListener)


  btnSalir=new JButton("<html><font color='white'>Salir</font></html>",new ImageIcon("pet01.png"))
  btnSalir.setBackground(Color.orange)
  btnSalir.setToolTipText("quitar...")
  btnSalir.addActionListener({
    System.exit(0)
  } as ActionListener)

  frame.add btnActiva
  frame.add btnSalir
  frame.show()
}

