class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        int firstUnique = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (firstUnique == nums[i]) {
                count++;
                
            } else {
                list.add(count);
                firstUnique = nums[i];
                count = 1;
            }
            
        }
        list.add(count);

        list.sort(Comparator.naturalOrder());
        
        int max = 0;
        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            if (max <= list.get(i)) {
                max = list.get(i);
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                result += list.get(i);
            }
        }

        return result;
    }
}
