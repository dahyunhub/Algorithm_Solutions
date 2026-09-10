
import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		String[] num = new String[intStrs.length];
		List<Integer> tmp = new ArrayList<>();

		for (int i = 0; i < intStrs.length; i++) {
			String str = intStrs[i];

			num[i] = str.substring(s, s + l);
			int n = Integer.parseInt(num[i]);

			if (n > k) {
				tmp.add(n);
			}
		}
		int[] answer = new int[tmp.size()];

		for (int i= 0 ; i < tmp.size(); i++) {
			answer[i] = tmp.get(i);
		}
		
		return answer;

	}
}
