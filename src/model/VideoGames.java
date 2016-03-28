package model;

import java.util.*;

public abstract class VideoGames
	{
		private int playerCount;
		private ArrayList<String> equipmentList;

		public int getPlayerCount()
			{
				return playerCount;
			}

		public void setPlayerCount(int playerCount)
			{
				this.playerCount = playerCount;
			}

		public ArrayList<String> getEquipmentList()
			{
				return equipmentList;
			}

		public void setEquipmentList(ArrayList<String> equipmentList)
			{
				this.equipmentList = equipmentList;
			}

		public boolean isFun()
			{
				return isFun;
			}

		public void setFun(boolean isFun)
			{
				this.isFun = isFun;
			}

		private boolean isFun;
	}
