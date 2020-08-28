package org.temp.main;

import java.util.Scanner;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.learnwebservices.services.tempconverter.CelsiusToFahrenheitRequest;
import com.learnwebservices.services.tempconverter.CelsiusToFahrenheitResponse;
import com.learnwebservices.services.tempconverter.TempConverterEndpoint;
import com.learnwebservices.services.tempconverter.TempConverterEndpointService;

/*How this Java Programm works. 
 * You need to start the main method and to enter a double digit. 
 * Afterwards you need to select the initial degree. 
 * The programm will calculate it into Celsius or Fahrenheit.
 * Martin Zlatkov
 * 20200828
 */
public class TempConverterAPISOAP  {
	public static void main(String[] args) {
		/*
		 * Gui go = new Gui(); 
		 * go.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 * go.setSize(380, 200); 
		 * go.setVisible(true);
		 */
		SwingUtilities.invokeLater(new Gui());
	}
}