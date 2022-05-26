class Solution {
    //BRUTE FORCE APPROACH
    
//     public int maxArea(int[] height) {
//         int maxArea=Integer.MIN_VALUE;
//         int area=0;
//         for(int i=0;i<height.length;i++){
//             for(int j=i+1;j<height.length;j++){
//                 if(height[i]<=height[j]){
//                     area=height[i]*(i>j?(i-j):(j-i));
//                     maxArea=Math.max(maxArea,area);
//                 }
//                 else if(height[j]<=height[i]){
//                     area=height[j]*(i>j?(i-j):(j-i));
//                     maxArea=Math.max(maxArea,area);
//                 }
//             }
//         }
//         return maxArea;
//     }
//      OPTIMAL APPROACH-Start from extreme ends of the array and update them to reach the max array value    
    public int maxArea(int[] height) {
        int maxArea=Integer.MIN_VALUE;
        int area=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            area=Math.min(height[l],height[r])*(r-l);
            maxArea=Math.max(area,maxArea);
            
            if(height[l]>height[r]){
                r--;
            }
            else if(height[l]<height[r]){
                l++;
            }
            else{
                l++;
            }
        }
        return maxArea;
    }
}
