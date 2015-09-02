package justine.internal;

import java.io.IOException;
import java.util.List;

import justine.api.Justine;
import justine.api.data.Channel;
import justine.api.data.Follow;
import justine.api.parameters.DateSortDirection;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.RequestLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpTransport;
import com.google.common.base.Optional;
import com.google.common.io.Closeables;

/**
 * @author rduerig
 */
public class JustineImpl implements Justine {

	public List<Follow> getChannelFollows(Optional<Integer> limit,
			Optional<Integer> offset, Optional<DateSortDirection> direction) {
		// TODO getChannelFollows
		return null;
	}

	public Channel getChannel() {
		// TODO getChannel

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(
				"https://api.twitch.tv/kraken/channels/test_channel");
		httpGet.addHeader("Accept", "application/vnd.twitchtv.v3+json");
		CloseableHttpResponse response1;
		try {
			response1 = httpclient.execute(httpGet);
			try {
				System.out.println(response1.getStatusLine());
				HttpEntity entity1 = response1.getEntity();
				entity1.writeTo(System.out);
				EntityUtils.consume(entity1);
			} finally {
				Closeables.close(response1, false);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
		}
		
		return null;
	}

}
