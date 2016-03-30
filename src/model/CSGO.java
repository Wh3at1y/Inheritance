package model;

import java.util.ArrayList;

public class CSGO extends VideoGames
	{
		public CSGO()
		{
			super();
			this.setEquipmentList(csgoEquiptment());
			this.setFun(true);
			this.setPlayerCount(10);
		}
		
		private ArrayList<String> csgoEquiptment()
		{
			ArrayList<String> equipt = new ArrayList<String>();
			equipt.add("Mouse");
			equipt.add("Keyboard");
			equipt.add("At least a 60hz monitor");
			equipt.add("medium-end graphics card");
			equipt.add("medium-end processor");
			
			return equipt;
		}
		
		public boolean isSeries()
			{
				return true;
			}

		public boolean isMulitplayer()
			{
				return true;
			}

		public void gameRate(int rating)
			{
				rating = 9;
			}

		public void gameCatagory(String catagory)
			{
				catagory = "FPS";
			}
	}
