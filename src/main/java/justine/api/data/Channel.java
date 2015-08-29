package justine.api.data;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Provides information about a user's channel.
 * 
 * @author rduerig
 */
public class Channel {

	private final boolean mature;
	private final String status;
	// private final String broadcasterLanguage;
	private final String displayName;
	private final String game;
	// private final int delay;
	// private final String language;
	private final long id;
	// private final String name;
	// private final DateTime createdAt;
	// private final DateTime updatedAt;
	// private @Nullable
	// String logo;
	// private @Nullable
	// String banner;
	// private @Nullable
	// String videoBanner;
	// private @Nullable
	// String background;
	// private @Nullable
	// String profileBanner;
	// private final boolean partner;
	// private final String url;
	private final long views;
	private final long followers;

	// private final ChannelLinks links;
	// private @Nullable
	// String email;
	// private @Nullable
	// String streamKey;

	/**
	 * @param builder
	 */
	public Channel(Builder builder) {
		this.mature = checkNotNull(builder.mature);
		this.status = checkNotNull(builder.status);
		this.displayName = checkNotNull(builder.displayName);
		this.game = checkNotNull(builder.game);
		this.id = checkNotNull(builder.id);
		this.views = checkNotNull(builder.views);
		this.followers = checkNotNull(builder.followers);
	}

	/**
	 * @return the mature
	 */
	public boolean isMature() {
		return mature;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @return the game
	 */
	public String getGame() {
		return game;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the views
	 */
	public long getViews() {
		return views;
	}

	/**
	 * @return the followers
	 */
	public long getFollowers() {
		return followers;
	}

	static final class Builder {

		private boolean mature;
		private String status;
		// private String broadcasterLanguage;
		private String displayName;
		private String game;
		// private int delay;
		// private String language;
		private long id;
		// private String name;
		// private DateTime createdAt;
		// private DateTime updatedAt;
		// private @Nullable
		// String logo;
		// private @Nullable
		// String banner;
		// private @Nullable
		// String videoBanner;
		// private @Nullable
		// String background;
		// private @Nullable
		// String profileBanner;
		// private boolean partner;
		// private String url;
		private long views;
		private long followers;

		// private ChannelLinks links;
		// private @Nullable
		// String email;
		// private @Nullable
		// String streamKey;

		public Channel build() {
			return new Channel(this);
		}

		/**
		 * @param mature
		 *            the mature to set
		 * @return this builder for method chaining
		 */
		public Builder setMature(boolean mature) {
			this.mature = mature;
			return this;
		}

		/**
		 * @param status
		 *            the status to set
		 * @return this builder for method chaining
		 */
		public Builder setStatus(String status) {
			this.status = status;
			return this;
		}

		/**
		 * @param displayName
		 *            the displayName to set
		 * @return this builder for method chaining
		 */
		public Builder setDisplayName(String displayName) {
			this.displayName = displayName;
			return this;
		}

		/**
		 * @param game
		 *            the game to set
		 * @return this builder for method chaining
		 */
		public Builder setGame(String game) {
			this.game = game;
			return this;
		}

		/**
		 * @param id
		 *            the id to set
		 * @return this builder for method chaining
		 */
		public Builder setId(long id) {
			this.id = id;
			return this;
		}

		/**
		 * @param views
		 *            the views to set
		 * @return this builder for method chaining
		 */
		public Builder setViews(long views) {
			this.views = views;
			return this;
		}

		/**
		 * @param followers
		 *            the followers to set
		 * @return this builder for method chaining
		 */
		public Builder setFollowers(long followers) {
			this.followers = followers;
			return this;
		}

	}

}
