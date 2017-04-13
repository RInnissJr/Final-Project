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


public class NFLPlayer
{
   abstract class nflPlayer
   {
	String Name;
	int PlayerAge;
	String gender;
	String position;
	int GamesPlayed;
	double Sacked;
	double AverageValue;
	double Fumbles;
	int UniformNumber;
	double Rating;
	int GamesStarted;
	double Attempts;
	double Yards;
	double Average;
	double Touchdowns;
	double TotalTackles;
	double Sakes;
	double Saftey;
	double PassesDefended;
	double Interceptions;
	double InsideOpponent20;
	double InsideOpponent40;
	double PlaysDefended;
	double Assists;
	double Comb;
	double Longest;
	double Lost;
   }

 public class offensivePlayer extends nflPlayer
{
	 public void name(String nme) 
	 {
	      Name= nme;
	 }
	 public void playerAge( int age ) 
	 {
	      PlayerAge = age;
	 }
	
	public void playerGender(String pg) 
	{
	   gender = pg;
	}
	
	public void playerPosition(String pp) 
	{
	   position = pp;
	}
	
	public void gamesPlayed(int gp) 
	{
	      GamesPlayed = gp;
	}
	
	public void gamesStarted(int gs) 
	{
	      GamesStarted = gs;
	}

	public void uniformNumber(int uf) 
	{
	      UniformNumber = uf;
	}

	public void averageValue(double av) 
	{
	      AverageValue = av;
	}
	 public void sacked(double sk) 
		{
		      Sacked = sk;
		}
	 public void fumbles(double fmb) 
		{
		      Fumbles = fmb;
		}
	 public void rating(double rt) 
		{
		      Rating = rt;
		}
		public void lost(double lo) 
		{
		      Lost = lo;
		}
		public void attempts(double atm) 
		{
		      Attempts = atm;
		}
		public void longest(double lng) 
		{
		      Longest = lng;
		}
		public void yards(double yrd) 
		{
		      Yards = yrd;
		}
	 public void average(double avr) 
		{
		      Average = avr;
		}
	 public void touchdowns(double td) 
		{
		      Touchdowns = td;
		}
		public void interceptions(double inter) 
		{
		      Interceptions = inter;
		}
	   public void assists(double ast) 
		{
			Assists = ast;
		}
		public void comb(double cmb) 
		{
			Comb = cmb;
		}	 
}
public class defensivePlayer extends nflPlayer
{
	 public void name(String nme) 
	 {
	      Name= nme;
	 }
	 public void playerAge( int age ) 
	 {
	      PlayerAge = age;
	 }
	
	public void playerGender(String pg) 
	{
	   gender = pg;
	}
	
	public void playerPosition(String pp) 
	{
	   position = pp;
	}
	
	public void gamesPlayed(int gp) 
	{
	      GamesPlayed = gp;
	}
	
	public void gamesStarted(int gs) 
	{
	      GamesStarted = gs;
	}

	public void uniformNumber(int uf) 
	{
	      UniformNumber = uf;
	}

	public void averageValue(double av) 
	{
	      AverageValue = av;
	}
	public void attempts(double atm) 
	{
	      Attempts = atm;
	}
	public void yards(double yrd) 
	{
	      Yards = yrd;
	}
	public void average(double avr) 
	{
	      Average = avr;
	}
	public void touchdowns(double td) 
	{
	      Touchdowns = td;
	}
	public void totalTackles(double tt) 
	{
	      TotalTackles = tt;
	}
	public void sakes(double sk) 
	{
	      Sakes = sk;
	}
	public void saftey(double sft) 
	{
	      Saftey = sft;
	}
	public void passesdefended(double pd) 
	{
	      PassesDefended = pd;
	}
	public void insideopponent20(double io20) 
	{
		InsideOpponent20 = io20;
	}
	public void insideopponent40(double io40) 
	{
		InsideOpponent40 = io40;
	}
	public void playsDefended(double pdef) 
	{
		PlaysDefended = pdef;
	}
	public void assists(double ast) 
	{
		Assists = ast;
	}
}
abstract class playerManager{
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
	

ArrayList<PlayerManager> InfoList = new ArrayList<PlayerManager> ();
public class offensivePlayer extends playerManager
{
public void addUser(String pn, int ag, double hei, String gen, String pos, int gp, int gs, int ufn,
double av, double sc, double fmb, double rt, double att, double yds, double lng, double tt,double sks, double saf,
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
    newUser.sacked=sc;
    newUser.fumbles=fmb;
    newUser.rating=rt;
    newUser.attempts=att;
    newUser.yards=yds;
    newUser.longest=lng;
    newUser.totalTackles=tt;
    newUser.sakes=sks;
    newUser.saftey=saf;
    newUser.interception= inter;
    newUser.insideopponent20=inso20;
    newUser.insideopponent40=inso40;
    newUser.playsdefended=pd;
    newUser.assists=asis;
    newUser.comb=com;
    InfoList.add(newUser);
}
}
public class defensivePLayer extends playerManager
{
public void addUser(String pn, int ag, double hei, String gen, String pos, int gp, int gs, int ufn,
double av, double sc, double fmb, double rt, double att, double yds, double lng, double tt,double sks, double saf,
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
    newUser.sacked=sc;
    newUser.fumbles=fmb;
    newUser.rating=rt;
    newUser.attempts=att;
    newUser.yards=yds;
    newUser.longest=lng;
    newUser.totalTackles=tt;
    newUser.sakes=sks;
    newUser.saftey=saf;
    newUser.interception= inter;
    newUser.insideopponent20=inso20;
    newUser.insideopponent40=inso40;
    newUser.playsdefended=pd;
    newUser.assists=asis;
    newUser.comb=com;
    InfoList.add(newUser);
}
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
}
}
	
	
	
