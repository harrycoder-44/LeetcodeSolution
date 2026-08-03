class Solution {
    public String capitalizeTitle(String title) {
        ArrayList<String> list = new ArrayList<>();
        String[] sb1 = title.toLowerCase().split(" ");
        
        for (String s : sb1) {
            if (s.length() > 2) {
               list.add(s.substring(0, 1).toUpperCase() + s.substring(1));   
            }
            else{
                list.add(s);
            }
        }
        return String.join(" ", list);
    }
}