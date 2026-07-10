class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int freq[]=new int[1001];
        for(int i=0;i<arr1.length;i++){
             freq[arr1[i]]++;
        }
        int x=0;
        for(int i=0;i<arr2.length;i++){
             while(freq[arr2[i]]>0){
                 arr1[x]=arr2[i];
                 x++;
                 freq[arr2[i]]--;
             }
        }
        for(int i=0;i<1001;i++){
            while(freq[i]>0){
                   arr1[x]=i;
                   x++;
                   freq[i]--;
            }
        }
        return arr1;
    }
}