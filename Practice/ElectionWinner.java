import java.util.*;
import java.io.IOException;
import java.util.Scanner;

public class ElectionWinner {
	
	static String electionWinner(String[] votes)
	{
		
		HashMap<String, Integer> votes_map = new HashMap<String, Integer>();
		int max_vote = 0;
		for (int i = 0; i <= votes.length - 1; i++) {
			
			if (votes_map.containsKey(votes[i])) {
				int c = votes_map.get(votes[i]);
				votes_map.put(votes[i], c+1);
			} else {
				votes_map.put(votes[i], 1);
			}
			if (votes_map.get(votes[i]) > max_vote) {
				max_vote = votes_map.get(votes[i]);
			}
		}
		
		ArrayList<String> list = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry: votes_map.entrySet()) {
			if (entry.getValue() == max_vote) {
				list.add(entry.getKey());
			}
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		return list.get(0);
		
	}
	

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		String res;
		
		int _votes_size=0;
		_votes_size = Integer.parseInt(in.nextLine().trim());
		String[] _votes = new String[_votes_size];
		String _votes_item;
		for(int _votes_i=0;_votes_i<_votes_size;_votes_i++)
		{
			try{
					_votes_item=in.nextLine();
					
				}
			catch(Exception e)
			{
				_votes_item = null;
			}
			_votes[_votes_i] = _votes_item;
			
		}
		res = electionWinner(_votes);
		System.out.println(res);	
	}
}
