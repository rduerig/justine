package justine.api;

import java.util.List;

import com.google.common.base.Optional;

import justine.api.data.Follow;
import justine.api.parameters.DateSortDirection;

/**
 * @author rduerig
 */
public interface Justine {
	
	List<Follow> getChannelFollows(Optional<Integer> limit, Optional<Integer> offset, Optional<DateSortDirection> direction);

}
