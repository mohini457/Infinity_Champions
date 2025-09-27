import java.util.*;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		
		int nums[]= {1,3,-1,-3,5,3,6,7};
		int k=3;
		int arr[]=maxSlindingWindow(nums, k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static int[] maxSlindingWindow(int nums[], int k) {
		Deque<Integer> dq=new ArrayDeque<>();
		ArrayList<Integer> res=new ArrayList<>();
		
		//1st window
		for(int i=0;i<k;i++) {
			while(dq.size()>0 && nums[dq.peekLast()]<=nums[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		
		for(int i=k;i<nums.length;i++) {
			res.add(nums[dq.peekFirst()]);
			while(dq.size()>0 && dq.peekFirst()<=i-k) {
				dq.removeFirst();
			}
			while(dq.size()>0 && nums[dq.peekLast()]<=nums[i]) {
				dq.removeLast();
			}
			dq.add(i);
		}
		res.add(nums[dq.peekFirst()]);
		
		int arr[]=new int[res.size()];

		        for(int i=0;i<res.size();i++){
		            arr[i]=res.get(i);
		        }
		        return arr;
		
		
		
		
	}
	

}
