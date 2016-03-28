package view;

import javax.swing.*;
import controller.AppController;

public class AppFrame extends JFrame
	{
		private AppPanel panel;
		
		public AppFrame(AppController controller)
		{
			panel = new AppPanel(controller);
			
			buildWindow();
		}
		
		private void buildWindow()
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("Inheritance/Polymorphism");
			this.setSize(400,400);
			this.setContentPane(panel);
			this.setVisible(true);
		}
		
		public AppPanel getPanel()
		{
			return panel;
		}
	}
