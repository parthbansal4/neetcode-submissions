class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString= new StringBuilder("");

        for(String s:strs){
            encodedString.append(s.length());
            encodedString.append("#");
            encodedString.append(s);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, delimiter));
            i = delimiter + 1;
            String s = str.substring(i, i + length);
            decodedStrings.add(s);
            i += length;
        }
        return decodedStrings;
    }
}
