import java.io.*;

public class HeapSort {
	
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
		int largest=i;
		
		if(l<heapsize && a[l]>a[i]){
			largest=l;
		}
		else{
			largest=i;
		}
		if(r<heapsize && a[r]>a[largest]){
			largest=r;
		}
		
		if(largest!=i){
			int temp=a[largest];
			a[largest]=a[i];
			a[i]=temp;
			
			heapify(a, largest);
		}
		
	}
	
	public void buildHeap(int[] a){
		
		heapsize=a.length;
		
		for(int i=(int)Math.floor(a.length/2);i>=0;i--){
			
			heapify(a, i);
		}
		
	}
	
	public void print(int[] a){
		
		for(int i=0;i<=a.length-1;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public void sort(int[] a){
		
		buildHeap(a);
		for(int i=a.length-1;i>=1;i--){
			
			int temp=a[i];
			a[i]=a[0];
			a[0]=temp;
			
			heapsize=heapsize-1;
			
			heapify(a, 0);
		}
		print(a);
	}
	
	public static void main(String[] args)throws IOException{
		
		int[] a={2,4,1,6,4,3,2};
		
		HeapSort h=new HeapSort();
		h.sort(a);
	}

}
