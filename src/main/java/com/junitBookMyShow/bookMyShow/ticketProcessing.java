package com.junitBookMyShow.bookMyShow;

public class ticketProcessing {

    public ShowOutputs movieTicket(ShowInputs inputs){

        char value = inputs.getRow();
        int price =0;

        if ( value == 'A' || value == 'B' || value == 'C'){
            price=150;
        }
        if ( value == 'Z' || value == 'Y' || value == 'X'){
            price=50;
        }else{
            price=100;
        }
        ShowOutputs output=new ShowOutputs(inputs.getDay(),inputs.getTime(), (char) price,inputs.getMovie(),inputs.getSeatNo(),inputs.getNoOfSeats());

        return output;
    }

}
