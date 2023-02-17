import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The testing of the Solution class.
 */
public class SolutionTest {

    private Solution solution;
    List<String> result;

    /**
     * Sets up the variables.
     */
    @Before
    public void setup() {
        solution = new Solution();
        result = new ArrayList<>();
    }

    /**
     * Tests getMostRecentListings method when the listing argument is null.
     */
    @Test
    public void testGetMostRecentListingsWithNullListings() {
        List<Listing> houseListings = null;
        Assert.assertEquals(solution.getMostRecentListings(houseListings), result);
    }

    /**
     * Tests getMostRecentListings method when the listing argument is empty.
     */
    @Test
    public void testGetMostRecentListingsWithEmptyListings() {
        List<Listing> houseListings = new ArrayList<>();
        Assert.assertEquals(solution.getMostRecentListings(houseListings), result);
    }

    /**
     * Tests getMostRecentListings method when the listing argument has only 1 element.
     */
    @Test
    public void testGetMostRecentListingsWithOneElementListings() {
        List<Listing> houseListings = new ArrayList<>();
        houseListings.add(new Listing("L4", "123 kings road", 2022));
        result.add("L4");
        Assert.assertEquals(solution.getMostRecentListings(houseListings), result);
    }

    /**
     * Tests getMostRecentListings method with the test case specified in the email.
     */
    @Test
    public void testGetMostRecentListings() {
        List<Listing> listings = new ArrayList<>();
        listings.add(new Listing("L4", "123 kings road", 2022));
        listings.add(new Listing("L1", "123 kings road", 2020));
        listings.add(new Listing("L2", "queen road", 1990));
        listings.add(new Listing("L3", "queen road", 1992));

        List<String> mostRecentListings = solution.getMostRecentListings(listings);
        result.add("L4");
        result.add("L3");
        Assert.assertArrayEquals(mostRecentListings.toArray(new String[0]),
            result.toArray(new String[0]));
    }
}
