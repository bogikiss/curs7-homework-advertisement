package org.fasttrackit.won14.curs7.homework7;

public class EMail implements Advertisement{
    private static final String NAME_OF_PLATFORM = "E-mail";

    @Override
    public String getName() {
        return NAME_OF_PLATFORM;
    }

    @Override
    public Integer BudgetinEur() {
        return 20;
    }

    @Override
    public String Airing() {
        return "Monday";
    }

    @Override
    public String Language() {
        return "English";
    }
}
