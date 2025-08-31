/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    const freqMap = new Map();

    for(let num of nums){
        freqMap.set(num,(freqMap.get(num)||0)+1);
    }

    const sorted = Array.from(freqMap.entries()).sort((a,b)=>{
        if(b[1]!=a[1])return b[1]-a[1];
        return b[0]-a[0];
    });

    return sorted.slice(0,k).map(entry=>entry[0]);


};