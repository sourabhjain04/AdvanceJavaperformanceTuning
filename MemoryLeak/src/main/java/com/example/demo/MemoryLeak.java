import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leak")
public class MemoryLeak {

	private static List<byte[]> memoryList =
		    Collections.synchronizedList(new ArrayList<>());

		@GetMapping
		public String leak() {
		    byte[] data = new byte[1024 * 1024];
		    memoryList.add(data);

		    if(memoryList.size() > 50) {
		        memoryList.remove(0);
		    }

		    return "Managed size: " + memoryList.size();
		}
}