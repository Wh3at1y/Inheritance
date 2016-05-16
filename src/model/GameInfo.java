package model;
/**
 * 
 * @author Sam Montoya, Dylan Rockne, Gage Hopkins, Josiah Elmer
 *
 */

public interface GameInfo
	{
		public boolean isFun();		//Returns
		public int playerCount();	//Returns
		public boolean isMulitplayer();	//Returns
		
		public void gameRate(int rating);	//Parameter
		public void gameCatagory(String catagory);		//Parameter
		
		public int compareTo(Object thing);
	}
