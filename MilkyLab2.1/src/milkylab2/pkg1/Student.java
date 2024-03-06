
package milkylab2.pkg1;


     public class Student {
    private String Firstname;
    private String Lastname;
    private int Age;
    private boolean isMinor;

    
      public Student(String Firstname, String Lastname, int Age)
    {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Age = Age;
        
         if(this.Age<18)
        {
            isMinor = true;
           IncreaseAge();
        }else{
            isMinor = false;
        }
       
    }
      public String getname(){
  
        return Lastname + ", " + Firstname;
    }
       public void IncreaseAge(){
            Age++;
            if(Age >= 18)
            {
                isMinor=false;
            }

    }
       public String toString()
   {
    String decider;
    if(isMinor==true){
    decider = "Minor";
    }
    else{
    decider = "Adult";
}
String result = getname() + " - " + Integer.toString(Age) + " - " + decider;
return result;
}

    }



