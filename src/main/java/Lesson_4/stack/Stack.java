package Lesson_4.stack;

import Lesson_4.ICollection;

public interface Stack<E> extends ICollection {

    boolean push(E value);

    E pop();

    E peek();

}
