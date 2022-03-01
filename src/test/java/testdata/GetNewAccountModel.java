package testdata;

import models.SalesForceAccountModel;
import utilities.GenerateFakeMessage;

public class GetNewAccountModel {

    public static SalesForceAccountModel getAccountWithAllFields() {
        return SalesForceAccountModel.builder()
                .accountName(GenerateFakeMessage.getAccountName())
                .phone(GenerateFakeMessage.getPhone())
                .fax(GenerateFakeMessage.getFax())
                .website(GenerateFakeMessage.getWebsite())
                .type("Analyst")
                .industry("Banking")
                .employees(GenerateFakeMessage.getEmployees())
                .annualRevenue(GenerateFakeMessage.getAnnualRevenue())
                .description(GenerateFakeMessage.getDescription())
                .billingStreet(GenerateFakeMessage.getBillingStreet())
                .shippingStreet(GenerateFakeMessage.getShippingStreet())
                .billingCity(GenerateFakeMessage.getBillingCity())
                .billingState(GenerateFakeMessage.getBillingState())
                .billingZip(GenerateFakeMessage.getBillingZip())
                .billingCountry(GenerateFakeMessage.getBillingCountry())
                .shippingCity(GenerateFakeMessage.getShippingCity())
                .shippingState(GenerateFakeMessage.getShippingState())
                .shippingZip(GenerateFakeMessage.getShippingZip())
                .shippingCountry(GenerateFakeMessage.getShippingCountry())
                .build();
    }
}
