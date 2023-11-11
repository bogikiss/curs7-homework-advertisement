package org.fasttrackit.won14.curs7.homework7;

public class Print implements Advertisement{
    private static final String NAME_OF_PLATFORM = "Newspaper";
    @Override
    public String getName() {
        return NAME_OF_PLATFORM;
    }

    @Override
    public Integer BudgetinEur() {
        return 380;
    }

    @Override
    public String Airing() {
        return "Wednesday";
    }

    @Override
    public String Language() {
        return "English";
    }
}
