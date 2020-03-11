public class bubbleSort {
    public static void main(String[] args) {
        int[] n={70,61,72,83,38 };
        bubbleSort b=new bubbleSort();
        b.Sort(n);
    }
    public void Sort(int[] interger){
        int n=interger.length;
        for(int i =0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(interger[j]>interger[j+1]){
                   int x=interger[j];
                   interger[j]=interger[j+1];
                   interger[j+1]=x;
                }
            }
        }

        for(int q=0;q<n;q++) {
            if(q==0){
                System.out.print("int[");
            }
            System.out.print(interger[q]);
            if(q==n-1){
                System.out.println("]");
            }else{
                System.out.print(",");
            }
        }
    }
}
