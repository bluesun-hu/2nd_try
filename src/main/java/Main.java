

import com.esotericsoftware.minlog.Log;

import static com.esotericsoftware.minlog.Log.*;

public class Main {
    public static void main(String[] args){
        Log.setLogger(new MyLogger());
        Log.set(LEVEL_DEBUG);
        Log.info("running");
        System.out.println("Message");

    }
}
