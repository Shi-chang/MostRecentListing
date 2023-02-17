import java.util.Objects;

/**
 * This class represents a real property listing.
 */
public class Listing {

    // Field designed based on the information provided in the email.
    private String id;
    private String address;
    private int year;

    /**
     * Non-argument constructor of the class.
     */
    public Listing() {
    }

    /**
     * Constructor of the class.
     *
     * @param id      the id of the listing
     * @param address the address of the listing
     * @param year    the year of the listing
     */
    public Listing(String id, String address, int year) {
        this.id = id;
        this.address = address;
        this.year = year;
    }

    /**
     * Gets the id of the listing.
     *
     * @return the id of the listing
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the address of the listing.
     *
     * @return the address of the listing.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the year of the listing.
     *
     * @return the year of the listing
     */
    public int getYear() {
        return year;
    }
}
