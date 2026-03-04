package Demo;

import java.io.IOException;

public class DinoGame{

    static final int WIDTH = 40;

    static volatile boolean running = true;
    static volatile boolean jumpRequested = false;

    static int dinoY = 0;
    static int jumpVelocity = 0;
    static int obstacleX = WIDTH - 1;

    public static void main(String[] args) throws Exception {

        Thread inputThread = new Thread(() -> {
            try {
                while (running) {
                    int ch = System.in.read();
                    if (ch == 32 && dinoY == 0) {
                        jumpRequested = true;
                    }
                }
            } catch (IOException e) {
            }
        });

        inputThread.setDaemon(true);
        inputThread.start();

        System.out.println("Press SPACE to jump. Ctrl+C to exit");
        Thread.sleep(1200);

        while (running) {

            if (jumpRequested) {
                jumpVelocity = 3;
                jumpRequested = false;
            }

            if (jumpVelocity > 0 || dinoY > 0) {
                dinoY += jumpVelocity;
                jumpVelocity--;
                if (dinoY < 0) dinoY = 0;
            }

            obstacleX--;
            if (obstacleX < 0) obstacleX = WIDTH - 1;

            if (obstacleX == 2 && dinoY == 0) {
                clear();
                System.out.println("GAME OVER");
                running = false;
                break;
            }

            clear();
            draw();

            Thread.sleep(90);
        }
    }

    static void draw() {
        for (int y = 3; y > 0; y--) {
            for (int x = 0; x < WIDTH; x++) {
                if (x == 2 && dinoY == y) System.out.print("D");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for (int x = 0; x < WIDTH; x++) {
            if (x == 2 && dinoY == 0) System.out.print("D");
            else if (x == obstacleX) System.out.print("#");
            else System.out.print("_");
        }
        System.out.println();
    }

    static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
