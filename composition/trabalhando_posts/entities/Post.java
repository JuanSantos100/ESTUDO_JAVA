package entities;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {

    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.title = title;
        this.moment = moment;
        this.content = content;
        this.likes = likes;
    }

    public String getContent() {
        return content;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    public Date getMoment() {
        return moment;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Não colocar o método setComments para não receber uma nova lista como parâmetro
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: " + "\n");

        for (Comment c : comments) {
            sb.append(c.getText() + "\n");
        }

        return sb.toString();
    }
    

}
