import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Problems {
    private BufferedReader reader;
    private List<Integer> list = new ArrayList<>();


    public void problem1() {
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\bootc\\Desktop\\freqs.txt"));

            String line = reader.readLine();
            while (line != null) {
                Integer num = Integer.parseInt(line);
                list.add(num);
                line = reader.readLine();
            }
            reader.close();

            Integer totalNum = 0;

            for(var num : list) {
                totalNum += num;
            }

            System.out.println(totalNum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void problem2() {
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\bootc\\Desktop\\freqs.txt"));

            String line = reader.readLine();
            while (line != null) {
                Integer num = Integer.parseInt(line);
                list.add(num);
                line = reader.readLine();
            }
            reader.close();

            Integer runningSum = 0;
            List<Integer> seenSum = new ArrayList<>();

            boolean loop = true;
            while (loop) {
                for (var num : list) {
                    runningSum += num;
                    if (seenSum.contains(runningSum)) {
                        System.out.println(runningSum);
                        return;
                    }
                    else {
                        seenSum.add(runningSum);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}