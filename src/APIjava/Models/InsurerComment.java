package APIjava.Models;

import java.sql.Date;

public class InsurerComment {
    private int id;
    private int comentatorId;
    private int insurerId;
    private Date commentDate;
    private String comment;
    private double rating;

    private static final int INT_BY_DEFAULT = 0;
    private static final String STRING_BY_DEFAULT = "Non Defined";
    private static final Date DATE_BY_DEFAULT = new Date(System.currentTimeMillis());
    private static final double DOUBLE_BY_DEFAULT = 0.0;

    public InsurerComment () {
        this.id = INT_BY_DEFAULT;
        this.comentatorId = INT_BY_DEFAULT;
        this.insurerId = INT_BY_DEFAULT;
        this.commentDate = DATE_BY_DEFAULT;
        this.comment = STRING_BY_DEFAULT;
        this.rating = DOUBLE_BY_DEFAULT;
    }


    public InsurerComment(int id, int comentatorId, int insurerId, Date commentDate, String comment, double rating) {
        this.id = id;
        this.comentatorId = comentatorId;
        this.insurerId = insurerId;
        this.commentDate = commentDate;
        this.comment = comment;
        this.rating = rating;
    }

    public InsurerComment(int comentatorId, int insurerId, Date commentDate, String comment, double rating) {
        this.comentatorId = comentatorId;
        this.insurerId = insurerId;
        this.commentDate = commentDate;
        this.comment = comment;
        this.rating = rating;
    }

    public InsurerComment (InsurerComment comment) {
        this.id = comment.id;
        this.comentatorId = comment.comentatorId;
        this.insurerId = comment.insurerId;
        this.commentDate = comment.commentDate;
        this.comment = comment.comment;
        this.rating = comment.rating;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getComentatorId() {
        return this.comentatorId;
    }

    public void setComentatorId(int commentatorId) {
        this.comentatorId = commentatorId;
    }

    public int getInsurerId() {
        return this.insurerId;
    }

    public void setInsurerId(int insurerId) {
        this.insurerId = insurerId;
    }

    public Date getCommentDate() {
        return this.commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", commentatorId='" + getComentatorId() + "'" +
            ", insurerId='" + getInsurerId() + "'" +
            ", commentDate='" + getCommentDate() + "'" +
            ", comment='" + getComment() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }


}
