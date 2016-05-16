package model;

import java.util.*;

public abstract class VideoGames implements GameInfo
	{
		private int					playerCount;
		private ArrayList<String>	equipmentList;
		private boolean				isFun;

		public int compareTo(Object compared)
		{
			int comparedValue = Integer.MIN_VALUE;
			return comparedValue;
			
		}
		
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

		public String toString()
			{
				String gameDesc = "Video game object of type " + this.getClass().getName() + "and is it fun? " + isFun();
				return gameDesc;
			}

		/**
		 * if this object is before or less than the compared object, return a negative number. (generally -1) if this object is after or greater than the compared object, return a positive number. (generally 1) if it's the same, return 0.
		 */
		public int compareTo(GameInfo compared)
			{
				if (this.playerCount() < compared.playerCount())
					{

					}

				return 1;
			}
	}
