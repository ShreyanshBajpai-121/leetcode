class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, 0, target, candidates, new ArrayList<>(), ans, candidates.length);
        return ans;
    }

    private void backtrack(int sum, int i, int target, int[] arr,
                           List<Integer> list,
                           List<List<Integer>> ans, int n) {

        if (sum > target) return;

        if (i == n) {
            if (sum == target)
                ans.add(new ArrayList<>(list));
            return;
        }

        // Pick
        list.add(arr[i]);
        backtrack(sum + arr[i], i + 1, target, arr, list, ans, n);
        list.remove(list.size() - 1);

        // Skip all duplicates
        int next = i + 1;
        while (next < n && arr[next] == arr[i]) {
            next++;
        }

        backtrack(sum, next, target, arr, list, ans, n);
    }
}
