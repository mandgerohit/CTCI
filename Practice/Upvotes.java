import java.io.*;
import java.util.*;
public class Upvotes {

	public static void main(String[]args) throws IOException
	{
		HashMap<Integer, Integer> dlist=new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> ilist=new HashMap<Integer, Integer>();
		//System.out.println("Enter a value");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int var[]=new int[N];
		if(N<=100000 && N>0 && K<=N && K>0){
			for(int i=0;i<=N-1;i++){
				var[i]=sc.nextInt();
			}
		}
		else{
			return;
		}
		sc.close();
		int[] nd=new int[N];
		int[] ni=new int[N];

		for(int n=0;n<=N-K;n++){
			int totalni=0;
			int totalnd=0;
			for(int k=n;k<=n+K-2;k++){
				int i=k+1;
				int j=k+1;
				while(i<=n+K-1){
					//System.out.println(nd[k]);
					if(var[i-1]<=var[i] && var[k]<=var[i] && !dlist.containsKey(k)){
						//System.out.println(k+" "+i+" "+var[i]);
						//nd[k]=nd[k]+1;
						i++;
						dlist.put(k, dlist.get(k)+1);
						//System.out.println("Value of nd: "+nd[k]);
					}
					else{ 
						//System.out.println("nd breaks for "+var[k]);
						break;
					}
				}
				
				
				while(j<=n+K-1){
					if(var[j-1]>=var[j] && var[k]>=var[j] && !ilist.containsKey(k)) {
						//System.out.println(k+" "+j+" "+var[j]);
						//ni[k]=ni[k]+1;
						j++;
						ilist.put(k, ilist.get(k)+1);
						//System.out.println("Value of ni: "+ni[k]);
					}
					else{
						//System.out.println("ni breaks for "+var[k]);
						break;
					}
				}
			}
			for(int i=n;i<=n+K-2;i++){
				//System.out.println(totalnd);
				totalnd=totalnd+dlist.get(i);
				totalni=totalni+ilist.get(i);
			}
			System.out.println("Totalnd: "+(totalnd));
			System.out.println("Totalni: "+(totalni));
			System.out.println(totalnd-totalni);
		}
	}
	
}