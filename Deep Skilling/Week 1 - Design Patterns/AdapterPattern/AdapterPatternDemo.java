// AdapterPatternDemo.java
// Main file to demonstrate the Adapter Pattern in action.

public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Creating audio player
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond_the_horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far_far_away.vlc");
        audioPlayer.play("avi", "mind_me.avi");
    }
}
