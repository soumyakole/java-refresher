package com.soumya.corejava.enumdemo;

public enum WeekDays {
    SUNDAY(1,"Sunday Funday", true),
    MONDAY(2,"Marketing Monday", false),
    TUESDAY(3,"Trendy Tuesday", false),
    WEDNESDAY(4,"Wellness Wednesday", false),
    THURSDAY(5,"Thankful Thursday", false),
    FRIDAY(6, "Foodie Friday", false),
    SATURDAY(7, "Social Saturday", true);
    private int dayNum;
    private String daysGreeting;
    private boolean isWeekend;
    WeekDays(final int dayNum, final String daysGreeting, final boolean isWeekend) {
        this.dayNum = dayNum;
        this.daysGreeting = daysGreeting;
        this.isWeekend = isWeekend;
    }

    public String getDaysGreeting() {
        return daysGreeting;
    }

    public boolean getIsWeekend() {
        return isWeekend;
    }

    public int getDayNum(){
        return this.dayNum;
    }
}
