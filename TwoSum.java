import java.util.*;
class TwoSum{
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int complement=target-nums[i];
        while(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }
        map.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array :");
        int n=sc.nextInt();
        System.out.println("Enter a target value :");
        int target=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter an array Elements :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
          TwoSum ts=new TwoSum();
         int[] res= ts.twoSum(nums,target);
         if(res.length>0){
            System.out.println("Indices :"+res[0]+","+res[1]);
         }
         else{
            System.out.println("Not found");
         }
    }
}