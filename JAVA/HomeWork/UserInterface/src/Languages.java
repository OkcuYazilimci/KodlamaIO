import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Languages {
	//private static Map<Integer, String> CodeMap;
	private static ArrayList<Data> dataList;
	//private static Scanner input = new Scanner(System.in);
	private int ID = 0;
	
	public Languages() {
		//CodeMap = new HashMap<>();
		dataList = new ArrayList<>();
	}
 	
	//adds new language
	void addUser(String name)
	{   
		boolean alreadyExists = false;
		for(Data data : dataList) {
			if(data.getValue().equals(name)) {
				alreadyExists = true;
				break;
			}
		}
		if (alreadyExists == false) {
        Data newData = new Data(ID, name);
        dataList.add(newData);
        ID++;
        }
		else {
			System.out.println("----------------------------------------");
			System.out.println("This language already exists!");
			System.out.println("----------------------------------------");
		}
        
		/*if (!(CodeMap.containsValue(name))) {
			CodeMap.put(ID, name);
			ID++;
		}
		else {
			System.out.println("Bu yazilim dili sistemde mevcuttur!");
		}*/
	}
	// It list the codes
	void showUsers()
	{	System.out.println("----------------------------------------");
		for (Data data : dataList) {
			System.out.println("ID: " + data.getKey() + "| Language: " + data.getValue());
		}
		System.out.println("----------------------------------------");
		/*
		 for (Map.Entry<Integer, String> entry : CodeMap.entrySet()) {
	            System.out.println("ID: " + entry.getKey() + "| Language: " + entry.getValue());
	        }*/
	}
	
	  public void deleteUser(int key) {
	        for (int i = 0; i < dataList.size(); i++) {
	            if (dataList.get(i).getKey() == key) {
	                dataList.remove(i);
	                // Eğer silme işlemi başarıyla gerçekleşirse, ID'leri güncelle
	                for (int j = i; j < dataList.size(); j++) {
	                    dataList.get(j).setKey(j);
	                }
	                break;
	            }
	        }
            	System.out.println("ID could not found");
	  }
}
