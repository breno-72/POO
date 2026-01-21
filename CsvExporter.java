package util;

import java.io.FileWriter;
import java.io.IOException;

public class CsvExporter {

    public static void export(String file, double avgWaitingTime)
            throws IOException {

        FileWriter writer = new FileWriter(file);
        writer.write("average_waiting_time\n");
        writer.write(avgWaitingTime + "\n");
        writer.close();
    }
}

