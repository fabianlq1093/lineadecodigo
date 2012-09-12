package com.lineadecodigo.javame.basico;

/**
 * @file HolaMundoTextBox.java
 * @version 1.0
 * @author Linea de Código (http://lineadecodigo.com)
 * @date   13/septiembre/2012
 * @url    http://lineadecodigo.com/java/hola-mundo-con-java-me-y-un-textbox/
 * @description Hola Mundo en Java ME con un TextBox
 */


import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;


public class HolaMundoTextBox extends MIDlet {

	private Display display;
	TextBox textbox = new TextBox("Mi ejemplo","Hola Mundo",20,0);
	
	public HolaMundoTextBox() {	}

	protected void destroyApp(boolean unconditional)
			throws MIDletStateChangeException {	}

	protected void pauseApp() {	}

	protected void startApp() throws MIDletStateChangeException {
		display = Display.getDisplay(this);
		display.setCurrent(textbox);

	}

}
