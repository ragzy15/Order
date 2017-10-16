package com.example.order;


public class Food {
    
    int uid;
    int oid;
    int mj;
    int aj;
    int lj;
    int os;
    int cs;

    int pt;
    int cw;
    int fs;
    int gp;
    int dm;

    int vt;
    int bt;
    int vp;
    int cp;
    int pa;

    int rc;
    int ic;
    int cb;

    public Food(){

    }
    // constructor
    public Food(int or_id, int moj, int aoj, int loj, int oos, int cos,
                int pot, int cow, int fos, int gop, int dom,
                int vot, int bot, int vop, int cop, int pao, int roc, int ioc, int cob){
        this.oid = or_id;
        this.mj = moj;
        this.aj = aoj;
        this.lj = loj;
        this.os = oos;
        this.cs = cos;
        this.pt = pot;
        this.cw = cow;
        this.fs = fos;
        this.gp = gop;
        this.dm = dom;
        this.vt = vot;
        this.bt = bot;
        this.vp = vop;
        this.cp = cop;
        this.pa = pao;
        this.rc = roc;
        this.ic = ioc;
        this.cb = cob;
    }

    // constructor
    public Food(int moj, int aoj, int loj, int oos, int cos,
                int pot, int cow, int fos, int gop, int dom,
                int vot, int bot, int vop, int cop, int pao, int roc, int ioc, int cob){
        this.mj = moj;
        this.aj = aoj;
        this.lj = loj;
        this.os = oos;
        this.cs = cos;
        this.pt = pot;
        this.cw = cow;
        this.fs = fos;
        this.gp = gop;
        this.dm = dom;
        this.vt = vot;
        this.bt = bot;
        this.vp = vop;
        this.cp = cop;
        this.pa = pao;
        this.rc = roc;
        this.ic = ioc;
        this.cb = cob;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getMj() {
        return mj;
    }

    public void setMj(int mj) {
        this.mj = mj;
    }

    public int getAj() {
        return aj;
    }

    public void setAj(int aj) {
        this.aj = aj;
    }

    public int getLj() {
        return lj;
    }

    public void setLj(int lj) {
        this.lj = lj;
    }

    public int getOs() {
        return os;
    }

    public void setOs(int os) {
        this.os = os;
    }

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getPt() {
        return pt;
    }

    public void setPt(int pt) {
        this.pt = pt;
    }

    public int getCw() {
        return cw;
    }

    public void setCw(int cw) {
        this.cw = cw;
    }

    public int getFs() {
        return fs;
    }

    public void setFs(int fs) {
        this.fs = fs;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    public int getVt() {
        return vt;
    }

    public void setVt(int vt) {
        this.vt = vt;
    }

    public int getBt() {
        return bt;
    }

    public void setBt(int bt) {
        this.bt = bt;
    }

    public int getVp() {
        return vp;
    }

    public void setVp(int vp) {
        this.vp = vp;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getRc() {
        return rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }

    public int getIc() {
        return ic;
    }

    public void setIc(int ic) {
        this.ic = ic;
    }

    public int getCb() {
        return cb;
    }

    public void setCb(int cb) {
        this.cb = cb;
    }


}
