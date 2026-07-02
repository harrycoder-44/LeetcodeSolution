

class Solution {

    String[] arr = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return list;
        }

        comb(0, digits, "", list);
        return list;
    }

    public void comb(int i, String digit, String ans, List<String> list){

        if(i == digit.length()){
            list.add(ans);
            return;
        }

        int idx = digit.charAt(i) - '0';
        String s = arr[idx];

        for (int j = 0; j < s.length(); j++) {
            comb(i + 1, digit, ans + s.charAt(j), list);
        }
    }
}