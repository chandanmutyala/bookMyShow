package com.junitBookMyShow.bookMyShow;

import java.sql.Time;
import java.util.Date;

public class ShowInputs {
    private int mobileNo;
    private Date day;
    private Time time;
    private char row;
    private String movie;
    private int seatNo;
    private int noOfSeats;


    public ShowInputs(int mobileNo, Date day, Time time, char row, String movie, int seatNo, int noOfSeats) {
        this.mobileNo = mobileNo;
        this.day = day;
        this.time = time;
        this.row = row;
        this.movie = movie;
        this.seatNo = seatNo;
        this.noOfSeats = noOfSeats;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public Date getDay() {
        return day;
    }

    public Time getTime() {
        return time;
    }

    public char getRow() {
        return row;
    }

    public String getMovie() {
        return movie;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

}
