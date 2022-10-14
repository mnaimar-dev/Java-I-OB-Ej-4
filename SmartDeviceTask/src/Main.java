import com.company.SmartDevice;
import com.company.SmartPhone;
import com.company.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartWatch myWatch = new SmartWatch("Xiaomi", "Miband 7", 2022, 150.0, 1050, "Sport", true);

        SmartPhone myPhone = new SmartPhone("Apple", "iPhone 14", 2022, 1500.0, 1060, "Verizon", 4, true);


        myWatch.watchHour();

        System.out.println(myWatch);

        myPhone.call();

        System.out.println(myPhone);
    }
}