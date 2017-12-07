package th.ac.kmitl.science.comsci.example.controller;

import java.util.HashMap;
import th.ac.kmitl.science.comsci.example.controllers.TaxInvoiceDTO;
import org.junit.Test;

public class TestDTO 
{
    TaxInvoiceDTO taxInvoiceDTO = null;
    @Test
    public void inputDataToDTO()
    {
        HashMap <String, double[]> PoSNameAmountPrice = new HashMap <String, double[]>();
        double [] pos1 = {1, 2342.5};
        double [] pos2 = {2, 2342.5};
        double [] pos3 = {3, 2342.5};
        PoSNameAmountPrice.put("massage", pos1);
        PoSNameAmountPrice.put("icecream", pos2);
        PoSNameAmountPrice.put("noodles", pos3);
        taxInvoiceDTO = new TaxInvoiceDTO();
        taxInvoiceDTO.setCustomerCompanyName("Test DTO.Co");
        taxInvoiceDTO.setAddress("th/ac, road kmitl, soi science, District comsci, example, Controller");
        taxInvoiceDTO.setTaxID("1234567890AB");
        taxInvoiceDTO.setCustomerName("Test DTO");
        taxInvoiceDTO.setCustomerPhoneNumber("0812345678");
        taxInvoiceDTO.setCustomerEmail("TestDTO@test.com");
        taxInvoiceDTO.setPoSNameAmountPrice(PoSNameAmountPrice);
        taxInvoiceDTO.setTotalPrice(pos1[1]+pos2[1]+pos3[1]);
        System.out.println( 
                            taxInvoiceDTO.getCustomerCompanyName()+ "\n" +
                            taxInvoiceDTO.getAddress()+ "\n" +
                            taxInvoiceDTO.getTaxID()+ "\n" +
                            taxInvoiceDTO.getCustomerName()+ "\n" +
                            taxInvoiceDTO.getCustomerPhoneNumber()+ "\n" +
                            taxInvoiceDTO.getCustomerEmail()+ "\n" +
                            taxInvoiceDTO.getTotalPrice() 
                           );
        for(HashMap.Entry<String, double[]> entry : taxInvoiceDTO.getPoSNameAmountPrice().entrySet())
        {
            double[] arrayOfAmountAndPrice = entry.getValue();
            System.out.println(entry.getKey());
            System.out.println(arrayOfAmountAndPrice[0]);
            System.out.println(arrayOfAmountAndPrice[1]);
        }
    }
}
