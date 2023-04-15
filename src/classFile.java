public class classFile {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++){
            Student student = new Student(switch (i){
                case 1 -> "Debjyoti";
                case 2 -> "Debottam";
                case 3 -> "Anusua";
                case 4 -> "Alok";
                case 5 -> "Anusa";
                default -> "anonymous";



            }, "CS1000230" + i,
                    "B16");
            System.out.println(student.print());
        }

    }
}
