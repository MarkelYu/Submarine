package Submarine;
import java.io.*;
import java.util.*;

class test {

    public static void main(String args[]) {
        try {
            Submarine sm = new Submarine();
            
            File data = new File("Submarine/scan.txt");
            Scanner scan = new Scanner(data);
            List<Integer> input = new ArrayList<>();
            while(scan.hasNextLine()) {
                input.add(scan.nextInt());
            }
            scan.close();

            System.out.println(sm.scan(input));

            data = new File("Submarine/dive.txt");
            scan = new Scanner(data);
            List<Integer> distances = new ArrayList<>();
            List<String> commands = new ArrayList<>();
            while(scan.hasNext()) {
                // String s = scan.next();
                // System.out.print(s + " ");
                commands.add(scan.next());
                distances.add(scan.nextInt());
                    
            }
            scan.close();
            
            System.out.println(sm.move(commands, distances));
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

}