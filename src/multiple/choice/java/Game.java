
package multiple.choice.java;
import java.util.*;
/**
 *
 * @author Kidus
 */
public class Game {
    private ArrayList<Question> questionSet;
    public Game(){
    questionSet = new ArrayList<Question>(); 
    String q = "Where does the sun rise?";
    String[] a = {"East" , "South" , "West" , "North"};
    
    questionSet.add(new Question(q, a, "East"));
    
    q = "Who invented the telephone?";
    a = new String[]{"Thomas Edison", "Michael Faraday", "James Watt", "Alexander Bell"};
    
    questionSet.add(new Question(q, a , "Alexander Bell"));
    q = "What is the capital of japan?";
    a = new String[]{"Beijing", "Tokyo", "Seoul", "Bangkok"};
    
    questionSet.add(new Question(q,a, "Tokyo"));
    
    Collections.shuffle(questionSet, new Random());
    }
}
