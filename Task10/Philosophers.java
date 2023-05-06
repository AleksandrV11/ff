package Task10;

public class Philosophers {

    int ind;
    boolean left;
    boolean right;

    public Philosophers() {
    }

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Philosophers{" +
                "ind=" + ind +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
