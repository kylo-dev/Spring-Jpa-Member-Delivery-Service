package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B") // 싱글 테이블에서 구분 값 설정
@Getter @Setter
public class Book extends Item{

    private String author;
    private String isbn;
}
