package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {

    public static <T> void writeToFile(String path, List<T> data) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
