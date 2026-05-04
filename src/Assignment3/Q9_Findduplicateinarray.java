package Assignment3;

public class Q9_Findduplicateinarray {
    public static void main(String[] args){
        int[] nums = {4, 2, 7, 2, 9, 4, 1, 7, 4};
        boolean [] visited=new boolean[nums.length];

        for(int i=0; i<nums.length;i++){
            int dup_count=1;
            if(visited[i]==true){
                continue;
            }

            int val=nums[i];

            for(int j=i+1; j< nums.length;j++){
                if(nums[i]==nums[j]){
                    dup_count++;
                    visited[j]=true;
                }

            }

            if(dup_count>1){
                System.out.println(val+ " appears" + dup_count+ "times (duplicate)");
            }
        }

    }




}