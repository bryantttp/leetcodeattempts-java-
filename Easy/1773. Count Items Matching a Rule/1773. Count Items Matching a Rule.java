//311223 Submission
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        // Approach
        // 1) Loop through items. Depending on ruleKey, check if the 1st/2nd or 3rd item is the same as ruleValue.
        // 2) Initialize counter. If same, counter + 1.
        // 3) Return counter

        int counter = 0;
        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    counter += 1;
                }
            }
        }
        
        if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    counter += 1;
                }
            }
        }
        
        if (ruleKey.equals("name")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    counter += 1;
                }
            }
        }

        return counter;

        // Test cases
        // 1) items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver" -> Returns 1

        // Runtime = 5ms, beats 48.54% of users
        // Memory = 51.03MB, beats 5.66% of users
    }
}
