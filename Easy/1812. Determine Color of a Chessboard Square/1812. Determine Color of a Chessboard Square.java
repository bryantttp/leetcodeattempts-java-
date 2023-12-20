// 201223 Submission
class Solution {
    public boolean squareIsWhite(String coordinates) {
        // Approach
        // 1) Check the first value of coordinates. If it is a,c,e or g, check the 2nd value. If it is 1,3,5 or 7, return False
        // 2) Again, if first value is b,d,f or h and 2nd value is 2,4,6 or 8, return False
        // 3) Return true

        if (coordinates.substring(0,1).equals("a") || coordinates.substring(0,1).equals("c") || coordinates.substring(0,1).equals("e") || coordinates.substring(0,1).equals("g")) {
            if (coordinates.substring(1,2).equals("1") || coordinates.substring(1,2).equals("3") || coordinates.substring(1,2).equals("5") || coordinates.substring(1,2).equals("7")) {
                return false;
            }
        }
        if (coordinates.substring(0,1).equals("b") || coordinates.substring(0,1).equals("d") || coordinates.substring(0,1).equals("f") || coordinates.substring(0,1).equals("h")) {
            if (coordinates.substring(1,2).equals("2") || coordinates.substring(1,2).equals("4") || coordinates.substring(1,2).equals("6") || coordinates.substring(1,2).equals("8")) {
                return false;
            }
        }
        return true;

        // Test cases
        // 1) False case
        //    coordinates = "a1" -> Return False
        // 2) True case
        //    coordinates = "a2" -> Return True

        // Runtime = 0ms, beats 100% of users
        // Memory = 41.18MB, ebats 5.22% of users

    }
}
