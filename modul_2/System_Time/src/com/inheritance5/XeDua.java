package com.inheritance5;

public class XeDua extends Xe {
    private int vanToc;

    public XeDua(int vanToc, String color, String dongCo, String hang){
        super(color, dongCo, hang);
        this.vanToc = vanToc;
    }
    public XeDua(int vanToc) {
        this.vanToc = vanToc;
//        super("xanh", "diezel", "vinfast");
    }


    public int getVanToc() {
        return vanToc;
    }

    public void setVanToc(int vanToc) {
        this.vanToc = vanToc;
    }

    @Override
    public void tangToc() {
        System.out.println("Tăng tốc từ 0 - 100Km là 3s");
    }

    @Override
    public String toString() {
        return "Đây là xe đua có " + getDongCo() + super.toString();
    }


}
