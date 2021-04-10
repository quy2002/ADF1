package baithi;

public class Customer {
    private int ReservationID;
    private String PassengerName;
    private String Address;
    private String number;
    private String dateOfDeparture;
    private String dateOfReturn;

    public Customer() {
    }

    public Customer(int reservationID, String passengerName, String address, String number, String dateOfDeparture, String dateOfReturn) {
        ReservationID = reservationID;
        PassengerName = passengerName;
        Address = address;
        this.number = number;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfReturn = dateOfReturn;
    }

    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int reservationID) {
        ReservationID = reservationID;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String passengerName) {
        PassengerName = passengerName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
}
