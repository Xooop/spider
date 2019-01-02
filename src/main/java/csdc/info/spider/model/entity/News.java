package csdc.info.spider.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News extends CreatableAndUpdatableEntity{
    private Integer id;
    private String title;
    private String content;
    private String filePath;
    private String author;
    private Integer isDeleted;
    private String type;
    private String subType;
}
