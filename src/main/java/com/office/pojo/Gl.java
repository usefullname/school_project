package com.office.pojo;

public class Gl {
    private Integer glno;

    private String glname;

    private String glpass;

    public Integer getGlno() {
        return glno;
    }

    public void setGlno(Integer glno) {
        this.glno = glno;
    }

    public String getGlname() {
        return glname;
    }

    public void setGlname(String glname) {
        this.glname = glname == null ? null : glname.trim();
    }

    public String getGlpass() {
        return glpass;
    }

    public void setGlpass(String glpass) {
        this.glpass = glpass == null ? null : glpass.trim();
    }
}