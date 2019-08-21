class Ragni_java_20Aug_Q6{
           public static void main(String[] args) {
            	int num=Integer.parseInt(args[0]);
				int dec=num;
				String flag="";
	
				while(dec>0){
					int a=dec%2;
					flag=a+flag;
					dec=dec/2;
				}
				System.out.println(flag);
          }
}