public class check {
    private int wha = 2;
    private String str;
    public void call(){
        System.out.println(wha);
    }
    public String setCall(String str){
        String lower = str.toLowerCase();
        if(lower == "neel" || lower == "kritagni"){
            this.str = "god";
        }
        else{
            this.str ="mortal";
        }
        return this.str;
    }


}
