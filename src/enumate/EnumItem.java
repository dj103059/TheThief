package enumate;

public enum EnumItem {
    BOX("box"),CLOCK("clock"),BAIT("bait"),MAP("map"),GOLD("gold"),UNKNOWN("?");
    // The name of the item as a string.
    private String itemName;
    
    /**
     * Initialize with the corresponding command string.
     * 
     * @param commandString
     *            The command String.
     * @param command
     *            The object Command
     */
    private EnumItem(String name){
        this.itemName = name;
    }
    
    /**
     * @return The name of the item as a String.
     */
    public String toString() {
        return itemName;
    }
}
