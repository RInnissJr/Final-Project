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
		InsideOpponent40 = io40;
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
	String gender;
	String position;//
	int gamesPlayed;
	int gamesStarted;
	int uniformNumber;
	double averageValue;
	double passesComplete;
	double passesAttempt;
	double touchdownPasses;
	double interceptionsThrown;
	double sacked;
	double fumbles;
	double rating;
	double yardsGained;
	double yardsLostToSack;
	double attempts;
	double yards;
	double longest;
	double touchDowns;
	double lost;
	double totalTackles;
	double sakes;
	double saftey;
	double passesDefended;
	double interception;
	double insideopponent20;
	double insideopponent40;
	double playsdefended;
	double assists;
	double comb;
	
	

public void userInternalDatabase (PlayerManager info) 
{
    this.playername = info.playername;
    this.age = info.age;
    this.height = info.height;
    this.gender= info.gender;
    this.position=info.position;
    this.gamesPlayed=info.gamesPlayed;
    this.gamesStarted=info.gamesStarted;
    this.uniformNumber=info.uniformNumber;
    this.averageValue=info.averageValue;
    this.passesComplete=info.passesComplete;
    this.passesAttempt=info.passesAttempt;
    this.touchdownPasses=info.touchdownPasses;
    this.interceptionsThrown=info.interceptionsThrown;
    this.sacked=info.sacked;
    this.fumbles=info.fumbles;
    this.rating=info.rating;
    this.yardsGained=info.yardsGained;
    this.yardsLostToSack=info.yardsLostToSack;
    this.attempts=info.attempts;
    this.yards=info.yards;
    this.longest=info.longest;
    this.totalTackles=info.totalTackles;
    this.sakes=info.sakes;
    this.saftey=info.saftey;
    this.passesDefended=info.passesDefended;
    this.interception= info.interception;
    this.insideopponent20=info.insideopponent20;
    this.insideopponent40=info.insideopponent40;
    this.playsdefended=info.playsdefended;
    this.assists=info.assists;
    this.comb=info.comb;
}

ArrayList<PlayerManager> InfoList = new ArrayList<PlayerManager> ();

public void addUser(String pn, int ag, double hei, String gen, String pos, int gp, int gs, int ufn,
double av, double pc, double pa, double tdp, double ict, double sc, double fmb, double rt, double ydg,
double ydlts, double att, double yds, double lng, double tt,double sks, double saf, double pssdef,
double inter, double inso20, double inso40, double pd, double asis, double com)
{
	PlayerManager newUser = new PlayerManager();
    newUser.playername = pn;
    newUser.age = ag;
    newUser.height = hei;
    newUser.gender=gen;
    newUser.position=pos;
    newUser.gamesPlayed=gp;
    newUser.gamesStarted=gs;
    newUser.uniformNumber=ufn;
    newUser.averageValue=av;
    newUser.passesComplete=pc;
    newUser.passesAttempt=pa;
    newUser.touchdownPasses=tdp;
    newUser.interceptionsThrown=ict;
    newUser.sacked=sc;
    newUser.fumbles=fmb;
    newUser.rating=rt;
    newUser.yardsGained=ydg;
    newUser.yardsLostToSack=ydlts;
    newUser.attempts=att;
    newUser.yards=yds;
    newUser.longest=lng;
    newUser.totalTackles=tt;
    newUser.sakes=sks;
    newUser.saftey=saf;
    newUser.passesDefended=pssdef;
    newUser.interception= inter;
    newUser.insideopponent20=inso20;
    newUser.insideopponent40=inso40;
    newUser.playsdefended=pd;
    newUser.assists=asis;
    newUser.comb=com;
    InfoList.add(newUser);
}
public ArrayList<PlayerManager> getUser()
{
	return InfoList;
}
public Object findUsername(String a)  
{    
    for (int i=0; i <InfoList.size(); i++)
    {
        if (InfoList.get(i).playername.equals(a))
        {
             return "This user already exists in our database.";
        }
    }
    return "User is not founded."; 
}
}

	
	
	
