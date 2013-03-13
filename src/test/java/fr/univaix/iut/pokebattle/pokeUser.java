package fr.univaix.iut.pokebattle;

import java.net.URL;
import java.util.Date;

import twitter4j.RateLimitStatus;
import twitter4j.Status;
import twitter4j.User;

public class pokeUser implements User{

	public String getScreenName(){
		return "PaulMista";
	}
	public String getDescription(){
		return "#pokebattle - #pokemon - Owner: @PaulMista";
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getAccessLevel() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public RateLimitStatus getRateLimitStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Date getCreatedAt() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getFavouritesCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getFollowersCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getFriendsCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getLang() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getListedCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getProfileBackgroundColor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getProfileBackgroundImageUrl() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getProfileBackgroundImageUrlHttps() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public URL getProfileImageURL() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public URL getProfileImageUrlHttps() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getProfileLinkColor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getProfileSidebarBorderColor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getProfileSidebarFillColor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getProfileTextColor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Status getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getStatusesCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getTimeZone() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public URL getURL() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getUtcOffset() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isContributorsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isFollowRequestSent() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isGeoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isProfileBackgroundTiled() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isProfileUseBackgroundImage() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isProtected() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isShowAllInlineMedia() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isTranslator() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isVerified() {
		// TODO Auto-generated method stub
		return false;
	}
}
