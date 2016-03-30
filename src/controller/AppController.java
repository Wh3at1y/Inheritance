package controller;

import java.util.ArrayList;
import model.CSGO;
import model.Gaymes;
import model.Minecraft;
import view.AppFrame;

public class AppController
	{
		private AppFrame frame;
		private ArrayList<Gaymes> gaymesList;

		public AppController()
			{
				gaymesList = new ArrayList<Gaymes>();
				frame = new AppFrame(this);
			}

		public void setupGaymesList()
			{
				gaymesList.add(new Minecraft());
				gaymesList.add(new CSGO());
			}

		public String showInterface()
			{
				String interfaceInfo = "";
				
				for (Gaymes currentGaymes : gaymesList)
					{
						interfaceInfo.concat("The current list has " + currentGaymes.toString());
						interfaceInfo.concat("\nand is it fun?   " + currentGaymes.isFun());
					}
				
				return interfaceInfo;
			}

		public AppFrame getFrame()
			{
				return frame;
			}
	}
