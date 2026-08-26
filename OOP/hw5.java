public class hw5 {
    public static void main(String[] args) {
        System.out.println("s1:-");
         holiday holiday1 = new holiday("Independence Day", 4, "July");
        holiday holiday2 = new holiday("Bastille Day", 14, "July");
        // holiday holiday3 = new holiday("New Year's Day", 1, "January");
        boolean ans= holiday1.innsamemonth( holiday2);
        System.out.println(ans);

        holiday[] arr={holiday1,holiday2};

        double ans2=holiday.avgday(arr);
        System.out.println(ans2);
    }
}

class holiday{
    String name;
    int day;
    String month;

    public holiday(String name,int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }

    public boolean innsamemonth(holiday holiday2){
       return this.month.equals(holiday2.month);

    }
    
    public static double avgday(holiday[] holidays){
        int sum=0;
        for(int i=0;i<holidays.length;i++){

            sum+=holidays[i].day;
        }
        
        return (double) sum/holidays.length;
    }

}
