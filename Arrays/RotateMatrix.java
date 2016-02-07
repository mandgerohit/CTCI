import java.io.*;

public class RotateMatrix {
	
	public void rotate(int[][] image, int n){
		
		for(int level=0;level<n/2;++level)
		{
			int first=level;
			int last=n-1-level;
			
			for(int i=first;i<last;++i){
				
				int offset=i-first;
				
				//save top
				int top=image[first][i];
				
				//left to top
				image[first][i]=image[last-offset][first];
				
				//bottom to left
				image[last-offset][first]=image[last][last-offset];
				
				//right to bottom
				image[last][last-offset]=image[i][last];
				
				//top to right
				image[i][last]=top;
			}
			
		}
	}
	
	public void print(int[][] m){
		
		for(int i=0;i<=3;i++){
			System.out.print("\n");
			for(int j=0;j<=3;j++){
				System.out.print(m[i][j]+" ");
			}
		}
	}
	
	public static void main(String[] args)throws IOException{
		
		int[][] image=new int[4][4];
		int k=1;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				image[i][j]=k;
				k++;
			}
		}
		RotateMatrix r=new RotateMatrix();
		r.print(image);
		r.rotate(image, 4);
		r.print(image);
		
	}

}
