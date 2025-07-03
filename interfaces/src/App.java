public class App {
    public static void main(String[] args) throws Exception {
        var musicPlayer  = new MusicPlayer() {

            @Override
            public void playMusic() {
                System.out.println("Playing music: " + music);
            }

            @Override
            public void pauseMusic() {
                System.out.println("Music paused.");
            }

            @Override
            public void stopMusic() {
                System.out.println("Music stopped.");
            }
        };
    }
 
}
