import java.io.*;
import java.util.*;

public class TopKElementsMinHeap {
	
private int heapsize=0;
	
	public int left(int i){
		
		return 2*i+1;
	}
	
	public int right(int i){
		
		return 2*i+2;
	}
	
	public void heapify(int[] a, int i){
		
		int l=left(i);
		int r=right(i);
		int smallest=i;
		
		if(l<heapsize && a[l]<a[i]){
			smallest=l;
		}
		else{
			smallest=i;
		}
		if(r<heapsize && a[r]<a[smallest]){
			smallest=r;
		}
		
		if(smallest!=i){
			int temp=a[smallest];
			a[smallest]=a[i];
			a[i]=temp;
			
			heapify(a, smallest);
		}
		
	}
	
	public void buildHeap(int[] a){
		
		heapsize=a.length;
		
		for(int i=(int)Math.floor(a.length/2);i>=0;i--){
			
			heapify(a, i);
		}
		
	}
	
	public void print(int[] temp){
		
		for(int i=0;i<=temp.length-1;i++){
			System.out.print(temp[i]+" ");
		}
	}
	
	public void sortK(int[] a, int k){
		
		int[] temp=new int[k];
		
		for(int i=0;i<=k-1;i++){
			temp[i]=a[i];
		}

		//System.out.print(temp.length+" ");
		buildHeap(temp);
		
		for(int i=k;i<=a.length-1;i++){
			if(a[i]>temp[0]){	
				//System.out.print(temp[0]+" ");
				temp[0]=a[i];
				//System.out.println(temp[0]);
				heapify(temp, 0);
			}
		}
		print(temp);
	}
	
	public static void main(String[] args)throws IOException{
		
		int[] a={2,4,15,6,4,30,3,2,10,11,21,25};
		
		TopKElementsMinHeap h=new TopKElementsMinHeap();
		h.sortK(a, 3);
	}

}
