package djr.storm;

import org.apache.storm.trident.operation.BaseFunction;
import org.apache.storm.trident.operation.TridentCollector;
import org.apache.storm.trident.tuple.TridentTuple;
import org.apache.storm.tuple.Values;

public class FormatCall extends BaseFunction {

	@Override
	public void execute(TridentTuple tuple, TridentCollector collector) {
		// TODO Auto-generated method stub
		String fromMobileNumber = tuple.getString(0);
	    String toMobileNumber = tuple.getString(1);
	    collector.emit(new Values(fromMobileNumber + " - " + toMobileNumber));
	}
}
