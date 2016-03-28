package view;

import javax.swing.*;
import controller.AppController;

public class AppPanel extends JPanel
	{
		private AppController controller;
		private SpringLayout layout;
		
		private JButton csgoButton;
		private JButton minecraftButton;
		
		public AppPanel(AppController controller)
			{
				this.controller = controller;
				layout = new SpringLayout();
				
				csgoButton = new JButton("Counter-Strike Global Offensive");
				minecraftButton = new JButton("Minecraft");
				
				buildComponents();
				buildPlacements();
				buildListeners();
			}

		private void buildComponents()
			{
				setLayout(layout);
				add(csgoButton);
				add(minecraftButton);
			}

		private void buildListeners()
			{

			}

		private void buildPlacements()
			{
				layout.putConstraint(SpringLayout.NORTH, minecraftButton, 5, SpringLayout.SOUTH, csgoButton);
				layout.putConstraint(SpringLayout.WEST, minecraftButton, 0, SpringLayout.WEST, csgoButton);
				layout.putConstraint(SpringLayout.SOUTH, minecraftButton, 43, SpringLayout.SOUTH, csgoButton);
				layout.putConstraint(SpringLayout.EAST, minecraftButton, 0, SpringLayout.EAST, csgoButton);
				layout.putConstraint(SpringLayout.NORTH, csgoButton, 10, SpringLayout.NORTH, this);
				layout.putConstraint(SpringLayout.WEST, csgoButton, 10, SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.SOUTH, csgoButton, 48, SpringLayout.NORTH, this);
				layout.putConstraint(SpringLayout.EAST, csgoButton, -10, SpringLayout.EAST, this);
			}
	}
