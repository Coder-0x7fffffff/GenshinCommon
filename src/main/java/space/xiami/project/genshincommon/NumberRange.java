package space.xiami.project.genshincommon;

/**
 * @author Xiami
 */
public class NumberRange<T>{

    private final T min;
    private final T max;

    public NumberRange(T min, T max) {
        this.min = min;
        this.max = max;
    }

    public T getMin() {
        return min;
    }

    public T getMax() {
        return max;
    }
}
