package view;

import javax.swing.*;

public class AppFrame extends JFrame
	{
		private AppPanel panel;
		
		public AppFrame()
		{
			panel = new AppPanel();
			
			buildWindow();
		}
		
		private void buildWindow()
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("Inheritance/Polymorphism");
			this.setSize(400,400);
			this.setVisible(true);
		}
		
		public AppPanel getPanel()
		{
			return panel;
		}
	}
