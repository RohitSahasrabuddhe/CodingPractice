class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> distinct = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                distinct.add(nums[i]);
                map.put(nums[i],1);
            }
            else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(5, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return map.get(o2)-map.get(o1);
			}
        
		});
        
        for (int i = 0; i < distinct.size(); i++) {
            q.add(distinct.get(i));
        }
        
        List<Integer> op = new ArrayList<Integer>();
        
        for (int i = 0; i < k; i++) {
            op.add(q.poll());
        }
        return op;
    }
}