package site.licoded.starter.entity;

import java.util.Arrays;

public class SwaggerConfigEntity {
    private String title;
    private String description;
    private Concat contact;
    private String version;

    public SwaggerConfigEntity(String title, String description, Concat contact, String version) {
        this.title = title;
        this.description = description;
        this.contact = contact;
        this.version = version;
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

    public Concat getContact() {
        return contact;
    }

    public void setContact(Concat contact) {
        this.contact = contact;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "SwaggerConfigEntity{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", contact=" + contact +
                ", version='" + version + '\'' +
                '}';
    }
}
