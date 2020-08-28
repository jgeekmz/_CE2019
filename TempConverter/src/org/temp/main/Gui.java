package org.temp.main;

import javax.swing.JFrame;

import com.learnwebservices.services.tempconverter.CelsiusToFahrenheitRequest;
import com.learnwebservices.services.tempconverter.CelsiusToFahrenheitResponse;
import com.learnwebservices.services.tempconverter.FahrenheitToCelsiusRequest;
import com.learnwebservices.services.tempconverter.FahrenheitToCelsiusResponse;
import com.learnwebservices.services.tempconverter.TempConverterEndpoint;
import com.learnwebservices.services.tempconverter.TempConverterEndpointService;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Gui implements Runnable {

	private JTextField tf;
	private JCheckBox cels;
	private JCheckBox fahr;
	private JFrame frame;
	private JButton taste;

	public Gui() {
		/*
		 * super("Degree Calculator"); setLayout(new FlowLayout());
		 */
		frame = new JFrame("Degree Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		JPanel checkBoxPanel = new JPanel();

		tf = new JTextField();
		tf.setPreferredSize(new Dimension(100, 50));
		tf.setFont(new Font("Serif", Font.PLAIN, 18));
		// add(tf);
		cels = new JCheckBox("Celsius");
		fahr = new JCheckBox("Fahrenheit");
		taste = new JButton("Exit");
		checkBoxPanel.add(tf);
		checkBoxPanel.add(cels);
		checkBoxPanel.add(fahr);
		checkBoxPanel.add(taste);
		// add(cels);
		// add(fahr);

		mainPanel.add(checkBoxPanel);

		frame.add(mainPanel);
		frame.pack();
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
		taste.addActionListener(e -> {
			frame.dispose();
		});

		HandlerClass handler = new HandlerClass();
		cels.addItemListener(handler);
		fahr.addItemListener(handler);
	}

	public class HandlerClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			// boolean isCels = false;
			// boolean isFahr = false;
			// boolean calc = false;
			if (cels.isSelected()) {
				// calc = true;
				// Call webservice
				TempConverterEndpointService service = new TempConverterEndpointService();
				TempConverterEndpoint port = service.getTempConverterEndpointPort();
				CelsiusToFahrenheitRequest req = new CelsiusToFahrenheitRequest();
				double tempDegree = Double.parseDouble(tf.getText());
				req.setTemperatureInCelsius(tempDegree);
				CelsiusToFahrenheitResponse res = port.celsiusToFahrenheit(req);
				System.out.println("Celsius to Fahrenheit: " + res.getTemperatureInFahrenheit() + " degree");
			} else if (fahr.isSelected()) {
				// calc = false;
				// call webservice
				TempConverterEndpointService service = new TempConverterEndpointService();
				TempConverterEndpoint port = service.getTempConverterEndpointPort();
				FahrenheitToCelsiusRequest req = new FahrenheitToCelsiusRequest();
				double tempDegree = Double.parseDouble(tf.getText());
				req.setTemperatureInFahrenheit(tempDegree);
				FahrenheitToCelsiusResponse res = port.fahrenheitToCelsius(req);
				System.out.println("Fahrenheit to Celsius: " + res.getTemperatureInCelsius() + " degree");
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}

}
