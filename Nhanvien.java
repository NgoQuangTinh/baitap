import java.util.*;


public class Nhanvien {
	  private String congViec;

	    public void NhapNhanVien(){

	        nhapCanBo();

	        System.out.print(" Nhap cong viec:");

	        Nhap nh = new Nhap();

	        congViec=nh.nhapString();

	    }

	    public void hienThiNV(){

	        hienThiCB();

	        System.out.println(" Cong viec: "+congViec);

	    }


}
