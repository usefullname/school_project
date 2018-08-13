package com.office.pojo;

public class Sq extends SqKey {
    private String uuname;

    private String uudepartment;

    private String ustype;

    private String usname;

    private Integer usnumber;

    private String uaname;

    private Float utime;

    public String getUuname() {
        return uuname;
    }

    public void setUuname(String uuname) {
        this.uuname = uuname == null ? null : uuname.trim();
    }

    public String getUudepartment() {
        return uudepartment;
    }

    public void setUudepartment(String uudepartment) {
        this.uudepartment = uudepartment == null ? null : uudepartment.trim();
    }

    public String getUstype() {
        return ustype;
    }

    public void setUstype(String ustype) {
        this.ustype = ustype == null ? null : ustype.trim();
    }

    public String getUsname() {
        return usname;
    }

    public void setUsname(String usname) {
        this.usname = usname == null ? null : usname.trim();
    }

    public Integer getUsnumber() {
        return usnumber;
    }

    public void setUsnumber(Integer usnumber) {
        this.usnumber = usnumber;
    }

    public String getUaname() {
        return uaname;
    }

    public void setUaname(String uaname) {
        this.uaname = uaname == null ? null : uaname.trim();
    }

    public Float getUtime() {
        return utime;
    }

    public void setUtime(Float utime) {
        this.utime = utime;
    }
}