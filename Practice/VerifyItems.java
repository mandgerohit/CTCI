import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VerifyItems {
	
	static int verifyItems(String[] origItems,float[] origPrices, String[] items, float[] prices) {
		return 0;
		
	}

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		final String fileName= System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		int res;
		
		int _origItems_size=0;
		_origItems_size= Integer.parseInt(in.nextLine().trim());
		String[] _origItems= new String[_origItems_size];
		String _origItems_item;
		for ( int _origItems_i=0;_origItems_i<_origItems_size;_origItems_i++) {
			try{
				_origItems_item=in.nextLine();
				
			}
		catch(Exception e)
		{
			_origItems_item = null;
		}
			_origItems[_origItems_i] = _origItems_item;
		}
		
		int _origPrices_size=0;
		_origPrices_size= Integer.parseInt(in.nextLine().trim());
		float[] _origPrices= new float[_origPrices_size];
		float _origPrices_item;
		for ( int _origPrices_i=0;_origPrices_i<_origPrices_size;_origPrices_i++)
		{
			
				_origPrices_item=Float.parseFloat(in.nextLine().trim());		
				_origPrices[_origPrices_i] = _origPrices_item;
		}
		
		
		int _items_size=0;
		_items_size= Integer.parseInt(in.nextLine().trim());
		String[] _items= new String[_items_size];
		String _items_item;
		for ( int _items_i=0;_items_i<_items_size;_items_i++)
		{
			try{
				_items_item=in.nextLine();
				
			}
		catch(Exception e)
		{
			_items_item = null;
		}
			_items[_items_i] = _items_item;
		}
		
		int _prices_size=0;
		_prices_size= Integer.parseInt(in.nextLine().trim());
		float[] _prices= new float[_prices_size];
		float _prices_item;
		for ( int _prices_i=0;_prices_i<_prices_size;_prices_i++)
		{
			
				_prices_item=Float.parseFloat(in.nextLine().trim());		
				_prices[_prices_i] = _prices_item;
		}
		
		res = verifyItems(_origItems,_origPrices,_items,_prices);
		bw.write(String.valueOf(res));
		bw.newLine();
		bw.close();
		
	}

}
