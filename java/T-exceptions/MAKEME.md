# Homework

### 1. Complete this program so when it breaks it does not exit the program, but instead prints out a message that an exception has been thrown. Use a try/catch block.
```
public class Main {
    public static void main(String[] args) {

        int x = 10 / 0; // this will throw an exception since you cannot divide by zero

    }
}
```

### 2. Using the code solution from the previous question, append a _finally_ block after the try/catch and print out a statement letting you know the code in the _finally_ block is running. After this, run the program, using `int x = 10 / 0;`. Then change it to `int x = 10;` and run it again. When was the code in the _catch_ block run? When was the code in the _finally_ block run?
