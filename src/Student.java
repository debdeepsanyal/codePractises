public class Student {
    private String name;
    private String id;
    private String section;
    public Student(String name, String id, String section){
        this.name = name;
        this.id = id;
        this.section = section;
    }
    public String print(){
        System.out.println("Name ->" + name + " id ->" + id + " section ->" + section);
        return "";
    }
}
