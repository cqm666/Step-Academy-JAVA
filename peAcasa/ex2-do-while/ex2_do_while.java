  
class ex2_do_while {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6};
		
		int n=5;
		int R=0;
		int i=0;
		
		do{
			
			R+=a[i];
			i++;
		}
         while(i<n);		
		System.out.println(R);
    }
}