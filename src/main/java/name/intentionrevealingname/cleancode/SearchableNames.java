package src.main.java.name.intentionrevealingname.cleancode;

public class SearchableNames {
/*    My personal preference is that single-letter names can ONLY be used as local variables inside short methods.
    The length of a name should correspond to the size of its scope [N5]. If a variable or constant might be seen or used in multiple places in a body of code,
    it is imperative to give it a search-friendly name.
    Once again compare:

    for (int j = 0; j < 34; j++) {
        s +  = (t[ j]* 4)/ 5;
    }
    to : */

    int realDaysPerIdealDay = 4;
    const int WORK_DAYS_PER_WEEK = 5;
    int sum = 0; for (int j = 0; j < NUMBER_OF_TASKS;j++) {
        int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
        int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
        sum += realTaskWeeks;
    }
/*    Note that sum, above, is not a particularly useful name but at least is searchable. The intentionally named code makes for a longer function,
    but consider how much easier it will be to find WORK_DAYS_PER_WEEK than to find all the places where 5 was
    used and filter the list down to just the instances with the intended meaning.*/

}
