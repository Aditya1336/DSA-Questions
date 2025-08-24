class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs)==0:
            return [[]]
        ansMap = {}

        

        for s in strs:
            count = [0]*26
            for c in s:
                count[ord(c)-ord('a')]+=1
        
            key = ""

            for i in count:
                key+='#'
                key+=str(i)

            if key not in ansMap.keys():
                ansMap[key] = []

            ansMap[key].append(s)

        return [l for l in ansMap.values()] 

        