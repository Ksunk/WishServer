package main.model.elements;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wishes")
public class Wish {
    @Id @GeneratedValue             private int id;
    @Column(name = "title")         private String title;
    @Column(name = "description")   private String description;
    @Column(name = "date")          private Date date;
    @Column(name = "type_id")       private String typeId;
    @Column(name = "owner_id")      private int ownerId;
    @Column(name = "update_date")   private Date updateDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getTypeId() {
        return typeId;
    }
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}