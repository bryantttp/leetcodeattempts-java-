// 050824 Submission
// Approach
// 1) Create a custom class as Java cannot store multiple data types in one list
// 2) For constructor, ensure that hashmap is initialized
// 3) For set method, have to consider if the key exists in the hashmap before carrying out the operation of adding the custom class 
// 4) For get method, since the timestamp is strictly increasing, can do a binary search in the list of value/timestamp to find the correct value at O (log n) time

class Pair{
    private int timestamp;
    private String value;

    public Pair(int timestamp, String value){
        this.timestamp = timestamp;
        this.value = value;
    }

    public int getTimestamp(){
        return timestamp;
    }
    public String getValue(){
        return value;
    }
}

class TimeMap {
    private Map<String,List<Pair>> timeMap;
    
    public TimeMap() {
        timeMap = new HashMap<>();    
    }
    
    public void set(String key, String value, int timestamp) {
        if (timeMap.containsKey(key)){
            timeMap.get(key).add(new Pair(timestamp,value));
        }
        else{
            List<Pair> tempList = new ArrayList<>();
            tempList.add(new Pair(timestamp,value));
            timeMap.put(key,tempList);
        }
    }
    
    public String get(String key, int timestamp) {
        String answer = "";
        if (timeMap.containsKey(key)){
            List<Pair> latestValue = timeMap.get(key);
            int frontPointer = 0;
            int backPointer = latestValue.size() - 1;
            
            while (frontPointer <= backPointer){
                int midPointer = frontPointer + (backPointer - frontPointer)/2;
                if (latestValue.get(midPointer).getTimestamp() < timestamp){
                    answer = latestValue.get(midPointer).getValue();
                    frontPointer = midPointer + 1;
                }
                else if (latestValue.get(midPointer).getTimestamp() > timestamp){
                    backPointer = midPointer - 1;
                }
                else{
                    answer = latestValue.get(midPointer).getValue();
                    return answer;
                }
            }
        }
        return answer;
    }
}

// Runtime = 137ms, beats 72.91% of users
// Memory = 117.98MB, beats 93.53% of users

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
