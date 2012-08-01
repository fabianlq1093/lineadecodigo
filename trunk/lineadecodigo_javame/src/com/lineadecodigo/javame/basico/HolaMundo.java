package com.lineadecodigo.javame.basico;

/**
 * @file HolaMundo.java
 * @version 1.0
 * @author Emmanuel Ramos (http://lineadecodigo.com)
 * @date   01/agosto/2012
 * @url    http://lineadecodigo.com/java/hola-mundo-con-java-me/
 * @description Primera aplicación con Java ME: Hola Mundo
 */


import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class HolaMundo extends MIDlet {

	private Display display;
	private MyCanvas mycanvas;
	
	public HolaMundo() {}

	protected void destroyApp(boolean unconditional)
			throws MIDletStateChangeException {}

	protected void pauseApp() {}

	protected void startApp() throws MIDletStateChangeException {        
		//Obtenemos el display de esta aplicacion
		display = Display.getDisplay(this);

		//Instanciamos MyCanvas
		this.mycanvas = new MyCanvas();		
        display.setCurrent(mycanvas);
	}
	
	class MyCanvas extends Canvas {
		protected void paint(Graphics g) {
			g.setColor(255,255,255);
			g.drawString("HOLA MUNDO", this.getWidth()/2, this.getHeight()/2, Graphics.BASELINE|Graphics.HCENTER);
		}
	}

}
