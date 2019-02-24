class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9]", " ");
        String parts[] = paragraph.split(" ");
        Set<String> ban = new HashSet<String>();
        for (int i = 0; i < banned.length; i++) {
            ban.add(banned[i]);
        }
        
        for (int i = 0; i < parts.length; i++) {
            if (! ban.contains(parts[i]) && !parts[i].equals("")) {
                if (map.containsKey(parts[i])) {
                    map.put(parts[i], map.get(parts[i]) + 1);
                }
                else {
                    map.put(parts[i], 1);
                }
            }
        }
        int max = 0;
        String maxString = "";
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Val: " + entry.getValue());
            if (max < entry.getValue()) {
                maxString = entry.getKey();
                max = entry.getValue();
            }
        }
        
        return maxString;
    }
}