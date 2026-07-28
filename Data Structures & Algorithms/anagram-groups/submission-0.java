class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> freqMap = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String w = strs[i];
            int[] arr = new int[26];
            for(char c: w.toCharArray()){
                arr[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < arr.length; j++){
                if(arr[j] != 0) {
                    sb.append(j+"-"+arr[j]+" ");
                }
                
            }
            String anagramHash = sb.toString();
            if(freqMap.containsKey(anagramHash)){
                //anagram exists
                List<String> li = freqMap.get(anagramHash);
                li.add(w);
                freqMap.put(anagramHash, li);
            } else {
                freqMap.computeIfAbsent(anagramHash, k -> new ArrayList<String>()).add(w);
            }
        }
        for(List<String> list : freqMap.values()) {
            result.add(list);
        }
        
        return result;
    }
    
}
