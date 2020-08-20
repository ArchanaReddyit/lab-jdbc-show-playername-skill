
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	 public List<Skill> getSkillBylD() {
		
		System.out.println("Create Skill dao");
	List<Skill> list = new ArrayList<Skill>();
		
		String Skills="select SKILL_ID, SKILLNAMES from skills";
		
	 Connection con=null;
		   try {
			con=ConnectionManager.getConnection();
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(Skills);
		while(resultSet.next()) {
			Long skillid = resultSet.getLong("SKILL_ID");
			String skillName = resultSet.getString("SKILLNAMES");
			Skill skill = new Skill(skillid, skillName);
			list.add(skill);
			
		}
		   } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		   return list;
   }
	
}
