import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main {
    static int curSaveCount = 0;
    static int targetSaveCount = 0;
    static int[] tmp = new int[500000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = br.readLine().split(" ");
        int numCount = Integer.parseInt(inputs[0]);
        targetSaveCount = Integer.parseInt(inputs[1]);
        
        int[] arr = new int[numCount];
        String[] data = br.readLine().split(" ");

        for(int i=0;i<numCount;i++){
            arr[i] = Integer.parseInt(data[i]);
        }
        MergeSort(arr, 0, numCount - 1);
        System.out.println(-1);
   
        
        br.close();
    }
    
    public static void MergeSort(int[] arr, int p, int r){
        if(p < r){
            int q = (p+r)/2;
            MergeSort(arr, p, q);
            MergeSort(arr, q+1, r);
            Merge(arr, p, q, r);
        }
    }
    
    public static void Merge(int[] arr, int p, int q, int r){
        int i = p;
        int j = q + 1;
        int t = p;
       
        while(i <= q && j <= r){
            if(arr[i] < arr[j]){
                tmp[t++] = arr[i++]; 
            }else{
                tmp[t++] = arr[j++];
            } 
        }
        while(i <= q){
            tmp[t++] = arr[i++];
        }
        while(j <= r){
            tmp[t++] = arr[j++];
        }
        i = p;
        while(i<=r){
            arr[i] = tmp[i++];
            if(++curSaveCount == targetSaveCount){
                System.out.println(arr[i-1]);
                System.exit(0);
            }
        }
    }
}