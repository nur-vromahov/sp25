import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Percolation {
    private final int N;
    private final int[][] openSites;
    Logger log4j = LogManager.getLogger();


    private int numberOfOpenSites;

    public Percolation(int N) {
        this.N = N;
        openSites = new int[N][N];
    }

    public void open(int row, int col) {
        if (openSites[row][col] == 0)
            numberOfOpenSites++;
        openSites[row][col] = 1;
    }

    public static void main(String[] args) {
        Percolation percolation = new Percolation(0);

        try {
            System.out.println(percolation.checkNumber(1));
        } catch (UnevenException e) {
            System.out.println("Wrong number");
            System.out.println("-------------------");
            System.out.println(e.getMessage());
            System.out.println("-------------------");
            e.printStackTrace();

        }
    }

    public int checkNumber(int a){
        if (a % 2 == 0)
            return a;
        else
            throw new UnevenException("Number is not even");
    }

    public class UnevenException extends RuntimeException{
        public UnevenException(String message) {
//            super(message);
        }
    }

    public int getWeight(int a) throws RuntimeException {
        return a;
    }


    public boolean isOpen(int row, int col) {
        if (row < N && col < N)
            return openSites[row][col] == 1;
        return false;
    }

    public boolean isFull(int row, int col) {
        return openSites[row][col] == 2;
    }

    public int numberOfOpenSites() {
        return numberOfOpenSites;
    }

    public boolean percolates() {
        // TODO: Fill in this method.
        return false;
    }

    // TODO: Add any useful helper methods (we highly recommend this!).
    // TODO: Remove all TODO comments before submitting.

}
