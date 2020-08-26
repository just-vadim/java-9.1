package ru.netology.domain;

public class Post {
    CommentsInfo commentsInfo = new CommentsInfo();
    LikesInfo likesInfo = new LikesInfo();
    RepostsInfo repostsInfo = new RepostsInfo();
    PostSource postSource = new PostSource();
    Geo geo = new Geo();
    private int postId;
    private int ownerId;
    private int fromId;
    private int createdId;
    private String postDate;
    private String postText;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String copyright;
    private String postType;
    private int singerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    // + get/set на все поля
}
