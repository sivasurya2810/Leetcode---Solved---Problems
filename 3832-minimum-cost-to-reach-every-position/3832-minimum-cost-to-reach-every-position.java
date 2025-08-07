class Solution {
    public int[] minCosts(int[] costs) {
        int n=costs.length;
        for(int i=0;i<n-1;i++){
            costs[i+1]=Math.min(costs[i],costs[i+1]);
        }
        return costs;
    }
}