package com.test.LeskovsSubstitution.problem;

public abstract class SocialMedia {
	//support whatsapp, Facebook, Instagram
	public abstract void chatWithFriend();
	
	//support  Facebook, Instagram
	public abstract void publishPost(Object post);

	//support whatsapp, Facebook, Instagram
	public abstract void sendPhotosAndVideos();
	
	//support whatsapp, Facebook
	public abstract void groupVideoCall(String... users);
	
}
