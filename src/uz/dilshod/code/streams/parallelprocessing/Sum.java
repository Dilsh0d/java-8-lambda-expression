package uz.dilshod.code.streams.parallelprocessing;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class Sum {

    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input) {
        total += input;
    }
}
