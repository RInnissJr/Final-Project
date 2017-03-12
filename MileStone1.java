import java.util.Scanner;
import ToolKit.NFLPlayer;
public class MileStone1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		NFLPlayer player1= new NFLPlayer("Tom Brady");
        player1.playerAge(39);
        player1.playerGender("Male");
        player1.playerPosition("QB");
        player1.gamesPlayed(12);
        player1.gamesStarted(12);
        player1.passesCompleted(291);
        player1.attempts(432);
        player1.yards(3554);
        player1.yardsGained(296.2);
        player1.touchdowns(28);
        player1.interceptions(2);
        player1.longest(79);
        player1.sacked(15);
        player1.insideopponent20(45);
        player1.insideopponent40(8);
        player1.yardsLostToSakes(87);
        player1.rating(112.2);
        
        
        NFLPlayer player2= new NFLPlayer("Matt Ryan");
        player2.playerAge(31);
        player2.playerGender("Male");
        player2.playerPosition("QB");
        player2.gamesPlayed(16);
        player2.gamesStarted(16);
        player2.passesCompleted(373);
        player2.attempts(534);
        player2.yards(4944);
        player2.yardsGained(309.0);
        player2.touchdowns(28);
        player2.interceptions(7);
        player2.longest(76);
        player2.sacked(37);
        player2.insideopponent20(69);
        player2.insideopponent40(17);
        player2.yardsLostToSakes(235);
        player2.rating(117.1);
        
        NFLPlayer player3= new NFLPlayer("Le'Veon Bell");
        player3.playerAge(25);
        player3.playerGender("Male");
        player3.playerPosition("RB");
        player3.gamesPlayed(12);
        player3.gamesStarted(12);
        player3.attempts(261);
        player3.yards(1268);
        player3.touchdowns(7);
        player3.longest(44);
        player3.fumbles(4);
        player3.losts(1);
        
        NFLPlayer player4= new NFLPlayer("Thomas Rawls");
        player4.playerAge(23);
        player4.playerGender("Male");
        player4.playerPosition("RB");
        player4.gamesPlayed(9);
        player4.gamesStarted(7);
        player4.attempts(109);
        player4.yards(349);
        player4.touchdowns(3);
        player4.longest(45);
        player4.fumbles(0);
        player4.losts(0);
        
        NFLPlayer player5= new NFLPlayer("Keanu Neal");
        player5.playerAge(21);
        player5.playerGender("Male");
        player5.playerPosition("SS");
        player5.gamesPlayed(14);
        player5.gamesStarted(14);
        player5.totalTackles(72);
        player5.sakes(0.0);
        player5.fumbles(5);
        player5.playsDefended(9);
        player5.assists(34);
        player5.comb(106);
        
        NFLPlayer player6= new NFLPlayer("Lawrence Timmons");
        player6.playerAge(30);
        player6.playerGender("Male");
        player6.playerPosition("LB");
        player6.gamesPlayed(16);
        player6.gamesStarted(16);
        player6.totalTackles(78);
        player6.sakes(2.5);
        player6.fumbles(1);
        player6.playsDefended(5);
        player6.assists(36);
        player6.comb(114);
        player6.interceptions(2);
        player6.yards(74);
        player6.longest(58);
        player6.touchdowns(0);
        
        
        
		
	}
	

}
