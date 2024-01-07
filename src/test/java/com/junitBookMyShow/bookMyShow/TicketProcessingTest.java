package com.junitBookMyShow.bookMyShow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.Date;

public class TicketProcessingTest {
    @Test
    public void generateTicketForMiddleClass(){
        ticketProcessing ticketProcess=new ticketProcessing();
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'S',"OG",5,1);
       // ShowOutputs output=new ShowOutputs(inputs.getDay(),inputs.getTime(),inputs.getRow(),inputs.getMovie(),inputs.getSeatNo(),1);
        ticketProcessing tck=new ticketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
       // Assertions.assertEquals('S',ticket.getRow());
        Assertions.assertEquals(100 , ticket.getAmount());
     }

    @Test
      public void generateTicketForLowerClass() {
        ticketProcessing ticketProcess = new ticketProcessing();
        ShowInputs inputs = new ShowInputs(987392334, new Date(), new Time(2), 'Z', "OG", 5, 1);

        //ShowOutputs output = new ShowOutputs(inputs.getDay(), inputs.getTime(), inputs.getRow(), inputs.getMovie(), inputs.getSeatNo(), 1);
        ticketProcessing tck = new ticketProcessing();
        ShowOutputs ticket = tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
       // Assertions.assertEquals('Z', ticket.getRow());
        Assertions.assertEquals(50, ticket.getAmount());
    }
     @Test
       public void generateTicketForBalcony() {
         ticketProcessing ticketProcess = new ticketProcessing();
         ShowInputs inputs = new ShowInputs(987392334, new Date(), new Time(2), 'A', "OG", 5, 1);
         //ShowOutputs output = new ShowOutputs(inputs.getDay(), inputs.getTime(), inputs.getRow(), inputs.getMovie(), inputs.getSeatNo(), 1);
         ticketProcessing tck = new ticketProcessing();
         ShowOutputs ticket = tck.movieTicket(inputs);
         Assertions.assertNotNull(ticket);
        // Assertions.assertEquals('A', ticket.getRow());
         Assertions.assertEquals(150, ticket.getAmount());
     }
}