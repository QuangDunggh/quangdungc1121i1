package comparableVSComparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        if(o2.getAge() - o1.getAge() < 0) {
            return 1;
        } else if(o2.getAge() - o1.getAge() > 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
