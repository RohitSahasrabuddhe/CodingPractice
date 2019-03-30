class Solution {
    public String reverseWords(String s) {
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i = parts.length-1; i>=0; i--){
            if(!parts[i].equals("") && !parts[i].equals(" ")){
                sb.append(parts[i]+" ");
            }   
            
        }
        return sb.toString().trim();
    }
}