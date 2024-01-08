public class Cell {
    private int idx;
    private boolean hasSnakeOrLadder;
    private Step step;
    Cell(int idx) {
        this.idx = idx;
    }
    void setStep(int start, int end) {
        step = new Step(start, end);
    }

    public Step getStep() {
        return step;
    }

    public boolean isHasSnakeOrLadder() {
        return hasSnakeOrLadder;
    }

    public void setHasSnakeOrLadder(boolean hasSnakeOrLadder) {
        this.hasSnakeOrLadder = hasSnakeOrLadder;
    }

    public int getIdx() {
        return idx;
    }
}
