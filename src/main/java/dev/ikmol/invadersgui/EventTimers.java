package dev.ikmol.invadersgui;

import java.util.Timer;

// Responsible for keeping track of timers for various events in Invaders
public class EventTimers {
    // Event times stored in seconds
    public static final int ARACHNID_CUBE = 180; // 3 minutes after game starts
    public static final int SLIME_CUBE = 300; // 5 minutes after game starts
    public static final int MOTHER_CUBE = 420; // 7 minutes after game starts


    public static void initializeTimers() {
        Timer timer = new Timer();
    }
}
