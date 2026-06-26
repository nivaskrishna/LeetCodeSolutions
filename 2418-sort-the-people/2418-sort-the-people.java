class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int size = heights.length;
        int size2 = names.length;
        int temp =0;
        String temp1;
        int minIndex = -1;

        for(int i=0; i<size-1; i++){
            minIndex = i;
            for(int j=i+1; j<size; j++){
                if(heights[minIndex] < heights[j]){
                    minIndex = j;
                }
            }
            temp = heights[minIndex];
            heights[minIndex] = heights[i];
            heights[i] = temp;

            temp1 = names[i];
            names[i] = names[minIndex];
            names[minIndex] = temp1;


        }
        return names;
    }
}