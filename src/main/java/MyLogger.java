

import com.esotericsoftware.minlog.Log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyLogger extends Log.Logger {
    public void log (int level, String category, String message, Throwable ex) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy.MM.dd-HH:mm:ss");
        String now=LocalDateTime.now().format(format);StringBuilder builder = new StringBuilder(256);
        builder.append(now);
        builder.append(' ');
        builder.append(level);
        builder.append('[');
        builder.append(category);
        builder.append("] ");
        builder.append(message);
        if (ex != null) {
            StringWriter writer = new StringWriter(256);
            ex.printStackTrace(new PrintWriter(writer));
            builder.append('\n');
            builder.append(writer.toString().trim());
        }
        System.out.println(builder);
    }
}