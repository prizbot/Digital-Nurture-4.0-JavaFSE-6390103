# Adapter Pattern Java Example

## Files included
- AdapterPatternDemo.java
- MediaPlayer.java
- AdvancedMediaPlayer.java
- VlcPlayer.java
- Mp4Player.java
- MediaAdapter.java
- AudioPlayer.java

## What this does
This is a simple implementation of the **Adapter Pattern** in Java.
- `MediaPlayer` is the target interface used by clients.
- `AdvancedMediaPlayer` is an interface for existing (incompatible) implementations.
- `VlcPlayer` and `Mp4Player` are concrete implementations (adaptees).
- `MediaAdapter` adapts the `AdvancedMediaPlayer` interface to `MediaPlayer`.
- `AudioPlayer` is the client-facing class that uses `MediaAdapter` when needed.

## How to compile and run
1. Open a terminal and navigate to the folder containing the `.java` files.
2. Compile all files:
   ```
   javac *.java
   ```
3. Run the demo:
   ```
   java AdapterPatternDemo
   ```
You should see output demonstrating playing different file types.
The `avi` format is not supported and will show an "Invalid media" message.

## Notes
- This code is intentionally simple for learning and assignments.
- If you want to expand it, add more `AdvancedMediaPlayer` types and update `MediaAdapter`.
