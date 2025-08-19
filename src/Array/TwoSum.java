package Array;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int ans[] = twosum(arr,18);
        for (int i = 0; i < ans.length ; i++) {
            System.out.println(ans[i]);
        }

    }
    private static int[] twosum(int[] arr, int target) {
       int size = arr.length;
       int ans[]=new int[2];
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j <size ; j++) {
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
                
            }
        }
        return ans;
    }
}
