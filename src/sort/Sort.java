package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import isort.ISort;

public class Sort<K, V> implements ISort<K, V>{


	@Override
	public List<K> sortMapByValue(HashMap<K, V> map) {

		List<Map.Entry<K, V>> list_data = new ArrayList(map.entrySet());
		
		Collections.sort(list_data, new Comparator<Map.Entry<K, V>>(){

			
			@Override
			public int compare(Entry<K, V> arg0, Entry<K, V> arg1) {
				
				
				
				if(arg0.getValue() != null && arg1.getValue() != null ){
					return arg1.getValue() - arg0.getValue();
				}else if (arg0.getValue() != null && arg1.getValue() != null && arg0.getValue().toString().equals(arg1.getValue().toString())){
					return 0;
				}else{
					return -1;
				}
				
			}
			
			
		});
		
		return null;
	}
	
}


class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1.getClass().equals("Integer")){
			return ;
		}
		return 0;
	}
	
}