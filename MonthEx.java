import java.util.Calendar;

public class MonthEx {
    public static void main(String[] args) {
        Month thisMonth = null;
        thisMonth = Month.SEPTEMBER;

        if(thisMonth == Month.SEPTEMBER){
            System.out.println("이번 달은 9월달 입니다.");
        }else{
            System.out.println("이번 달은 9월달이 아니다.");
        }

        Calendar c = Calendar.getInstance();
        int getMonth = c.get(Calendar.DAY_OF_MONTH);
        switch(getMonth){
            case 1: thisMonth = Month.JANUARY;
            case 2: thisMonth = Month.FEBRUARY;
            case 3: thisMonth = Month.MARCH;
            case 4: thisMonth = Month.APRIL;
            case 5: thisMonth = Month.MAY;
            case 6: thisMonth = Month.JUNE;
            case 7: thisMonth = Month.JULY;
            case 8: thisMonth = Month.AUGUST;
            case 9: thisMonth = Month.SEPTEMBER;
            case 10: thisMonth = Month.OCTOBER;
            case 11: thisMonth = Month.NOVEMBER;
            case 12: thisMonth = Month.DECEMBER;
        }
        System.out.println("이번 달은: " + thisMonth);
    }
}
