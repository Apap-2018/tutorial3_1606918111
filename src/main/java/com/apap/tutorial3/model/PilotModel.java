package com.apap.tutorial3.model;

public class PilotModel{
    private String id;
    private String licenseNumber;
    private String name;
    private Integer flyHour;

    public PilotModel(String id, String licenseNumber, String name, Integer flyHour) {
        this.id = id;
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.flyHour = flyHour;
    }

    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the licenseNumber
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * @param licenseNumber the licenseNumber to set
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Integer return the flyHour
     */
    public Integer getFlyHour() {
        return flyHour;
    }

    /**
     * @param flyHour the flyHour to set
     */
    public void setFlyHour(Integer flyHour) {
        this.flyHour = flyHour;
    }

}