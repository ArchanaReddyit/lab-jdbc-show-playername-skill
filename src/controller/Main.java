

package controller;

import java.util.List;

import dao.PlayerDAO;
import model.Player;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		PlayerDAO playerdao=new PlayerDAO();
		
		 // id = skilldao.getLong(id);
		
				//List<Skill> list = skilldao.getSkillBylD();
				List<Player> list1=playerdao.getAllPlayers();
				
				//System.out.println(list1 +"\n");
				System.out.println(list1.toString());
			//System.out.println("Skill [skillid=" + Skill.getSkillid() + ", skillName=" + skillName + "]";); 
			
			}
	}


