package com.junitBookMyShow.bookMyShow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.Date;

public class ticketProcessingTest {
    @Test
    public void generateTicket(){
        ticketProcessing ticketProcess=new ticketProcessing();
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'S',"OG",5,1,150);
       // ShowOutputs output=new ShowOutputs(inputs.getDay(),inputs.getTime(),inputs.getRow(),inputs.getMovie(),inputs.getSeatNo(),1);
        ticketProcessing tck=new ticketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals('S',inputs.getRow());
     }
}
