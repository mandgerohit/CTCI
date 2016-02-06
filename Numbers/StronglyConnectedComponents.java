
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class StronglyConnectedComponents
{
        public static void main (String[] args) throws java.lang.Exception
        {
                int[] a = new int[]{1,0};
                StronglyConnectedComponents s=new StronglyConnectedComponents();
                System.out.println(s.solution(a));
        }
        
        public int solution(int[] A) {
                // write your code in Java SE 8
                if(A.length==0){ 
                    return 0;
                }
                int[] vis= new int[A.length]; int cnt=0;
                        int mx =0;
                        for(int i=0;i<A.length;i++)
                        {
                                        while(vis[i]==0)
                                        {
                                                vis[i] = 1;
                                                cnt++;
                                                i = A[i];
                                        }
                                mx = Math.max(mx, cnt);
                                cnt=0;
                        }
                        return mx;
                
            }
        }