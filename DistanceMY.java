public class DistanceMY { 
    private int miles;
    private int yards;
    public DistanceMY(){
        miles=2;
        yards=1500;
    } //DistanceMY means Distance in miles and yards.
    public DistanceMY(int miles,int yards){
        this.miles=miles;
        this.yards=yards;
    }
    public DistanceMY addDistances(DistanceMY d){
        int m,y;
        m=miles+d.miles;
        y=yards+d.yards;
        if(y>=1760){
            y-=1760;
            m+=1;
        }
        return new DistanceMY(m,y);
    }
    public void setDistance(int miles,int yards){
        this.miles=miles;
        this.yards=yards;
    }
    public void show(){
        System.out.println("Miles : "+miles);
        System.out.println("Yards : "+yards);
    }
}
