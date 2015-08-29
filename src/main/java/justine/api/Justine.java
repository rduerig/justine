package justine.api;

import java.util.List;

import justine.api.data.Channel;
import justine.api.data.Follow;
import justine.api.parameters.DateSortDirection;

import com.google.common.base.Optional;

/**
 * @author rduerig
 */
public interface Justine {

	List<Follow> getChannelFollows(Optional<Integer> limit,
			Optional<Integer> offset, Optional<DateSortDirection> direction);

	Channel getChannel();

}
