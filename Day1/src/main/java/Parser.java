import model.ElfBaggage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Parser {
	public static List<ElfBaggage> parseFile(Path path) throws IOException {
		Map<Integer, ElfBaggage> baggagesByElf = new HashMap<>();
		AtomicReference<Integer> counter = new AtomicReference<>(1);
		baggagesByElf.put(counter.get(), new ElfBaggage(counter.get()));


		Files.lines(path).forEach(line->{
			if (line.isEmpty()){
				counter.getAndSet(counter.get() + 1);
				baggagesByElf.put(counter.get(), new ElfBaggage(counter.get()));
			}
			else
				baggagesByElf.get(counter.get()).getCalories().add(Integer.parseInt(line));
		});
		return new ArrayList<>(baggagesByElf.values());
	}

}
