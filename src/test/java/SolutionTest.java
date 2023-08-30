import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.Solution;
import org.example.followUpSolution;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSetZeroes() {
//        Solution solution = new Solution();
        followUpSolution solution = new followUpSolution();

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };
        int[][] expected1 = {
                {1, 0, 3},
                {0, 0, 0},
                {7, 0, 9}
        };
        solution.setZeroes(matrix1);
        assertArrayEquals(expected1, matrix1);

        int[][] matrix2 = {
                {0, 2, 3},
                {4, 5, 6},
                {7, 8, 0}
        };
        int[][] expected2 = {
                {0, 0, 0},
                {0, 5, 0},
                {0, 0, 0}
        };
        solution.setZeroes(matrix2);
        assertArrayEquals(expected2, matrix2);

        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        solution.setZeroes(matrix3);
        assertArrayEquals(expected3, matrix3);

        int[][] matrix4 = {
                {0, 2},
                {3, 4}
        };
        int[][] expected4 = {
                {0, 0},
                {0, 4}
        };
        solution.setZeroes(matrix4);
        assertArrayEquals(expected4, matrix4);

        int[][] matrix5 = {
                {1, 2},
                {0, 4}
        };
        int[][] expected5 = {
                {0, 2},
                {0, 0}
        };
        solution.setZeroes(matrix5);
        assertArrayEquals(expected5, matrix5);

        int[][] matrix6 = {
                {0, 0},
                {3, 4}
        };
        int[][] expected6 = {
                {0, 0},
                {0, 0}
        };
        solution.setZeroes(matrix6);
        assertArrayEquals(expected6, matrix6);

        int[][] matrix7 = {
                {1, 2},
                {3, 4}
        };
        int[][] expected7 = {
                {1, 2},
                {3, 4}
        };
        solution.setZeroes(matrix7);
        assertArrayEquals(expected7, matrix7);

        int[][] matrix8 = {
                {0}
        };
        int[][] expected8 = {
                {0}
        };
        solution.setZeroes(matrix8);
        assertArrayEquals(expected8, matrix8);

        int[][] matrix9 = {
                {1}
        };
        int[][] expected9 = {
                {1}
        };
        solution.setZeroes(matrix9);
        assertArrayEquals(expected9, matrix9);

        int[][] matrix10 = {
                {1, 2, 3},
                {0, 0, 0},
                {7, 8, 9}
        };
        int[][] expected10 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        solution.setZeroes(matrix10);
        assertArrayEquals(expected10, matrix10);

        System.out.println("All test cases passed.");
    }
}
