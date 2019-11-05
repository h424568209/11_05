public class LeeCode {
    /**
     * 数组中每个为1 的元素表示陆地，求陆地的周长
     *  直接遍历数组 只要有邻格的就-2
     * @param grid 二维数组表示网格地图
     * @return 地图的周长
     */
    public int islandPerimeter(int[][] grid) {
        if(grid.length == 0){
            return 0;
        }
        int num = 0;
        for(int i = 0 ;i<grid.length ;i++){
            for(int j = 0 ; j <grid[i].length ; j++){
                if(grid[i][j]==1) {
                    num += 4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        num -= 2;
                    }
                    if (j > 0 && grid[i][j + 1] == 1) {
                        num -= 2;
                    }
                }
            }
        }
        return num  ;
    }
    /**
     *  二分查找
     * @param nums 数组
     * @param target 目标值
     * @return 目标值在数组的下标 不存在返回-1
     */
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid =start +(end - start)/2;
            if(nums[mid]>target){
                end = mid -1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[]nums={-1,0,3,5,9,12};
        LeeCode l = new LeeCode();
        System.out.println(l.search(nums,9));
    }
}
