package controller;

import java.util.ArrayList;
import model.CSGO;
import model.GameInfo;
import model.Minecraft;
import view.AppFrame;

public class AppController
	{
		private AppFrame			frame;
		private ArrayList<GameInfo>	gaymesList;
		private GameInfo gaymes;

		public AppController()
			{
				gaymesList = new ArrayList<GameInfo>();
				frame = new AppFrame(this);
				setupGaymesList();
			}

		private void swap(int firstLoc, int secLoc)
		{
			
		}
		
		private int partion(int low, int high)
		{
			int position = low;
			GameInfo games = gaymes.get(high);
			
			for(int spot = low; spot < high-1; spot++)
				{
					if(games.get(spot).compareTo(games) <= 0)
						{
							swap(position, spot);
							position++;
						}
				}
			swap(position,high);
			return position;
		}
		private void quicksort(int low, int high)
		{
			if(low < high)
				{
					int midPoint = partition(low,high);
					quicksort(low, midPoint-1);
					quicksort(midPoint+1, high);
				}
		}
		private void insertionSort()
		{
			for(int outerLoop = 1; outerLoop < gaymesList.size(); outerLoop++)
				{
					int innerLoop = outerLoop;
					while(innerLoop > 0 && (gaymes.get(innerLoop-1).compareTo(gaymes.get(innerLoop))) < 0)
						{
							swap(innerLoop, innerLoop-1);
							innerLoop--;
						}
				}
		}
		private void setupGaymesList()
			{
				gaymesList.add(new Minecraft());
				gaymesList.add(new CSGO());
				System.out.println(showInterface());
			}

		public String showInterface()
			{
				String interfaceInfo = "";

				for (GameInfo currentGaymes : gaymesList)
					{
						interfaceInfo.concat("The current list has " + currentGaymes.toString());
						interfaceInfo.concat("\nand is it fun?   " + currentGaymes.isFun());
					}
				System.out.println(interfaceInfo);
				return interfaceInfo;
			}

		public AppFrame getFrame()
			{
				return frame;
			}
	}
