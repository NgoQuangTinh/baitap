package QuanLyCanBo

import java.util.*;


class CanBo{

    private String HoTen, GioiTinh,DiaChi;

    private int NamSinh;

    public void nhapCanBo(){

        Nhap nh=new Nhap();

        System.out.print(" Nhap ho ten: ");

        HoTen=nh.nhapString();

        System.out.print(" Nhap gioi tinh: ");

        GioiTinh=nh.nhapString();

        System.out.print(" Nhap dia chi: ");

        DiaChi=nh.nhapString();

        System.out.print(" Nhap nam sinh: ");

        NamSinh=nh.nhapInt();

    }

    public void hienThiCB(){

        System.out.println(" Ho ten: "+hoTen);

        System.out.println(" Dia Chi: "+ diaChi);

        System.out.println(" Nam sinh "+ namSinh);

        System.out.println(" Gioi tinh: "+gioiTinh);

    }

}