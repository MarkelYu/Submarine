package Submarine;

import java.util.*;

class Submarine {

    public int scan(List<Integer> nums) {
        int count = 0;
        int prev = nums.get(0) + nums.get(1)  + nums.get(2);
        for (int i = 1; i < nums.size()-1; i++) {
            int curr = nums.get(i-1) + nums.get(i+1) + nums.get(i);
            if (curr - prev > 0)
                count++;
            prev = curr;
        }
        return count;
    }

    public int move(List<String> commands, List<Integer> distances) {
        int horizontal = 0, depth = 0, aim = 0;
        for (int i = 0; i < commands.size(); i++) {
            if (commands.get(i).equals("forward")) {
                horizontal += distances.get(i);
                depth += aim * distances.get(i);
            }
            if (commands.get(i).equals("down")) {
                aim += distances.get(i);
            }
            if (commands.get(i).equals("up")) {
                aim -= distances.get(i);
            }
        }
        return horizontal * depth;
    }

}