public class Books {
    private int book, M, T, W, Thu, F;

    public Books(int book, int M, int T, int W, int Thu, int F) {
        this.book = book;
        this.M = M;
        this.T = T;
        this.W = W;
        this.Thu = Thu;
        this.F = F;
    }

    public int getBook() {
        return this.book;
    }

    public int getM() {
        return this.M;
    }

    public int getT() {
        return this.T;
    }

    public int getW() {
        return this.W;
    }

    public int getThu() {
        return this.Thu;
    }

    public int getF() {
        return this.F;
    }

    public double solve() {
        int totalBooksSold = getM() + getT() + getW() + getThu() + getF();
        return ((getBook() - totalBooksSold) / (double) getBook()) * 100;
    }

    public void display() {
        System.out.printf("The percentage of books that were not sold is: %.2f", solve());

    }
}
