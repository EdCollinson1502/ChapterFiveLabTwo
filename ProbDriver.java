
/**
 * Write a description of class ProbDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProbDriver
{
    public static void main(String[] args) {
        Probability p1 = new Probability(6, 37);
        Probability p2 = new Probability(171, 377);
        System.out.println(p1.probabilityAND(p2));
        
    }
}
