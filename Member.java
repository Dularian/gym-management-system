package gymmanagementsystem;

public class Member {
	   private String name; 
	    private long phoneNumber;
	    private int age; 
	    private double fee;
	    private String paidFee;
	    private final String date;
	    private String exerciseChoice;
	  
	    
	     public Member(String name, long phoneNumber, int age, double fee, String paidFee,String date) {
	        this.name = name;
	        this.phoneNumber = phoneNumber;
	        this.age = age;
	        this.fee = fee;
	        this.paidFee = paidFee;
	        this.date = date;
	        
	       
	    }
	    public void setExcercise(String x){
	        exerciseChoice = x;
	    }
	   
	    public void setName(String x){
	        name = x;
	    }
	    public void setAge(int x){
	        age = x;
	    }
	    public void setPhoneNumber(Long x){
	        phoneNumber = x;
	    }
	    public void setFee(int x){
	    
	     fee = x;
	       
	    }
	    
	    public String getName(){
	    return name;
	    }
	    public int getAge(){
	    return age;
	    }
	    public long getPhoneNumber(){
	    return phoneNumber;
	    }
	      public double getFee(){
	        return fee;
	    }
	    public String getExcercise(){
	    return exerciseChoice;
	    }
	    @Override
	    public String toString() {
	        return "Name: " + name +
	                "\nAge: " + age +
	                "\nPhone :# " + phoneNumber +
	                "\nMembership Fee:" + "$" + fee+
	                "\nfee paid:" + paidFee+
	                "\nJoin date:" + date;
	        
	              
	              
	    }
	   
	   
	}

