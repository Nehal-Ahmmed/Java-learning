public class javapro{
	public static void main(String[] args){
		System.out.println("My name is Nehal Ahmmed Bhuiyan.");
		int n=5;
		for(int i=0; i<n; i++){
			boolean bol=false;
			if(i==1) bol=false;
			else if(i%2==0){bol=true;}
			System.out.printf("the number %d is even number : %b ",i,bol);
			System.out.println();
		}
	}


}