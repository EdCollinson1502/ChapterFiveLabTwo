
/**
 * Write a description of class Probability here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Probability implements ProbabilityCalc, Comparable<Probability>
{
    private int favourable;
    private int sampleSpace;
    private double prob;
    
     /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 AND p2) = p1 * p2
     */
    public double probabilityAND(Probability p2){
        return this.prob * p2.prob;
    }
   
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 OR p2) = p1 + p2 - (p1 AND p2)  where p1 AND p2 is the "overlap"
     */
    public double probabilityOR(Probability p2, double overlap){
        return ((this.prob + p2.prob) - 0.15);
    }
    
    public Probability(int fav, int sample)
    {
        this.favourable = fav;
        this.sampleSpace = sample;
        prob = ((double)favourable/sampleSpace);
    }
    
    public int compareTo(Probability other) {
        if(this.prob > other.prob) {
            return 1;
        }
        else if(this.prob < other.prob) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
