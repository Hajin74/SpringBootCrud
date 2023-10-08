package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Article {
    @Id // 엔티티의 대표값 지정
    @GeneratedValue // 자동 생성 기능 추가
    private Long id;

    @Column // title 필드 선언
    private String title;

    @Column // content 필드 선언
    private String content;
}
