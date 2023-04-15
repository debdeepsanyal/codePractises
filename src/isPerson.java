public class isPerson {
    private String First_name;
    private String Last_name;
    private int age;
    public isPerson(String First_name, String Last_name, int age){
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.age = age;
    }
    public String getFullName(){
        return First_name + " " + Last_name;
    }
    public boolean isTeen(){
        if (age>12 && age<20){
            return true;
        }
        else{
            return false;
        }
    }



}
