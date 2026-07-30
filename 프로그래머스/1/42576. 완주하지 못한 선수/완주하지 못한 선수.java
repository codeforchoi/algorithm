import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantCount = new HashMap<>();
		
		for(String name : participant) {
			participantCount.put(name, participantCount.getOrDefault(name, 0) + 1);
		}
		
		for(String name : completion) {
			participantCount.put(name, participantCount.get(name) - 1);
		}
		
		for(String name : participant) {
			if(participantCount.get(name) > 0) {
				return name;
			}
		}
		return "";
    }
}