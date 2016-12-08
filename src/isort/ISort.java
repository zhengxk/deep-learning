package isort;

import java.util.HashMap;
import java.util.List;


public interface ISort<K, V> {

	public List<K> sortMapByValue(HashMap<K, V> map);
	
}
