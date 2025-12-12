package rvt;

public class overload_counter {

    private int value;

    public overload_counter(int startValue) {
        this.value = startValue;
    }

    public overload_counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value -= decreaseBy;
        }
    }
}

