package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 first_name last_name
 */
public class List {
    // declare int status
    private String title, date, des, complete;
    // initialize status to incomplete
    public List()
    {
        this.title = "";
        this.date = "";
        this.des = "";
        this.complete = "Incomplete";
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDes() {
        return des;
    }

    public String getComplete() {
        return complete;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

}