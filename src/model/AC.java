package model;

public class AC {

    int acNo;
    String company;
    public AC(int AcNo,String company){
        this.acNo= acNo;
        this.company= company;

    }


    public int getAcNo() {
        return acNo;
    }

    public String getCompany() {
        return company+"Company"+ "," +"acNo " + acNo;
    }
    }

