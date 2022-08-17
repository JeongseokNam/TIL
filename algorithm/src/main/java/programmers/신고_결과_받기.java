package programmers;

import java.util.*;

public class 신고_결과_받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        List<String> reporter = new ArrayList<>();
        List<String> reported = new ArrayList<>();
        HashMap<String,Integer> report_cnt = new HashMap<>();
        int[] answer = new int[id_list.length];

        for(int i=0; i<report.length; i++){
            String[] report_set = report[i].split(" ");
            reporter.add(report_set[0]);
            reported.add(report_set[1]);
        }
        for(int i=0; i<reporter.size(); i++){
            if (report_cnt.containsKey(reported.get(i))){
                report_cnt.put(reported.get(i),report_cnt.get(reported.get(i))+1);
                for(int j=i+1; j<reporter.size(); j++){
                    if(reporter.get(i).equals(reporter.get(i))&&reported.get(i).equals(reported.get(i))){
                        report_cnt.put(reported.get(i),report_cnt.get(reported.get(i))-1);
                    }
                }
            }else {
                report_cnt.put(reported.get(i),1);
            }
        }
        report_cnt.forEach((key,val)->{
            if(val>=k){
                for(int i=0; i<reporter.size(); i++){
                    if(key.equals(reported.get(i))){
                        for(int j=0; j < id_list.length; j++){
                            if(reporter.get(i).equals(id_list[i])){
                                answer[j]=answer[j]+1;
                                System.out.println(answer);
                            }
                        }
                    }
                }
            }
        });
        return answer;
    }
}
