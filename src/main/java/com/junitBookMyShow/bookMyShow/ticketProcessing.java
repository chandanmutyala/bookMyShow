package com.junitBookMyShow.bookMyShow;

public class ticketProcessing {

    public ShowOutputs movieTicket(ShowInputs inputs){

        char value = inputs.getRow();
        int price =0;

        if ( value == 'A' || value == 'B' || value == 'C'){
            price=150;
        }
        else if ( value == 'Z' || value == 'Y' || value == 'X'){
            price=50;
        }else{
            price=100;
        }
        ShowOutputs output=new ShowOutputs(inputs.getDay(),inputs.getTime(),inputs.getRow(),inputs.getMovie(),inputs.getSeatNo(), price ,inputs.getNoOfSeats());

        return output;
    }

}
