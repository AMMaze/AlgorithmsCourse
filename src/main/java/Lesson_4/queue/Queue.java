package Lesson_4.queue;

import Lesson_4.ICollection;

public interface Queue<E> extends ICollection {

    boolean insert(E value);

    E remove();

    E peek();

}
