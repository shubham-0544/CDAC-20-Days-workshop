import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		writeVehicles();
		readVehicles(); 
	}

	public static void readVehicles() {
		List<Vehicle> list = new ArrayList<Vehicle>(); 
		
		try(FileInputStream fin = new FileInputStream("Vehicles.db")){
			try(DataInputStream din = new DataInputStream(fin)){
				 while(true) {
					 Vehicle m = new Vehicle(); 
					 m.setVehicleId(din.readInt());
					 m.setModel(din.readUTF());
					 m.setType(din.readUTF());
					 m.setPrice(din.readDouble());
					 list.add(m); 
				 }
			}
		}
		catch (Exception e) {	
		}
		list.forEach(e -> System.out.println(e));
		
	}

	public static void writeVehicles() {
		
		List<Vehicle> list = new ArrayList<Vehicle>(); 
		
		list.add(new Vehicle(1, "BMW M5","Sedans" , 1.99));
		list.add(new Vehicle(2, "Audi RS 7","Hatchbacks" ,2.07));
		list.add(new Vehicle(3, "Lamborghini Urus","SUV's" ,4.18));
		
		try(FileOutputStream fout = new FileOutputStream("Vehicles.db")){
			try(DataOutputStream dout = new DataOutputStream(fout)){
				for(Vehicle m : list) {
					dout.writeInt(m.getVehicleId());
					dout.writeUTF(m.getModel());
					dout.writeUTF(m.getType());
					dout.writeDouble(m.getPrice());
				}
			} 
			System.out.println("Vehicles saved..");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
