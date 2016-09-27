package tutorial.server;

import org.apache.thrift.TException;
import tutorial.MultiplicationService;

/**
 * Created by ditkin on 9/27/16.
 */
public class MultiplicationHandler implements MultiplicationService.Iface {
	@Override
	public int multiply(int n1, int n2) throws TException {
		return n1 * n2;
	}
}
