package djr.storm;

import org.apache.storm.trident.operation.BaseFunction;
import org.apache.storm.trident.operation.TridentCollector;
import org.apache.storm.trident.tuple.TridentTuple;
import org.apache.storm.tuple.Values;

public class CSVSplit extends BaseFunction{

	@Override
	public void execute(TridentTuple tuple, TridentCollector collector) {
		// TODO Auto-generated method stub
		for(String word: tuple.getString(0).split(",")) {
	         if(word.length() > 0) {
	            collector.emit(new Values(word));
	         }
	      }
	}
}
