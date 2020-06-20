package com.demo.model;

public class Detailques {
    private Integer did;

    private Integer wrongques;

    private Integer store;

    private Integer iscorrect;

    private Integer transmit;

    private Integer qid;

    private String uid;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getWrongques() {
        return wrongques;
    }

    public void setWrongques(Integer wrongques) {
        this.wrongques = wrongques;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getIscorrect() {
        return iscorrect;
    }

    public void setIscorrect(Integer iscorrect) {
        this.iscorrect = iscorrect;
    }

    public Integer getTransmit() {
        return transmit;
    }

    public void setTransmit(Integer transmit) {
        this.transmit = transmit;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }
}