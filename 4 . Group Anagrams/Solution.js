/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    if(strs.length==0){
        return [[]];
    }

    const ansMap = new Map();

    for(s of strs){
        const count = new Array(26).fill(0);

        for(c of s){
            count[c.charCodeAt(0)-'a'.charCodeAt(0)]++;
        }

        let sb = "";

        for(let i=0;i<26;i++){
            sb+="#";
            sb+=String(count[i]);
        }

        if(!ansMap.has(sb)){
            ansMap.set(sb,[]);
        }

        ansMap.get(sb).push(s);
    }

    return Array.from(ansMap.values());
};