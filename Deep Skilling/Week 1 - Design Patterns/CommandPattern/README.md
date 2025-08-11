# Command Pattern in Java

## 1. Overview
The **Command Pattern** is a behavioral design pattern that turns a request into a stand-alone object containing all the information needed to perform an action.  
It is useful for parameterizing objects with different requests, queuing requests, and logging operations.

In this example, we simulate a home automation system where a remote control can be programmed to turn a light on or off.

---

## 2. Components in This Implementation

### 2.1 Command Interface
**`Command`**
- Declares a method `execute()` that is implemented by concrete commands.

### 2.2 Concrete Commands
- **`LightOnCommand`** — Turns the light on.
- **`LightOffCommand`** — Turns the light off.

### 2.3 Receiver
**`Light`**
- Knows how to perform the operations (turn on/off).

### 2.4 Invoker
**`RemoteControl`**
- Holds a reference to a command object and triggers it via `pressButton()`.

---

## 3. How It Works
1. The **client** creates the `Light` object (receiver).
2. The client creates command objects (`LightOnCommand`, `LightOffCommand`) linked to the receiver.
3. The client sets a command on the `RemoteControl` (invoker).
4. When the remote’s button is pressed, the command executes the action on the receiver.

---

## 4. UML Diagram
Command <---- LightOnCommand  
   ^             ^  
   |             |  
   |         LightOffCommand  
   |  
RemoteControl ---> Command ---> Light

---

## 5. Example Output
```text
The light is ON
The light is OFF
```

---

## 6. How to Run

Save all `.java` files in the same folder.

**Compile:**
```bash
javac *.java
```

**Run:**
```bash
java CommandPatternDemo
```

---

## 7. Conclusion
The Command Pattern is great for decoupling objects that issue requests from those that actually execute them.

It allows you to parameterize actions, create undo/redo functionality, and easily extend to new commands without modifying existing code.
