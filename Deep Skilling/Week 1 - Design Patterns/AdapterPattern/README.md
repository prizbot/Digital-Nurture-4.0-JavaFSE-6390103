## Adapter Pattern in Java

---

### 1. Overview
The **Adapter Pattern** is a structural design pattern used when two incompatible interfaces need to work together.  
It acts as a bridge between an existing class and the desired interface, enabling objects with incompatible interfaces to collaborate **without changing their source code**.

This pattern is especially useful when:

- You want to reuse existing classes without modifying them.
- The interface of the existing class does not match the one your application requires.

---

### 2. Components in This Implementation
In this project, the Adapter Pattern is demonstrated using the example of **audio players** and **advanced media players**.

#### 2.1 Interfaces
**`MediaPlayer`**
- Defines the standard interface for playing media files.
- **Method:** `play(String audioType, String fileName)`

**`AdvancedMediaPlayer`**
- Defines the interface for more advanced players like `VlcPlayer` and `Mp4Player`.
- **Methods:**
  - `playVlc(String fileName)`
  - `playMp4(String fileName)`

#### 2.2 Concrete Classes
**`VlcPlayer`** (implements `AdvancedMediaPlayer`)
- Plays `.vlc` files.

**`Mp4Player`** (implements `AdvancedMediaPlayer`)
- Plays `.mp4` files.

#### 2.3 Adapter Class
**`MediaAdapter`** (implements `MediaPlayer`)
- Converts the `MediaPlayer` interface to work with `AdvancedMediaPlayer` implementations.
- Based on the `audioType` provided, it delegates the request to either `VlcPlayer` or `Mp4Player`.

#### 2.4 Client Class
**`AudioPlayer`** (implements `MediaPlayer`)
- Can directly play `.mp3` files.
- For `.vlc` and `.mp4` files, it uses the `MediaAdapter`.

---

### 3. How the Code Works
1. The client (`AudioPlayer`) requests to play a file with a specific format.
2. If the format is `.mp3`, it plays it directly.
3. If the format is `.vlc` or `.mp4`, the `AudioPlayer` creates a `MediaAdapter` object and delegates the work to the appropriate advanced player (`VlcPlayer` or `Mp4Player`).
4. The adapter bridges the gap between the client and the advanced players.

--

---

### 5. Advantages
- Promotes reusability of existing code without modification.
- Supports **Open/Closed Principle** (open for extension, closed for modification).
- Improves code maintainability by separating concerns.

---

### 6. Example Output

**If the `Main` class runs the following code:**
```java
AudioPlayer audioPlayer = new AudioPlayer();
audioPlayer.play("mp3", "beyond the horizon.mp3");
audioPlayer.play("mp4", "alone.mp4");
audioPlayer.play("vlc", "far far away.vlc");
audioPlayer.play("avi", "mind me.avi");
```

## Files included
- AdapterPatternDemo.java
- MediaPlayer.java
- AdvancedMediaPlayer.java
- VlcPlayer.java
- Mp4Player.java
- MediaAdapter.java
- AudioPlayer.java

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
**Output:**
```text
Playing mp3 file. Name: beyond the horizon.mp3
Playing mp4 file. Name: alone.mp4
Playing vlc file. Name: far far away.vlc
Invalid media. avi format not supported

