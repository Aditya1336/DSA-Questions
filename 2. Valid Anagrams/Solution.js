/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length!=t.length){
        return false;
    }

    const myArr = new Array(26).fill(0);

    for(let i=0;i<s.length;i++){
        myArr[s.charCodeAt(i)-'a'.charCodeAt(0)]++;
        myArr[t.charCodeAt(i)-'a'.charCodeAt(0)]--;
    }

    for(i of myArr){
        if(i!=0){
            return false;
        }
    }
    return true;
};