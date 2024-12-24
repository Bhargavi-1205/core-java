package com.xworkz.hotelapp.hotel;

public class Hotel {
    private String hotelName;
    private String address;
    private int    noOfWaiters;
    private long   contactNo;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNoOfWaiters(int noOfWaiters) {
        this.noOfWaiters = noOfWaiters;
    }

    public int getNoOfWaiters() {
        return noOfWaiters;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public long getContactNo() {
        return contactNo;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", address='" + address + '\'' +
                ", noOfWaiters=" + noOfWaiters +
                ", contactNo=" + contactNo +
                '}';
    }
}
