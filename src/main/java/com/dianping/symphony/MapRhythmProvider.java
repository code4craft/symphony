package com.dianping.symphony;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author code4crafter@gmail.com
 */
public class MapRhythmProvider implements RhythmProvider {

    private Map<String,Integer> rhythmMap;

    public MapRhythmProvider() {
        this(new ConcurrentHashMap<String, Integer>());
    }

    public MapRhythmProvider(Map<String, Integer> rhythmMap) {
        this.rhythmMap = rhythmMap;
    }

    public MapRhythmProvider add(String taskType,int rhythm){
        rhythmMap.put(taskType,rhythm);
        return this;
    }

    @Override
    public int getRhythm(String taskType) {
        if (rhythmMap.containsKey(taskType)){
            return rhythmMap.get(taskType);
        }
        return 0;
    }
}
