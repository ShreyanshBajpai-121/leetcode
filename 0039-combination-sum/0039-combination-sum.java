class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, target, candidates, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int i, int target, int[] arr,
         List<Integer> list,
         List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (i == arr.length || target < 0) {
            return;
        }

        // Take current element (stay at same index)
        list.add(arr[i]);
        backtrack(i, target - arr[i], arr, list, ans);
        list.remove(list.size() - 1);

        // Skip current element
        backtrack(i + 1, target, arr, list, ans);
    }
}
