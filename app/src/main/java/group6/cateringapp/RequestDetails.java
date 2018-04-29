package group6.cateringapp;

/**
 * Created by ssaze on 4/28/2018.
 */

public class RequestDetails {

    String date, time, occasion;
    String party_size, duration; int request_id;

    public void setRequest_id(int request_id){
        this.request_id = request_id;
    }
    public int getRequest_id(){
        return this.request_id;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }
    public String getDuration(){
        return this.duration;
    }

    public void setParty_size(String party_size){
        this.party_size = party_size;
    }
    public String getParty_size(){
        return this.party_size;
    }

    public void setDate(String date){
        this.date = date;
    }
    public String getDate (){
        return this.date;
    }

    public void setTime(String time){
        this.time = time;
    }
    public String getTime (){
        return this.time;
    }

    public void setOccasion(String occasion){
        this.occasion = occasion;
    }
    public String getOccasion (){
        return this.occasion;
    }

}
