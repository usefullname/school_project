package com.office.pojo;

public class Rk {
    private Integer rkno;

    private Integer ano;

    private Integer sno;

    private String rknumber;

    private String rkperson;

    public Integer getRkno() {
        return rkno;
    }

    public void setRkno(Integer rkno) {
        this.rkno = rkno;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getRknumber() {
        return rknumber;
    }

    public void setRknumber(String rknumber) {
        this.rknumber = rknumber == null ? null : rknumber.trim();
    }

    public String getRkperson() {
        return rkperson;
    }

    public void setRkperson(String rkperson) {
        this.rkperson = rkperson == null ? null : rkperson.trim();
    }
}