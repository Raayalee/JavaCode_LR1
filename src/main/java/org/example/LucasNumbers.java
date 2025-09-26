package org.example;

/**
 * Клас для зберігання числа Люка.
 * Складається з полів номер числа (індекс) та його значення, методу конструктор, гетерів
 */
public class LucasNumbers {

    /** Номер числа (індекс) у послідовності */
    private final int index;

    /** Значення числа */
    private final long value;

    /** Конструктор класу LucasNumbers, що створює об'єкт
     *
     * @param index номер числа (індекс)
     * @param value значення числа Люка
     */
    public LucasNumbers(int index, long value){
        this.index = index;
        this.value = value;
    }

    /** Гетер для порядкового номеру
     *
     * @return index
     */
    public int getIndex() {
        return index;
    }

    /** Гетер для значення
     *
     * @return value
     */
    public long getValue() {
        return value;
    }

}
