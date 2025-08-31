/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    const ans = new Array(nums.length).fill(0)

    let prev = 1, next = 1;

    for(let i=0;i<nums.length;i++){
        ans[i] = prev;
        prev = prev*nums[i];
    }

    for(let i=nums.length-1;i>=0;i--){
        ans[i] = ans[i]*next;
        next = next*nums[i];
    }

    return ans;
};