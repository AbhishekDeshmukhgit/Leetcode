class Solution {
    public  int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < tasks.length; i++) {
            h.put(tasks[i], h.getOrDefault(tasks[i], 0) + 1);
        }
        int arr[] = new int[h.size()];
        int j = 0;
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            arr[j] = entry.getValue();
            j++;
        }
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = helper(arr[i], 0);
            if (temp == -1) {
                return -1;
            }
            count = count + temp;
            temp = 0;
        }

        return count;

    }
public static int helper(int val, int c) {
        if (val == 0) {
            return c;
        }
        if (val % 3 == 0) {
            c = c + val / 3;
            val = 0;
        } else if (val > 3 && val % 3 == 2) {
            c = c + Math.abs(val / 3);
            val = 2;
        } else if (val % 2 == 0) {
            c = c + 1;
            val = val - 2;
        }
        if (val >= 3) {
            c = c + 1;
            val = val - 3;
        } else if (val == 2) {
            c++;
            val = val - 2;
        } else if (val == 1) {
            return -1;
        }
        return helper(val, c);
    }
}

