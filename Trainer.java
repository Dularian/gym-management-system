
package gymmanagementsystem;
import java.util.Date;
public class Trainer {
	
    private String name;
    private int age;
    private long phoneNumber;
    private String exerciseClass;
    private String date;
   
    
   
    public Trainer(String name, int age, long phoneNumber, String exerciseClass, String date){
       
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.exerciseClass = exerciseClass;
        this.date = date;
}

Trainer(String name, int age, long phoneNumber, String exerciseClass, Date d) {
	throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
																	// | Templates.
}

public void setName(String x) {
	name = x;
}

public void setAge(int x) {
	age = x;

}

public void setphoneNumber(long x) {
	phoneNumber = x;
}

public void setexerciseClass(String x) {
	exerciseClass = x;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public long phoneNumber() {
	return phoneNumber;
}

public String exerciseClass() {
	return exerciseClass;
}

@Override
public String toString() {
	return "Name: " + name + "\nAge: " + age + "\nPhone :# " + phoneNumber + "\nClass:" + exerciseClass + "\nHire Date:"
			+ date;
              
              
    }
   
    
}
