class A
{

	public static void main(String args[])
	{
		int fun=0,sum=0,total=0;
		int a[][] = {
						{45,87,89},
						{45,21,56}

		     		};
		int b[][] = {
						{58,78,96},
						{15,65,36}
					};


		for(int r=0; r<2; r++)
		{
			for(int c=0; c<3; c++)
			{
				fun = fun+a[r][c];
			}
		}
			//System.out.println(a[r][c]);
			System.out.println("Total Output of matrix a = "+fun);

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				sum = sum+b[i][j];
			}
		}
			System.out.println("Total Output of matrix b = "+sum);


		total = fun+sum;
		System.out.println("Total Output Of Matrix a and b = "+total);	
	}
}