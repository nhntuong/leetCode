
public class reversedNum {
    void reversedNum(){};
    public int reversedNum(int x) {
        long new_x = 0;
        do {
            new_x = (new_x * 10) + x%10;
            System.out.println(new_x);
            x /= 10;
        }
        while (x != 0);
        if (new_x > Integer.MAX_VALUE || new_x <Integer.MIN_VALUE){
            return 0;
        }
        return (int) new_x;
    }
}
