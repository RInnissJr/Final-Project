/**
 * 
 */
/**
 * @author RIcardo Inniss
 *
 */
package ToolKit;
import java.util.ArrayList;
import java.util.List; 
import ToolKit.PlayerManager;

public class NFLPlayer
{
	String name;
	 public NFLPlayer(String name) 
	 {
	      this.name= name;
	  }
	int PlayerAge;
	 public void playerAge( int age ) 
	 {
	      PlayerAge = age;
	 }
	String gender;
	public void playerGender(String pg) 
	{
	   gender = pg;
	}
	String position;
	public void playerPosition(String pp) 
	{
	   position = pp;
	}
	int GamesPlayed;
	public void gamesPlayed(int gp) 
	{
	      GamesPlayed = gp;
	}
	int GamesStarted;
	public void gamesStarted(int gs) 
	{
	      GamesStarted = gs;
	}
	int UniformNumber;
	public void uniformNumber(int uf) 
	{
	      UniformNumber = uf;
	}
	double AverageValue;
	public void averageValue(double av) 
	{
	      AverageValue = av;
	}
	double PassesCompleted; // quarterback
	public void passesCompleted(double pc) 
	{
	      PassesCompleted = pc;
	}
	double PassesAttempted;
	public void passesAttempted(double pa) 
	{
	      PassesAttempted = pa;
	}
	double PassesTouchdown;
	public void passesTouchdown(double pt) 
	{
	      PassesTouchdown = pt;
	}
	double InterceptionsThrown;
	public void interceptionsThrown(double it) 
	{
	      InterceptionsThrown = it;
	}
	double Sacked;
	public void sacked(double sk) 
	{
	      Sacked = sk;
	}
	double Fumbles;
	public void fumbles(double fmb) 
	{
	      Fumbles = fmb;
	}
	double Rating;
	public void rating(double rt) 
	{
	      Rating = rt;
	}
	double YardsGained;
	public void yardsGained(double yg) 
	{
	      YardsGained = yg;
	}
	double YardsLostToSakes;
	public void yardsLostToSakes(double ylts) 
	{
	      YardsLostToSakes = ylts;
	}// quarterback
	double Attempts;
	public void attempts(double atm) 
	{
	      Attempts = atm;
	}
	double Yards;
	public void yards(double yrd) 
	{
	      Yards = yrd;
	}
	double Average;
	public void average(double avr) 
	{
	      Average = avr;
	}
	double Longest;
	public void longest(double lng) 
	{
	      Longest = lng;
	}
	double Touchdowns;
	public void touchdowns(double td) 
	{
	      Touchdowns = td;
	}
	double Losts;
	public void losts(double lst) 
	{
	      Losts = lst;
	}
	double TotalTackles;
	public void totalTackles(double tt) 
	{
	      TotalTackles = tt;
	}
	double Sakes;
	public void sakes(double sk) 
	{
	      Sakes = sk;
	}
	double Saftey;
	public void saftey(double sft) 
	{
	      Saftey = sft;
	}
	double PassesDefended;
	public void passesdefended(double pd) 
	{
	      PassesDefended = pd;
	}
	double Interceptions;
	public void interceptions(double inter) 
	{
	      Interceptions = inter;
	}
	double InsideOpponent20;
	public void insideopponent20(double io20) 
	{
		InsideOpponent20 = io20;
	}
	double InsideOpponent40;
	public void insideopponent40(double io40) 
	{
		InsideOpponent20 = io40;
	}
	double PlaysDefended;
	public void playsDefended(double pdef) 
	{
		PlaysDefended = pdef;
	}
	double Assists;
	public void assists(double ast) 
	{
		Assists = ast;
	}
	double Comb;
	public void comb(double cmb) 
	{
		Comb = cmb;
	}
	}
class PlayerManager 
{
	String playername;
	int age;
	double height;

public void userInternalDatabase (PlayerManager info) {
    this.playername = info.playername;
    this.age = info.age;
    this.height = info.height;
}
ArrayList <PlayerManager> InfoList = new ArrayList<PlayerManager> ();

public void addUser(String i, int j, double k)
{
	PlayerManager newUser = new PlayerManager();
    newUser.playername = i;
    newUser.age = j;
    newUser.height = k;
    InfoList.add(newUser);
}

public Object findUsername(String a)  
{    
    for (int i=0; i <InfoList.size(); i++) {
        if (InfoList.get(i).playername.equals(a)){
             return "This user already exists in our database.";
        }
    }
    return "User is not founded."; 
}
}

	
	
	
