package com.export.exportTool.model;

public class ExObject {

    private String nId;

    private Integer kbmSouc;

    private String kbmSbj;

    private String kbmCont;

    private String kbmAndes;

    private String kbmSolu;

    //
    private String kbmType;

    public String getKbmType() {
        return kbmType;
    }

    public void setKbmType(String kbmType) {
        this.kbmType = kbmType;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public Integer getKbmSouc() {
        return kbmSouc;
    }

    public void setKbmSouc(Integer kbmSouc) {
        this.kbmSouc = kbmSouc;
    }

    public String getKbmSbj() {
        return kbmSbj;
    }

    public void setKbmSbj(String kbmSbj) {
        this.kbmSbj = kbmSbj;
    }

    public String getKbmCont() {
        return kbmCont;
    }

    public void setKbmCont(String kbmCont) {
        this.kbmCont = kbmCont;
    }

    public String getKbmAndes() {
        return kbmAndes;
    }

    public void setKbmAndes(String kbmAndes) {
        this.kbmAndes = kbmAndes;
    }

    public String getKbmSolu() {
        return kbmSolu;
    }

    public void setKbmSolu(String kbmSolu) {
        this.kbmSolu = kbmSolu;
    }

    @Override
    public String toString() {
        return "ExObject{" +
                "nId='" + nId + '\'' +
                ", kbmSouc=" + kbmSouc +
                ", kbmSbj='" + kbmSbj + '\'' +
                ", kbmCont='" + kbmCont + '\'' +
                ", kbmAndes='" + kbmAndes + '\'' +
                ", kbmSolu='" + kbmSolu + '\'' +
                ", kbmType='" + kbmType + '\'' +
                '}';
    }
}
