

import java.util.*;

public class KySu {

    private String nganhDT;

    public void nhapKySu(){

        Nhap nh=new Nhap();

        nhapCanBo();

        System.out.print(" Nhap nganh dao tao: ");

        nganhDT=nh.nhapString();

    }

    public void hienThiKS(){

        hienThiCB();

        System.out.println(" Nganh dao tao: "+nganhDT);

    }

}