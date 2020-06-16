package Lesson1.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayСonversion <T> {

    ArrayList<T> arrayСonversion (T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
