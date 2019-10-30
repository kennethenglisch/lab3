public class ExecutionTime {

	private int n = 10000;
	private long sum = 0;
	
	public static void main(String args[]) 
	{
		ExecutionTime e = new ExecutionTime();
		//long start = System.currentTimeMillis();
		e.frag8();
		//long end = System.currentTimeMillis();
		//double stop = (end-start);
		System.out.println(e.sum);
		
	}
	
	public void frag1() {
		// Fragment #1
		for ( int i = 0; i < n; i ++)
		    sum++;
	}
	
	public void frag2() {
		// Fragment #2
		for ( int i = 0; i < n; i ++)
		    for ( int j = 0; j < n; j ++)
		        sum++;
	}
	
	public void frag3() {
	// Fragment #3
	for ( int i = 0; i < n; i ++)
	    for ( int j = i; j < n; j ++)
	        sum++;
	}

	public void frag4() {
	// Fragment #4
	for ( int i = 0; i < n; i ++)
	    sum ++;
	    for ( int j = 0; j < n; j ++)
	        sum ++;
	}

	public void frag5() {
	// Fragment #5
	for ( int i = 0; i < n; i ++)
	    for ( int j = 0; j < n*n; j ++)
	    	sum++;
	}
	
	public void frag6() {
	// Fragment #6
	for ( int i = 0; i < n; i ++)
	    for ( int j = 0; j < i; j ++)
	        sum++;
	}

	public void frag7() {
	// Fragment #7
	for ( int i = 1; i < n; i ++)
	    for ( int j = 0; j < n*n; j ++)
	        if (j % i == 0)
	           for (int k = 0; k < j; k++)
	               sum++;
	}

	public void frag8() {
	// Fragment #8
	int i = n;
	while (i > 1) {
	    i = i / 2;
	    sum++;
	}
	
	}	
	
}
