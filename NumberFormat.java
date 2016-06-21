//Handle NumberFormat Exception. For example the statement int num=Integer.parseInt ("XYZ"); 
//would throw NumberFormatException because String â€œXYZâ€• cannot be parsed to int. So 
//handle it 

public class NumberFormat 
	{
		public static void main(String[] args) {
			
		int a;	
		try
		{	
		a=Integer.parseInt(null);
		System.out.println(a);
		}
		catch(NumberFormatException e)
		{
	        System.out.println("Warning: NumberFormatException.");
	     }

	}
	}



