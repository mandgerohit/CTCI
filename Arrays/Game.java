import java.io.*;
import java.util.*;

public class Game implements Comparable<Game>{
	
	private String home=null;
	private String away=null;
	private int homeScore=0;
	private	int awayScore=0;

	public Game(String home, String away, int homeScore, int awayScore){
	
		this.home=home;
		this.away=away;	
		this.homeScore=homeScore;
		this.awayScore=awayScore;
	}

	public String whoWins(){
		
		if(this.homeScore==this.awayScore) return null;
		
		return this.homeScore<this.awayScore? away: home;
	}
	
	public String getHome(){
		return this.home;
	}

	public String getAway(){
		return this.away;
	}

	public int getHomeScore(){
		return this.homeScore;
	}

	public int getAwayScore(){
		return this.awayScore;
	}	
	
	public int bestScore(){
		return Math.abs(this.homeScore-this.awayScore);
	}
	
	public int compareTo(Game opponent) {
	    int comparescore=((Game)opponent).bestScore();
	        /* For Ascending order*/
	    return comparescore-this.bestScore();
	}
}