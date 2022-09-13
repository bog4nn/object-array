package Object;

public class Staff {
    private String name;
    private String adress;
    private int ages;

    //Contructor
    public Staff(){

    }
    public Staff(String name,String adress,int ages){
        this.name = name;
        this.adress = adress;
        this.ages= ages;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }
}
