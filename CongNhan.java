package QuanLyCanBo

import java.util.*;

class CongNhan extends CanBo{

    private String bac;

    public void nhapCongNhan(){

        nhapCanBo();

        Nhap nh=new Nhap();

        System.out.print(" Nhap bac: ");

        bac=nh.nhapString();

    }

    public void hienThiCN(){

        hienThiCB();

        System.out.println(" Bac: "+bac);

    }

}