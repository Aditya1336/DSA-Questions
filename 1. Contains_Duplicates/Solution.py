def coontainsDuplicates(nums):
    mySet = set()
    for i in nums:
        if i in mySet:
            return True
        mySet.add(i)
    return False
