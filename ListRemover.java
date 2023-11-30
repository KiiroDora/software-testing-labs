import java.util.ArrayList;
import java.util.List;

public class ListRemover {
	public List<String> removeItem(List<String> list, String str) {
		list.remove(str);
		return list;
	}
}
