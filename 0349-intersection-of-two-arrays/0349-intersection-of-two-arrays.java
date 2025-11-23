class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> list1=new HashSet<>();
          Set<Integer> ans=new HashSet<>();
        for(int arr:nums1){
        list1.add(arr);       
        }
         for(int i=0;i<nums2.length;i++){
            if(list1.contains(nums2[i]))
            ans.add(nums2[i]);
         }
        int[] arr1=new int[ans.size()];
        int i=0;
        for(int arr:ans){
            arr1[i]=arr;
            i++;
        }
        return arr1;
    }
}