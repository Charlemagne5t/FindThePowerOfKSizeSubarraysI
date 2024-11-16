import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = {1,2,3,4,3,2,5};
        int k = 3;
        int[] expected = {3,4,-1,-1,-1};
        int[] actual = new Solution().resultsArray(nums, k);
        Assert.assertArrayEquals(expected, actual);
    }
}
