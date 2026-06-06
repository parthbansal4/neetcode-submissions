class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
               List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map= new HashMap<>();

        for(String s:strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);

            String key= new String(temp);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        for(List<String> val:map.values()){
            ans.add(val);
        }

        return ans;
    }
}
