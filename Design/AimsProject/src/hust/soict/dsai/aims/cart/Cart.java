package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Đĩa đã được thêm");
        } else {
            System.out.println("Giỏ hàng gần đầy");
        }
    }
 //2.1 Phương thức mới: Thêm danh sách DVD từ một mảng
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("Đĩa " + disc.getTitle() + " đã được thêm");
            } else {
                System.out.println("Giỏ hàng đầy, không thể thêm " + disc.getTitle());
                break;
            }
        }
    }
  //2.2 addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
    	  if(qtyOrdered+2<=MAX_NUMBERS_ORDERED) {
    		  itemsOrdered[qtyOrdered]= dvd1;
    		  qtyOrdered ++;
    		  System.out.println("Đĩa" + dvd1.getTitle()+ "đã được thêm");
    		  itemsOrdered[qtyOrdered]=dvd2;
    		  qtyOrdered ++;
    		  System.out.println("Đĩa" + dvd2.getTitle()+ "đã được thêm");
    	  }else if(qtyOrdered+ 2 <= MAX_NUMBERS_ORDERED){
    		  System.out.println("đầy rồi!");
    	  }
    	  
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int n= -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                n = i;
                break;
            }
        }
        if (n != -1) {
            for (int i = n; i < qtyOrdered - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            qtyOrdered--;
        } else {System.out.println("Không tìm thấy");
        }
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
        System.out.println((i + 1) + ". " + itemsOrdered[i]);
        }
        System.out.printf("Total cost: %f \n", totalCost());
        System.out.println("***************************************************");
    }
    public void searchById(int id) {
        if (id > 0 && id <= qtyOrdered) {
            System.out.println("Found DVD: " + itemsOrdered[id]);
        } else {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    public double totalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}