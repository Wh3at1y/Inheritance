package model;
/**
 * 
 * @author Sam Montoya, Dylan Rockne, Gage Hopkins, Josiah Elmer
 *
 */

public interface Gaymes
	{
		public boolean isFun();		//Returns
		public boolean isSeries();		//Returns
		public boolean isMulitplayer();	//Returns
		
		public void gameRate(int rating);	//Parameter
		public void gameCatagory(String catagory);		//Parameter
	}
