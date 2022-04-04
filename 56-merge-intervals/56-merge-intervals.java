class Solution {
    public int[][] merge(int[][] intervals) {
        //sort
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        //result
        List<int[]> result = new ArrayList<>();


        int i = 0;
        int j = 0;
        int[] prevInterval = intervals[0];
        result.add(prevInterval);

        while (j < intervals.length) {
            prevInterval = result.get(i);
            int[] currentInterval = intervals[j];

            if(prevInterval[1] >= currentInterval[0]) {
                prevInterval[1] = Math.max(prevInterval[1], currentInterval[1]);
            } else {
                result.add(currentInterval);
                i++;
            }
            j++;
        }

        return result.toArray(new int[result.size()][]);
        
    }
}