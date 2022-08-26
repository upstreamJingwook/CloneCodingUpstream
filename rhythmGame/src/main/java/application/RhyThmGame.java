package application;

import frames.DynamicBeat;

public class RhyThmGame {
    public static final int SCREENWIDTH = 1280;
    public static final int SCREENHEIGHT = 720;

    public static void main(String[] args) {
        RhyThmGame application = new RhyThmGame();
        application.run();
    }

    private void run() {
        DynamicBeat dynamicBeat = new DynamicBeat();
    }
}
