package test;

//import java.util.ArrayList;
//import java.util.Collections; //1번 풀이

//import java.util.Arrays; // 2번 풀이

import java.util.HashMap;

class Solution02 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";

        
        ///////////////////////////////
//        ArrayList<String> list = new ArrayList<String>();
//        Collections.addAll(list, participant);
//        for(String s : completion) {
//        	list.remove(s);
//        }
//        answer = list.get(0); //시간이 너무 오래 걸림;;
        
        ///////////////////////////////
//        String temp = "";
//        int i = 0;
        
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        
//        while(i<completion.length) {
//        	if(!completion[i].equals(participant[i])) {
//        		temp = participant[i];
//        		break;
//        	}
//        	i++;
//        }
//        if(temp.equals("")) answer = participant[participant.length-1];
//        else answer = temp; //HashMap을 사용하는 문제였음
        
        ///////////////////////////////
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        
        return answer;
    }
}

public class CodingTest_02 {
	public static void main(String[] args) {
		String[] p = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] c = { "josipa", "filipa", "marina", "nikola" };
		String result;
		Solution02 s = new Solution02();
		result = s.solution(p, c);
		System.out.println(result);
	}
}
