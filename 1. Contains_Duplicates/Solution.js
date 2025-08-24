function containsDuplicates(nums){
    const mySet = new Set();
    for(i of nums){
        if(mySet.contains(i)){
            return true;
        }
        mySet.add(i);
    }
    return false;
}