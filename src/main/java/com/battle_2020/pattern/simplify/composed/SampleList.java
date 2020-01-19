package com.battle_2020.pattern.simplify.composed;


public class SampleList {

    private boolean readOnly;
    private int size;
    private Object[] elements;

    /**
     * 原始代码存在的问题
     *
     * @param element
     */
    public void add(Object element) {
        if (!readOnly) {
            int newSize = size + 1;
            if (newSize > elements.length) {
                //复制到新的扩容后的容器中
                Object[] newElements = new Object[elements.length + 10];
                for (int i = 0; i < elements.length; i++) {
                    newElements[i] = elements[i];
                }
                elements = newElements;
            }

            elements[size++] = element;
        }
    }

    private static final int GROWTH_INCREMENT = 10;

    /**
     * 1、使用卫语句提前出栈。
     * 2、魔数不要用在代码里面
     *
     * @param element
     */
    public void addSimlify(Object element) {
        if (readOnly) {
            return;
        }

        if (atCapacity()) {
            growth();
        }

        elements[size++] = element;
    }

    /**
     * 扩容的条件
     * @return
     */
    private boolean atCapacity(){
        return size + 1 > elements.length;
    }

    /**
     * 扩容容器
     */
    private void growth(){
        //复制到新的扩容后的容器中
        Object[] newElements = new Object[elements.length + GROWTH_INCREMENT];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
}
