package com.pro.rev.POJO;

public class UserInfo {

    public int id;
    public String name;
    public String Lastname;

  public  UserInfo(int id, String name,String Lastname){
        this.id=id;
        this.name=name;
        this.Lastname= Lastname;

    }

  public  int getId(){
        return id;
    }
   public void setId(int id){
       this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
