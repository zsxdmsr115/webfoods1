package com.example.demo.bean;

import java.io.Serializable;

public class Resfood implements Serializable {
    private static final long serialVersionUID = 1L;


    private Integer fid;
    private String fname;
    private Double normprice;
    private Double realprice;
    private String detail;
    private String fphoto;

    private Integer num;


    public Resfood(Integer fid, String fname, Double normprice, Double realprice, String detail, String fphoto,
                   Integer num) {
        super();
        this.fid = fid;
        this.fname = fname;
        this.normprice = normprice;
        this.realprice = realprice;
        this.detail = detail;
        this.fphoto = fphoto;
        this.num = num;
    }

    public Resfood() {
        super();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Double getNormprice() {
        return normprice;
    }

    public void setNormprice(Double normprice) {
        this.normprice = normprice;
    }

    public Double getRealprice() {
        return realprice;
    }

    public void setRealprice(Double realprice) {
        this.realprice = realprice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getFphoto() {
        return fphoto;
    }

    public void setFphoto(String fphoto) {
        this.fphoto = fphoto;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Resfood [fid=" + fid + ", fname=" + fname + ", normprice=" + normprice + ", realprice=" + realprice
                + ", detail=" + detail + ", fphoto=" + fphoto + ", num=" + num + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((detail == null) ? 0 : detail.hashCode());
        result = prime * result + ((fid == null) ? 0 : fid.hashCode());
        result = prime * result + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result + ((fphoto == null) ? 0 : fphoto.hashCode());
        result = prime * result + ((normprice == null) ? 0 : normprice.hashCode());
        result = prime * result + ((num == null) ? 0 : num.hashCode());
        result = prime * result + ((realprice == null) ? 0 : realprice.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Resfood other = (Resfood) obj;
        if (detail == null) {
            if (other.detail != null)
                return false;
        } else if (!detail.equals(other.detail))
            return false;
        if (fid == null) {
            if (other.fid != null)
                return false;
        } else if (!fid.equals(other.fid))
            return false;
        if (fname == null) {
            if (other.fname != null)
                return false;
        } else if (!fname.equals(other.fname))
            return false;
        if (fphoto == null) {
            if (other.fphoto != null)
                return false;
        } else if (!fphoto.equals(other.fphoto))
            return false;
        if (normprice == null) {
            if (other.normprice != null)
                return false;
        } else if (!normprice.equals(other.normprice))
            return false;
        if (num == null) {
            if (other.num != null)
                return false;
        } else if (!num.equals(other.num))
            return false;
        if (realprice == null) {
            return other.realprice == null;
        } else return realprice.equals(other.realprice);
    }


}
