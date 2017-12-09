package th.ac.kmitl.science.comsci.example.models;

import org.junit.Assert;
import org.junit.Test;

public class TestAddressDTO {

    @Test
    public void inputDataToAddressDTO() {

        AddressDTO addressDTO = new AddressDTO();

        String postCode = "10330";
        String buildingName = "Siam Piwat Tower";
        String lineOne = "floor 8";
        String lineTwo = "Wang Mai, Khet Pathum Wan, Bangkok";
        String lineThree = "Thailand";
        String linefour = "siam";
        String lineFive = "siampiwat";
        String streetName = "Rama 1 Road";
        String buildingNumber = "989";
        int cityName = 21;
        int citySubDivisionName = 44;
        int countryId = 98;
        int countrySubDivisionId = 10;

        addressDTO.setPostCode(postCode);
        addressDTO.setBuildingName(buildingName);
        addressDTO.setLineOne(lineOne);
        addressDTO.setLineTwo(lineTwo);
        addressDTO.setLineThree(lineThree);
        addressDTO.setLinefour(linefour);
        addressDTO.setLineFive(lineFive);
        addressDTO.setStreetName(streetName);
        addressDTO.setCityName(cityName);
        addressDTO.setCitySubDivisionName(citySubDivisionName);
        addressDTO.setCountryId(countryId);
        addressDTO.setCountrySubDivisionId(countrySubDivisionId);
        addressDTO.setBuildingNumber(buildingNumber);

        Assert.assertEquals(addressDTO.getPostCode(), postCode);
        Assert.assertEquals(addressDTO.getBuildingName(), buildingName);
        Assert.assertEquals(addressDTO.getLineOne(), lineOne);
        Assert.assertEquals(addressDTO.getLineTwo(), lineTwo);
        Assert.assertEquals(addressDTO.getLineThree(), lineThree);
        Assert.assertEquals(addressDTO.getLinefour(), linefour);
        Assert.assertEquals(addressDTO.getLineFive(), lineFive);
        Assert.assertEquals(addressDTO.getStreetName(), streetName);
        Assert.assertEquals(addressDTO.getCityName(), cityName);
        Assert.assertEquals(addressDTO.getCitySubDivisionName(), citySubDivisionName);
        Assert.assertEquals(addressDTO.getCountryId(), countryId);
        Assert.assertEquals(addressDTO.getCountrySubDivisionId(), countrySubDivisionId);
        Assert.assertEquals(addressDTO.getBuildingNumber(), buildingNumber);
    }
}
