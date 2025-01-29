public class CountProblem2{
    public static void main(String[] args) {
        int L=10;
        int R=30;
        System.out.println(countP(L,R));
    }
    public static int countP(int L,int R){
        int[]prime=new int[R+1];
        for(int i=0;i<=R;i++){
            prime[i]=1;
        }
        prime[0]=prime[1]=0;
        for(int i=2;i*i<=R;i++){
            if(prime[i]==1){
                for(int j=i*i;j<=R;j+=i){
                    prime[j]=0;
                }
            }
        }
        int count=0;
        for(int i=L;i<=R;i++){
            if(prime[i]==1){
                count++;
            }
        }
        return count;
    }
}