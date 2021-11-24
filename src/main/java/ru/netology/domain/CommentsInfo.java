package ru.netology.domain;

public class CommentsInfo {
    private String postId;                      //Идентификатор поста к которому создан комментарий
    private String activeTemplate;              //Активный шаблон отображения коментариев
    private String commentId;                   //Идентификатор комментария
    private String avatarUrl;                   //Ссылка на аватар в заголовке
    private String nameAndSurnameOfTheAuthor;   //Имя и фамилия автора в заголовке
    private String[] textMessage;               //Текст комментария
    private long dateAndTimeOfPublication;      //Дата и время публикации
    private int amountOfCommentLikes;           //Количество "лайков" комментария
    private boolean commentLike;                //Поставлен ли лайк комментарию
    private int amountOfCommentResponses;       //Количество ответных комментариев

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getActiveTemplate() {
        return activeTemplate;
    }

    public void setActiveTemplate(String activeTemplate) {
        this.activeTemplate = activeTemplate;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNameAndSurnameOfTheAuthor() {
        return nameAndSurnameOfTheAuthor;
    }

    public void setNameAndSurnameOfTheAuthor(String nameAndSurnameOfTheAuthor) {
        this.nameAndSurnameOfTheAuthor = nameAndSurnameOfTheAuthor;
    }

    public String[] getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String[] textMessage) {
        this.textMessage = textMessage;
    }

    public long getDateAndTimeOfPublication() {
        return dateAndTimeOfPublication;
    }

    public void setDateAndTimeOfPublication(long dateAndTimeOfPublication) {
        this.dateAndTimeOfPublication = dateAndTimeOfPublication;
    }

    public int getAmountOfCommentLikes() {
        return amountOfCommentLikes;
    }

    public void setAmountOfCommentLikes(int amountOfCommentLikes) {
        this.amountOfCommentLikes = amountOfCommentLikes;
    }

    public boolean isCommentLike() {
        return commentLike;
    }

    public void setCommentLike(boolean commentLike) {
        this.commentLike = commentLike;
    }

    public int getAmountOfCommentResponses() {
        return amountOfCommentResponses;
    }

    public void setAmountOfCommentResponses(int amountOfCommentResponses) {
        this.amountOfCommentResponses = amountOfCommentResponses;
    }
}
