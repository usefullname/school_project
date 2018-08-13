package com.office.pojo;

public class Ssubmit {
    private Integer ssn;

    private Integer ano;

    private Integer vno;

    private String ssname;

    private String ssdepartment;

    private String sssname;

    private String ssstype;

    private String sssnumber;

    private Float sstime;

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getVno() {
        return vno;
    }

    public void setVno(Integer vno) {
        this.vno = vno;
    }

    public String getSsname() {
        return ssname;
    }

    public void setSsname(String ssname) {
        this.ssname = ssname == null ? null : ssname.trim();
    }

    public String getSsdepartment() {
        return ssdepartment;
    }

    public void setSsdepartment(String ssdepartment) {
        this.ssdepartment = ssdepartment == null ? null : ssdepartment.trim();
    }

    public String getSssname() {
        return sssname;
    }

    public void setSssname(String sssname) {
        this.sssname = sssname == null ? null : sssname.trim();
    }

    public String getSsstype() {
        return ssstype;
    }

    public void setSsstype(String ssstype) {
        this.ssstype = ssstype == null ? null : ssstype.trim();
    }

    public String getSssnumber() {
        return sssnumber;
    }

    public void setSssnumber(String sssnumber) {
        this.sssnumber = sssnumber == null ? null : sssnumber.trim();
    }

    public Float getSstime() {
        return sstime;
    }

    public void setSstime(Float sstime) {
        this.sstime = sstime;
    }
}