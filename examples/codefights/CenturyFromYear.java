package codefights;

/**
 * CenturyFromYear
 */
public class CenturyFromYear {
    public static void main(String[] args) {
        CenturyFromYear centuryFromYear = new CenturyFromYear();
        System.out.println(centuryFromYear.ctfy(1905));
        System.out.println(centuryFromYear.ctfy(1700));
    }

    int ctfy(int year) {
        int result = 0;
        if ((year >= 1) && (year <= 2005)) {
            if ((year % 100) == 0)
                result = year / 100;
            else
                result = (year / 100) + 1;
        }

        return result;
    }
}
