package com.pronchenko.top.homework7_4;

public class MyArrayList<T> {
    private Object[] data;
    private Object[] newData;
    private int size;
    private int capacity;
    private String string;
    private int f;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
        size = 0;
    }

    public MyArrayList() {
        this(10);
    }

    /**
     * Метод проверяет, достаточно ли резерва памяти
     * для хранения указанного в параметре количества элементов.
     */
    private void ensureCapacity() {
        if (capacity <= getSize()) {
            capacity = (int) (1.5 * capacity + 1);
            newData = new Object[capacity];
            for (int i = 0; i < getSize(); i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    /**
     * Метод добавляет элемент в конец массива и
     * проверяет достаточно ли памяти
     *
     * @param element - элемент
     */
    public void pushBack(T element) {
        ensureCapacity();
        data[getSize()] = element;
        size++;
    }

    /**
     * Метод удаляет первый элемент массива
     */
    public void popFront() {
        newData = new Object[capacity];
        for (int i = 0; i < getSize(); i++) {
            newData[i] = data[i + 1];
        }
        data = newData;
        size--;
    }

    /**
     * Метод добавляет новый элемент в начало массива
     *
     * @param element - элемент
     */
    public void pushFront(T element) {
        ensureCapacity();
        newData = new Object[capacity];
        for (int i = 1; i < getSize() + 1; i++) {
            newData[i] = data[i - 1];
        }
        newData[0] = element;
        data = newData;
        size++;
    }

    /**
     * Метод вставляет новый элемент в массив по указанному индексу
     * и проверяет достаточно ли памяти
     *
     * @param index   - индекс
     * @param element - элемент
     */
    public void insert(int index, T element) {
        ensureCapacity();
        newData = new Object[capacity];
        for (int i = 0; i < index; i++) {
            newData[i] = data[i];
        }
        for (int i = index; i < getSize(); i++) {
            newData[i + 1] = data[i];
        }
        newData[index] = element;
        data = newData;
        size++;
    }

    /**
     * Метод удаляет элемент по указанному индексу
     * и проверяет допустимость индекса
     *
     * @param index - индекс
     */
    public void removeAt(int index) {
        if (index > getSize()) {
            System.out.println("Ошибка. Неверно введен индекс.");
        } else {
            newData = new Object[capacity];
            for (int i = 0; i < index; i++) {
                newData[i] = data[i];
            }
            for (int i = index; i < getSize(); i++) {
                newData[i] = data[i + 1];
            }
            data = newData;
            size--;
        }
    }

    /**
     * Метод удаляет элемент массива,
     * значение которого совпадает с переданным параметром
     *
     * @param element - переданный параметр
     */
    public void remove(T element) {
        int index = getSize() + 1;
        for (int i = 0; i <= getSize(); i++) {
            if (data[i] == element) {
                index = i;
            }
        }
        if (index > getSize()) {
            f = 10;
        } else {
            removeAt(index);
        }
    }

    /**
     * Метод удаляет все элементы,
     * значение которых совпадает с переданным параметром
     *
     * @param element - переданный параметр
     */
    public void removeAll(T element) {
        f = 0;
        while (f != 10) {
            remove(element);
        }
    }

    /**
     * Метод удаляет последний элемент массива
     */
    public void popBack() {
        newData = new Object[capacity];
        for (int i = 0; i < getSize(); i++) {
            newData[i] = data[i];
        }
        data = newData;
        size--;
    }

    /**
     * Метод обнуляет массив – всем элементам массива по
     * индексам от 0 до size-1 присваивается значение null,
     * полю size присваивается значение 0
     */
    public void clear() {
        newData = new Object[capacity];
        for (int i = 0; i < getSize(); i++) {
            newData[i] = null;
        }
        data = newData;
        size = 0;
    }

    /**
     * Метод возвращает size - количество элементов массива
     *
     * @return - возвращает количество элементов массива
     */
    public int getSize() {
        return size;
    }

    /**
     * Метод возвращает строковое представление
     * элементов массива через пробел
     *
     * @return - возвращает строку
     */
    @Override
    public String toString() {
        string = "";
        for (int i = 0; i < getSize(); i++) {
            string += data[i] + " ";
        }
        return string;
    }
}
