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
     * Sets the id of the listing.
     *
     * @param id the new id for the listing
     */
    public void setId(String id) {
        this.id = id;
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
     * Sets the address for the listing.
     *
     * @param address the new address for the listing
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the year of the listing.
     *
     * @return the year of the listing
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year of the listing.
     *
     * @param year the new year for the listing.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Compares if the other object is equal to this listing.
     *
     * @param o the other object to be compared with this listing
     * @return true if they are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Listing listing = (Listing) o;
        return address.equals(listing.address);
    }

    /**
     * Returns the hashcode of the listing.
     *
     * @return the hashcode of the listing
     */
    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
}
