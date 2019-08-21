class Ragni_java_21Aug_Q3{
	public static void main(String[] args) {
		 int[] a={56, 33, 222, -9, 6};
		 int n=a.length;
		 int temp;
		 temp=a[0];
		 int i;
	     for(i=0;i<n-1;i++)
	     {
	       a[i]=a[i+1];
	     }
	     a[n-1]=temp;

	     for(i=0;i<n;i++)
	     {
	       System.out.print(a[i]+" ");
	     }
	}
}