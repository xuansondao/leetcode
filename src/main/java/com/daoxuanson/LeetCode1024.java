package com.daoxuanson;

import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode1024 {
    public class Pair implements Comparable<Pair>{
        int startTime, endTime;

        Pair(int startTime, int endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }


        @Override
        public int compareTo(Pair o) {
            return endTime - o.endTime;
        }
    }

    public int videoStitching(int[][] clips, int time) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < clips.length; i++) {
            maxHeap.offer(new Pair(clips[i][0], clips[i][1]));
        }
        int ans = 0;
        while (!maxHeap.isEmpty()){
            if (time ==   maxHeap.peek().endTime){
                ans++;
                maxHeap.poll();
                break;
            }else if (maxHeap.peek().endTime > time){
                maxHeap.poll();
            }
        }

        return  time;
    }


}
