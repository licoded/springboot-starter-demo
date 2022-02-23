package site.licoded.starter.configProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import site.licoded.starter.entity.Concat;

import java.util.Arrays;

@ConfigurationProperties(prefix = "licoded.swagger")
public class SwaggerConfigProperties {
    private String title = "XX项目接口文档";
    private String description = "XX项目描述";
    private Concat concat = new Concat("作者", "作者URL", "作者Email");
    private String version = "1.0";

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

    public Concat getConcat() {
        return concat;
    }

    public void setConcat(Concat concat) {
        this.concat = concat;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "SwaggerConfigProperties{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", concat=" + concat +
                ", version='" + version + '\'' +
                '}';
    }
}
