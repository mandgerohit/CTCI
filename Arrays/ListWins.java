import java.io.*;
import java.util.*;


public class ListWins{
	
	public HashMap<String, Game> maxWin(ArrayList<Game> games){
		
		HashMap<String, Game> match=new HashMap<String, Game>();
			
		int localBestScore=0;
		for(int i=0;i<=games.size()-1;i++){
			
			Game now=games.get(i);
			localBestScore=now.bestScore();
			String winner=now.whoWins();
			if(match.containsKey(winner)){
				if(localBestScore>match.get(winner).bestScore()){
					match.put(winner, now);
				}
			}
			else{
				match.put(winner, now);
			}
		}
		return match;

	}

	public HashMap<String, ArrayList<Game>> multipleWins(ArrayList<Game> games, int n){
		
		HashMap<String, ArrayList<Game>> match=new HashMap<String, ArrayList<Game>>();	

		for(int i=0;i<=games.size()-1;i++){
			
			Game now=games.get(i);
			String winner=now.whoWins();
			
			if(winner!=null){
				if(match.containsKey(winner)){	
					ArrayList<Game> temp=match.get(winner);
					temp.add(now);
					match.put(winner, temp);
				}
				else{
					ArrayList<Game> temp=new ArrayList<Game>();
					temp.add(now);
					match.put(winner, temp);
				}
			}
		}
		
		for(Map.Entry<String, ArrayList<Game>> e:match.entrySet() ){
			
			ArrayList<Game> g=e.getValue();
			Collections.sort(g);
			match.put(e.getKey(), g);
		}
		return match;

	}
	
	
	public void print(HashMap<String, Game> arr){
		
		for(Map.Entry<String, Game> map: arr.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue().getHome()+"("+map.getValue().getHomeScore()+")"+" "+map.getValue().getAway()+"("+map.getValue().getAwayScore()+")");
		}
	}

	public void printMult(HashMap<String, ArrayList<Game>> arr){
		
		for(Map.Entry<String, ArrayList<Game>> map: arr.entrySet()){
			ArrayList<Game> games=map.getValue();
			for(int i=0;i<=games.size()-1;i++){
			System.out.println(map.getKey()+" "+games.get(i).getHome()+"("+games.get(i).getHomeScore()+")"+" "+games.get(i).getAway()+"("+games.get(i).getAwayScore()+")");
			}
		}
	}

	public static void main(String[] args)throws IOException{
		
		ArrayList<Game> list=new ArrayList<Game>();		
		ListWins l=new ListWins();
		
		Game g1=new Game("India", "Aus", 300, 250);
		Game g2=new Game("India", "Aus", 325, 300);
		Game g3=new Game("Aus", "India", 400, 200);
		Game g4=new Game("Aus", "India", 350, 350);
		Game g5=new Game("Aus", "India", 280, 300);

		list.add(g1);list.add(g2);list.add(g3);list.add(g4);list.add(g5);
		
		//l.print(l.maxWin(list));
		l.printMult(l.multipleWins(list, 2));
	}	

}