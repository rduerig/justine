package com.github.rduerig.justine.api;

import java.util.List;

import com.github.rduerig.justine.api.data.Follow;
import com.github.rduerig.justine.api.parameters.DateSortDirection;
import com.google.common.base.Optional;

/**
 * @author rduerig
 */
public interface Justine {
	
	List<Follow> getChannelFollows(Optional<Integer> limit, Optional<Integer> offset, Optional<DateSortDirection> direction);

}
