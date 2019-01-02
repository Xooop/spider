package csdc.info.spider.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CreatableAndUpdatableEntity {
    private Date created;
    private Date updated;
}
