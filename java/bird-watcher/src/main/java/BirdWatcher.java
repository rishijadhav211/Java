
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] lastWeekCount={0, 2, 5, 3, 7, 8, 4};
    private final int MIN_BIRDS_FOR_BUSY_DAY= 5;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return lastWeekCount;
    }

    public int getToday() {
        int sizeofbirdsPerDay= birdsPerDay.length;
        return birdsPerDay[sizeofbirdsPerDay-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int count:birdsPerDay){
            if(count==0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int firstNumberOfDays) {
        if(firstNumberOfDays > birdsPerDay.length){
            firstNumberOfDays=birdsPerDay.length;
        }

        int totalVisitCount=0;
        for(int i=0;i<firstNumberOfDays;i++){
            totalVisitCount+=birdsPerDay[i];
        }
        return totalVisitCount;
    }

    public int getBusyDays() {
        int countOfBusyDays=0;

        for(int count:birdsPerDay){
            if(count>=MIN_BIRDS_FOR_BUSY_DAY){
                countOfBusyDays++;
            }
        }
        return countOfBusyDays;
    }
}
