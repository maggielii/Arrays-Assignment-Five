package code;

public class arrayAssignmentFive {
	
	public static void grid(int[] array)
	{
		for (int x = 0; x < 400; x+=20)
		{
			for (int y = x; y < 20+x; y++)
			{
				System.out.print(array[y]);
				
				if(array[y] < 10)
					System.out.print("    ");
				if(array[y] <= 99 && array[y] >= 10)
					System.out.print("   ");
				if(array[y] == 100) 
					System.out.print("  ");
			}
			
			System.out.println(" ");
			System.out.println(" ");
		}
	}
	
	public static int maxTotal(int[] array)
	{
		int indexX = 0;
		int indexY = 0;
		int total = 0;
		int maxTotal = 0;
		
		for (int downBox = 0; downBox < 18; downBox++)
		{
			for (int sideBox = 0; sideBox < 18; sideBox++)
			{
				total = 0;
				
				for (int downThree = downBox; downThree < 3 + downBox; downThree++)
				{
					for (int sideThree = sideBox; sideThree < 3 + sideBox; sideThree++)
					{
						total += array[20*downThree + sideThree];
					}
				}
				
				if(total > maxTotal)
				{
					maxTotal = total;
					indexX = sideBox;
					indexY = downBox;
				}
			}
		}
		
		System.out.println("(" + indexX + "," + indexY + ")");
		
		return maxTotal;
	}
					
	public static void main(String[] args) {
		
		int[] array = new int[400];

		for (int x = 0; x < 400; x++)
		{
			array[x] = (int)(Math.random()*(102)-1);
		}
		
		grid(array);
		
		maxTotal(array);
		
	}

}
