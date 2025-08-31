import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length){
            return nums;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> map.get(a)-map.get(b)
        );

        for(int n: map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] ans = new int[k];
        
        for(int i=0;i<k;i++){
            ans[i] = heap.poll();
        }

        return ans;

    }
}