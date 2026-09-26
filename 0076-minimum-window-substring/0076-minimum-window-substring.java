class Solution { 
    public String minWindow(String s, String t) { 
        int n = s.length(), m = t.length(); 
        if (n < m) return "";
        
        int[] hash = new int[256]; 
        int minlen = Integer.MAX_VALUE; 
        int right = 0; 
        int left = 0; 
        int count = 0, sidx = -1; 
        
        for (int i = 0; i < m; i++){ 
            hash[t.charAt(i)]++; 
        } 
        
        while (right < n){ 
            if (hash[s.charAt(right)] > 0){ 
                count++; 
            } 
            hash[s.charAt(right)]--; 
            right++; 

        
            
            while (count == m){ 
                if (right - left < minlen){ 
                    minlen = right - left; 
                    sidx = left; 
                } 
                hash[s.charAt(left)]++; 
                if (hash[s.charAt(left)] > 0){ 
                    count--; 
                } 
                left++; 
            } 

        } 
        
        return sidx == -1 ? "" : s.substring(sidx, sidx + minlen); 
    } 
}
