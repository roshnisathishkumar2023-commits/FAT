package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class AppTest 
{
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

   
    @Test
    public void testFineCalculationLogic() {
        int allowedDays = 14;
        int borrowedDays = 20;
        int extraDays = Math.max(0, borrowedDays - allowedDays);
        double finePerDay = 2.0;
        double totalFine = extraDays * finePerDay;
        
        assertTrue("Fine should be 12.0 for 6 extra days", totalFine == 12.0);
    }
}
