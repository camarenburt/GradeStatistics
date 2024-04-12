// Import the HashMap class
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, Integer> grades = new HashMap<String, Integer>();
        int highest = 0;
        int lowest = 100;
        double total = 0;
        String tempLow = "";
        String tempHigh = "";

        // Add keys and values (Country, City)
        grades.put("Statistics", 93);
        grades.put("Programming", 97);
        grades.put("CSP", 89);
        grades.put("Physics", 94 );

        System.out.println("Grades by Subject: ");
        for(String grade : grades.keySet()){
            total += grades.get(grade);
            System.out.printf("%-15s%10d",grade, grades.get(grade));
            System.out.println();
            if (grades.get(grade) >= highest){
                highest = grades.get(grade);
                tempHigh = grade;
            }
            if(grades.get(grade) <= lowest){
                lowest = grades.get(grade);
                tempLow = grade;
            }
        }

        System.out.println("\nNumber of Classes: " + grades.size());

        System.out.println("\nLowest Grade \nSubject: " + tempLow + "\nGrade: " + lowest);

        System.out.println("\nHighest Grade \nSubject: " + tempHigh + "\nGrade: " + highest);

        System.out.println("\nOverall Average: " + (total/grades.size()));


    }
}