import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The solution for the most recent listing of each address question. Time complexity = O(n) and
 * space complexity = O(n).
 */
public class Solution {

    /**
     * Gets the most recent listings.
     *
     * @param houseListings a list of listings
     * @return the most recent listings that contains only one listing per address
     */
    public List<String> getMostRecentListings(List<Listing> houseListings) {
        // Uses a list of strings to store the result
        List<String> result = new ArrayList<>();

        // Uses a map to reduce time complexity when searching.
        Map<String, Listing> tempListings = new HashMap<>();

        // If the house listings is empty, returns an empty list.
        if (houseListings == null || houseListings.size() == 0) {
            return result;
        }

        // If the house listings only contain 1 element.
        if (houseListings.size() == 1) {
            String listingId = houseListings.get(0).getId();
            result.add(listingId);
            return result;
        }

        // Iterates over the house listings, stores and updates listings in the tempListings map.
        for (Listing curListing : houseListings) {
            if (curListing == null) {
                continue;
            }

            String curAddress = curListing.getAddress();
            int curYear = curListing.getYear();

            Listing existingListingFound = tempListings.get(curAddress);
            // If an existing listing with the same address cannot be found, add it to the
            // tempListings map. If it can be found, update the corresponding listing when
            // necessary.
            if (existingListingFound == null) {
                tempListings.put(curAddress, curListing);
            } else if (curYear > existingListingFound.getYear()) {
                tempListings.put(curAddress, curListing);
            }
        }

        // Gets the result from the tempListings map.
        for (Listing curListing : tempListings.values()) {
            result.add(curListing.getId());
        }

        return result;
    }
}
