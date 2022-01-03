  
class ex2_while {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6};
		
		int n=3;
		int R=0;
		int i=0;
		while(i<n){
			
			R+=a[i];
			i++;
		}	
		System.out.println(R);
    }
}