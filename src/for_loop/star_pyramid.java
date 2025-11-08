package for_loop;

public class star_pyramid {
    public static void main(String[] args) {
        int n=6;
        int nst=1;
        int nsp=n-1;
        int let=64;
        for(int i=1; i<=n; i++){
            for(int k=1; k<=nsp; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=nst; j++){
                char ch=(char)(let+j);
                System.out.print(ch);
            }
            System.out.print("\n");
            nst+=2;
            nsp--;
        }
    }
}
