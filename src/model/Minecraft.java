package model;

import java.util.ArrayList;

public class Minecraft extends VideoGames
	{
		public Minecraft()
		{
			this.setEquipmentList(mcEquiptment());
			this.setFun(true);
			this.setPlayerCount(4);
		}
		
		private ArrayList<String> mcEquiptment()
		{
			ArrayList<String> equipt = new ArrayList<String>();
			equipt.add("Mouse");
			equipt.add("Keyboard");
			equipt.add("Monitor");
			equipt.add("lower-end graphics card");
			equipt.add("medium-end processor");
			
			return equipt;
		}
	}
