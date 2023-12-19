public class Lasagna {
    private final int COOKING_TIME_IN_MINS = 40; // cooking time is 40 minutes //
    // TODO change variable name
    private final int MINS_PREP_PER_LAYER =  2; // time for each layer
    
    public int expectedMinutesInOven(){
        return COOKING_TIME_IN_MINS;
    }
    
    public int remainingMinutesInOven(int actualMinutes){
        return COOKING_TIME_IN_MINS - actualMinutes;
    }

    public int preparationTimeInMinutes(int layers){
        return layers * MINS_PREP_PER_LAYER;
    }

    public int totalTimeInMinutes(int layers,int timeInOven){
        return this.preparationTimeInMinutes(layers)+timeInOven;
    }
}
