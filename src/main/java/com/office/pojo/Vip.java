package com.office.pojo;

public class Vip {
    private Integer vno;

    private String vname;

    private String vpass;

    public Integer getVno() {
        return vno;
    }

    public void setVno(Integer vno) {
        this.vno = vno;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public String getVpass() {
        return vpass;
    }

    public void setVpass(String vpass) {
        this.vpass = vpass == null ? null : vpass.trim();
    }

    @Override
    public String toString() {
        return "Vip{" +
                "vno=" + vno +
                ", vname='" + vname + '\'' +
                ", vpass='" + vpass + '\'' +
                '}';
    }
}