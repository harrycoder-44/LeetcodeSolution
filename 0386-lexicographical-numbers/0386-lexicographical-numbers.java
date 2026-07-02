class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            find2(i, n, list);
        }

        return list;


    }

    public static void find2(int num, int n, List<Integer> list) {
        if (num > n) {
            return;
        }

        list.add(num);
        num = num * 10;

        for (int i = 0; i <= 9; i++) {
            find2(num + i, n, list);
        }

    }
}