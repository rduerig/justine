package justine.internal;

import justine.api.Justine;
import justine.api.data.Channel;

import org.junit.Test;

/**
 * @author rduerig
 */
public class JustineImplTest {

	@Test
	public void test() {
		Justine j = new JustineImpl();
		Channel channel = j.getChannel();
	}

}
