import java.util.Scanner;

public class Resolution{
    
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int N, K;
    N = in.nextInt();
    
    int C[] = new int[N];
    for(int i=0; i<N; i++){
        C[i] = in.nextInt();
        }
    int res[] = new int[N];
    for(int i=0 ; i < N ;i++) res[i] =1 ;
    int d = N ;
    while(d <= N ){
        
        boolean changed = false; 
        for(int i=1 ; i < N ;i++){
            if(C[i-1] < C[i] && res[i-1] >= res[i] ){
                res[i] = res[i-1] +1 ;
                changed = true;
            }
        }
        for(int i=N-1 ; i > 0 ;i--){
            if(C[i-1] > C[i] && res[i-1] <= res[i] ){
                res[i-1] = res[i] +1 ;
                changed = true;
            }
        }
        if(!changed)break;
    }
    int sum = 0;
    for(int j : res ) sum += j;
    System.out.println(sum);
}
}
              