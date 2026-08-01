import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = score.clone();

        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        String[] str = new String[score.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (arr[i] == score[j]) {
                    if (i == 0) {
                        str[j] = "Gold Medal";
                    } else if (i == 1) {
                        str[j] = "Silver Medal";
                    } else if (i == 2) {
                        str[j] = "Bronze Medal";
                    } else {
                        str[j] = String.valueOf(i + 1);
                    }
                }
            }
        }

        return str;
    }
}