

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import model.Player;
import utility.ConnectionManager;

public class PlayerDAO{
	
	public List<Player> getAllPlayers()  {
		
		System.out.println("Create Player dao");
	List<Player> list = new ArrayList<Player>();
		
		String player="select ID,NAME,COUNTRY,S.SKILL_ID, SKILLNAMES from player P INNER JOIN SKILLS S ON P.SKILL_ID = S.SKILL_ID";
			
	 Connection con=null;
		   try {
			con=ConnectionManager.getConnection();
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(player);
		while(resultSet.next()) {
			Long playerld = resultSet.getLong("ID");
			String name = resultSet.getString("NAME");
			String country=resultSet.getString("COUNTRY");
		Long skill_id	= resultSet.getLong("SKILL_ID");
		String skillname = resultSet.getString("SKILLNAMES");
		
		Skill skill = new Skill(skill_id,skillname);
			Player player1 = new Player(playerld,name,country,skill);
			list.add(player1);
		}
		   } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		   return list;
		   
	   }

	
}
