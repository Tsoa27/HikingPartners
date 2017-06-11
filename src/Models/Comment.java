package Models;

import java.util.Date;

/**
 * Created by Saba on 10.06.2017.
 */
public class Comment {
    private int commentID;
    private String comment;
    private User user;
    private Date date;
    private int likeNumber;

    /**
     * Constructor
     * @param commentID
     * @param comment
     * @param user
     * @param date
     */
    public Comment(int commentID, String comment, User user, Date date){
        this.commentID = commentID;
        this.comment = comment;
        this.user = user;
        this.date = date;
        this.likeNumber = 0;
    }

    /**
     * Increasing like numbers
     */
    public void likeIncrease(){
        likeNumber++;
    }

    /**
     * Decreasing like numbers
     */
    public void likeDecrease(){
        if(likeNumber > 0)
            likeNumber--;
    }

    /**
     * @return Like number
     */
    public int getLikeNUmber(){
        return likeNumber;
    }

    /**
     * @return Comment ID
     */
    public int getCommentID(){
        return commentID;
    }

    /**
     * @return Comment text
     */
    public String getComment(){
        return comment;
    }

    /**
     * @return Commenter User
     */
    public User getUser(){
        return user;
    }

    /**
     * @return Comment Date
     */
    public Date getDate(){
        return date;
    }
}