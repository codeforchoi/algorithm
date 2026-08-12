import java.util.*;

class Solution {
    public class Stage {
		private int index;
		private double rate;
		
		public Stage(int index, double rate) {
			super();
			this.index = index;
			this.rate = rate;
		}

		public int getIndex() {
			return index;
		}

		public double getRate() {
			return rate;
		}				
	}
    
    public int[] solution(int N, int[] stages) {
        List<Stage> list = new ArrayList<>();
		for(int i = 1; i <= N; i++) {
			int count = 0;
			int count_fail = 0;
			for(int j = 0; j < stages.length; j++) {
				if(stages[j] > i) {
					count++;
				} else if (stages[j] == i) {
					count_fail++;
					count++;
				}
			}
			double rate = count == 0 ? 0 : (double) count_fail / count;			
			list.add(new Stage(i, rate));
		}
		
		Collections.sort(list, (o1, o2) -> {
			return Double.compare(o2.getRate(), o1.getRate());
		});
		
		int[] answer = new int[N];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).getIndex();
		}	
        return answer;
        
    }    
}