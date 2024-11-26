package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static  int MAX_NUMBERS_IN_STORE = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    private int qtyInStore = 0;
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_NUMBERS_IN_STORE) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("Đĩa " + dvd.getTitle() + " đã được thêm vào kho.");
        } else {
            System.out.println("Kho đã đầy, không thể thêm đĩa.");
        }
    }

    // Phương thức xóa DVD khỏi kho
    public void removeDVD(DigitalVideoDisc dvd) {
        int index = -1; // Vị trí của DVD cần xóa
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            // Dịch chuyển các phần tử sau vị trí xóa lên trước
            for (int i = index; i < qtyInStore - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[qtyInStore - 1] = null; // Xóa phần tử cuối cùng
            qtyInStore--;
            System.out.println("Đĩa " + dvd.getTitle() + " đã được xóa khỏi kho.");
        } else {
            System.out.println("Không tìm thấy đĩa " + dvd.getTitle() + " trong kho.");
        }
    }
}

