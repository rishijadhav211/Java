public class CarsAssemble {
    private final int PRODUCTION_PER_UNIT_SPEED = 221;
    private final int FAILURE_PERCENTAGE_FOR_10 = 100-77;
    private final int FAILURE_PERCENTAGE_FOR_9 = 100-80;
    private final int FAILURE_PERCENTAGE_FOR_5_TO_8 = 100-90;
    
    
    public double productionRatePerHour(int speed) {
        double totalProduced=speed*PRODUCTION_PER_UNIT_SPEED;
        if(speed==10){
            return  totalProduced - getWorking(totalProduced,FAILURE_PERCENTAGE_FOR_10);
        }
        if(speed==9){
            return totalProduced- getWorking(totalProduced,FAILURE_PERCENTAGE_FOR_9);
        }
        if(speed<=8 && speed >= 5){
            return totalProduced- getWorking(totalProduced,FAILURE_PERCENTAGE_FOR_5_TO_8);
        }
        return totalProduced;
    }

    private double getWorking(double totalProduced,int FailurePercentage) {
        return totalProduced * FailurePercentage / 100;
    }

    public int workingItemsPerMinute(int speed) {
        if(speed==0) return 0;
        double workingCars= productionRatePerHour(speed);

        return (int)workingCars/60;
    }
}
