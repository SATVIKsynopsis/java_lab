class program3 {
    public static void main(String[] args) {
        int day = 27;  
        String weekDay;

        switch (day) {
            case 1: weekDay = "Sunday"; break;
            case 2: weekDay = "Monday"; break;
            case 3: weekDay = "Tuesday"; break;
            case 4: weekDay = "Wednesday"; break;
            case 5: weekDay = "Thursday"; break;
            case 6: weekDay = "Friday"; break;
            case 7: weekDay = "Saturday"; break;
            default: weekDay = "Invalid Day"; 
        }

        System.out.println("Week Day: " + weekDay);
    }
}
