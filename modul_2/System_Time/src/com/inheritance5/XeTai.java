package com.inheritance5;

public class XeTai extends Xe {
    public XeTai(String color, String dongCo, String hang){
        super(color,dongCo,hang);
    }

    @Override
    public void tangToc() {
        System.out.println("Tăng tốc từ 0 - 100km là 30s");
    }
}
