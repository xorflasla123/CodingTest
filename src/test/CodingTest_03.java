package test;

public class CodingTest_03 { //임의의 배열에서 3개의 수 더해서 소수의 개수 구하기
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 1, 2, 3, 4 };
		int result = s.solution(nums);
		System.out.println(result);
	}
}

class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		int num;
		boolean chk1 = false;

		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i + 1; j < nums.length-1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					num = nums[i] + nums[j] + nums[k];
					if (num >= 2)
						chk1 = check(num);
					if (chk1 == true)
						answer++;
				}
			}
		}
		return answer;
	}

	public boolean check(int a) {
		boolean chk2 = true;
		if (a == 2) {
			return chk2;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				chk2 = false;
				break;
			}
		}
		return chk2;
	}
}
