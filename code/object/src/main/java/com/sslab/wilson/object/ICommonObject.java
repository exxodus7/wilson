package com.sslab.wilson.object;

/**
 * Common interface for all objects used within this project.
 */
public interface ICommonObject {

    /**
     * Gets the ID of the object.
     *
     * @return String representing the ID of the object.
     */
    public String getId();

    /**
     * Sets the GUID of the object.
     *
     * @param newId String representing the ID of the object to be set.
     */
    public void setId(String newId);

    /**
     * Gets the label of the object.
     *
     * @return String representing the label.
     */
    public String getLabel();

    /**
     * Sets the label of the object.
     *
     * @param newLabel String representing the label to be set.
     */
    public void setLabel(String newLabel);
}
