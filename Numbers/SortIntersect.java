import java.util.ArrayList;
import java.util.Arrays;

public class SortIntersect
{
	@SuppressWarnings("unchecked")
	public static int[] sortedIntersect(int f[], int m[])
	{
		@SuppressWarnings("rawtypes")
		ArrayList ar = new ArrayList();
		
		Arrays.sort(f);
		Arrays.sort(m);
		int j = 0;
		for(int i = 0 ;i<f.length&&j<m.length;)
		{
			if(f[i]==m[j])
			{
				ar.add(f[i]);
				i++;j++;
			}
			else if(f[i]<m[j])
			{
				i++;
			}
			else if(f[i]>m[j])
			{
				j++;
			}
		}
		int c[] = new int[ar.size()];
		int k=0;
		for(int i = ar.size()-1;i>=0;i--)
		{
			c[k] = (int) ar.get(i);
			k++;
		}
		return c;
	}
	public static void main(String[] args)
	{
		int f[] = {9,19,18,1,1,2,2,3,4,5,6,7,8,8,8};
		int m[] = {1,2,3,8,9,10,2,5,8};
		int c [] = sortedIntersect(f,m);
		for(int i = 0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}