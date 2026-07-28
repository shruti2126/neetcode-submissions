class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strs.size(); i++) {
            String word = strs.get(i);
            int wordLen = word.length();
            if(wordLen < 100) { sb.append(0);}
            if(wordLen < 10) {sb.append(0);}
            sb.append(wordLen);
            sb.append(word);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < str.length()) {
            if(Character.isDigit(str.charAt(i))){
                int wordLen = Integer.parseInt(str.substring(i, i + 3));
                i += 3;
                sb.append(str.substring(i, i+wordLen));
                decoded.add(sb.toString());
                sb.setLength(0);
                i+=wordLen;
            }  
        }
        return decoded;
    }
}
