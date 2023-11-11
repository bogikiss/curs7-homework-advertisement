package org.fasttrackit.won14.curs7.homework7;

public class Main {
    public static void main(String[] args) {
        Facebook facebookAd = new Facebook();
        EMail emailAd = new EMail();
        Print newspaperAd = new Print();

        Company myCompany = new Company("Brutaria A", facebookAd);

        System.out.println(myCompany.getAdvertisement().BudgetinEur());
    }
}
