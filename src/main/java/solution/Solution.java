package solution;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable e) {
        super(message, e);
    }
}

public class Solution {
    public static void main(String[] args) {
        int solutionLength = 3;
        Integer[] array = new Integer[]{4, 3, 2, 1};
        try {
            String result = solution(solutionLength, array);
            System.out.println(result);
        } catch (MyException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Return a value based on the contents of the array N in ascending numeric
     * order where M is the Min and Max length of your solution. Please handle
     * any exceptions that may occur from the input
     *
     * @param M An integer of any length
     * @param N An Integer array of n-length
     * @return
     * @throws MyException
     */
    public static String solution(int M, Integer[] N) throws MyException {

        // Check empty or null array
        if (N == null || N.length == 0) {
            throw new MyException("N cannot be null or empty.");
        }

        // Check length of solution parameter
        if (M > N.length) {
            throw new MyException("M is greater than size of N. ");
        }

        // Check negative or zero value of M
        if (M <= 0) {
            throw new MyException("M cannot be negative or zero");
        }

        // Sort array
        sortArray(N);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            result.append(N[i]);
        }

        return result.toString();
    }

    private static void sortArray(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
}


